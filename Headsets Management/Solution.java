import java.util.*;

class HeadSets {
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public void setHeadsetName(String headsetName) {
        this.headsetName = headsetName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getHeadsetName() {
        return headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public boolean getAvailable() {
        return available;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HeadSets[] arr = new HeadSets[t];

        for (int i = 0; i < arr.length; i++) {
            String headsetName = sc.nextLine();
            String brand = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            boolean available = Boolean.parseBoolean(sc.nextLine());

            arr[i] = new HeadSets(headsetName, brand, price, available);
        }

        String j = sc.nextLine();
        int result = findTotalPriceForGivenBrand(arr, j);

        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println("No Headsets available with the given brand");
        }

        HeadSets hs = findAvailableHeadsetWithSecondMinPrice(arr);

        if (hs != null) {
            System.out.println(hs.getHeadsetName());
            System.out.println(hs.getPrice());
        } else {
            System.out.println("No Headsets available");
        }
    }

    public static int findTotalPriceForGivenBrand(HeadSets[] arr, String b) {
        int tp = 0;
        for (HeadSets i : arr) {
            if (i.getBrand().equalsIgnoreCase(b)) {
                tp += i.getPrice();
            }
        }
        return tp;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // First pass: find minimum price among available headsets
        for (HeadSets i : arr) {
            if (i.getAvailable() && i.getPrice() < first) {
                first = i.getPrice();
            }
        }

        // Second pass: find second minimum price among available headsets
        for (HeadSets i : arr) {
            if (i.getAvailable() && i.getPrice() > first && i.getPrice() < second) {
                second = i.getPrice();
            }
        }

        if (second == Integer.MAX_VALUE) {
            return null; // second min not found
        }

        // Third pass: return the actual HeadSets object with second min price
        for (HeadSets i : arr) {
            if (i.getAvailable() && i.getPrice() == second) {
                return i;
            }
        }

        return null; // fallback, shouldn't reach here
    }
}
