import java.util.*;

class Grain {
    private int grainId;
    private String grainName;
    private String state;
    private int qtyInQuintal;

    public Grain(int grainId, String grainName, String state, int qtyInQuintal) {
        this.grainId = grainId;
        this.grainName = grainName;
        this.state = state;
        this.qtyInQuintal = qtyInQuintal;
    }

    public int getGrainId() {
        return grainId;
    }

    public String getGrainName() {
        return grainName;
    }

    public String getState() {
        return state;
    }

    public int getQtyInQuintal() {
        return qtyInQuintal;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Grain[] arr = new Grain[t];

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();      // grainId
            sc.nextLine();             // consume newline
            String b = sc.nextLine();  // grainName
            String c = sc.nextLine();  // state
            int d = sc.nextInt();      // qtyInQuintal
            sc.nextLine();             // consume newline

            arr[i] = new Grain(a, b, c, d);
        }

        String provideName = sc.nextLine();

        int count = countGrainByGivenName(arr, provideName);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No Grains with matching names are found");
        }

        Grain minGrain = getMinGrainFromMaharashtra(arr);
        if (minGrain != null) {
            System.out.println(minGrain.getGrainId());
            System.out.println(minGrain.getGrainName());
            System.out.println(minGrain.getState());
            System.out.println(minGrain.getQtyInQuintal());
        } else {
            System.out.println("No Grains with matching names are found");
        }

        sc.close();
    }

    public static int countGrainByGivenName(Grain[] a, String n) {
        int c = 0;
        for (Grain g : a) {
            if (g.getGrainName().equalsIgnoreCase(n)) {
                c++;
            }
        }
        return c;
    }

    public static Grain getMinGrainFromMaharashtra(Grain[] a) {
        Grain result = null;
        for (Grain g : a) {
            if (g.getState().equalsIgnoreCase("Maharashtra")) {
                if (result == null || g.getQtyInQuintal() < result.getQtyInQuintal()) {
                    result = g;
                }
            }
        }
        return result;
    }
}

