import java.util.*;

class Bike {
    private int id;
    private int qty;
    private String name;
    private int price;

    public Bike(int id, int qty, String name, int price) {
        this.id = id;
        this.qty = qty;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bike[] arr = new Bike[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            String c = sc.nextLine();
            int d = sc.nextInt();
            arr[i] = new Bike(a, b, c, d);
        }
        sc.nextLine(); // consume leftover newline
        String k = sc.nextLine();

        Bike max = findMaxPriceOfBike(arr);
        if (max != null) {
            System.out.println("id-" + max.getId());
            System.out.println("quantity-" + max.getQty());
            System.out.println("name-" + max.getName());
            System.out.println("price-" + max.getPrice());
        } else {
            System.out.println("No Bike found with mentioned attribute");
        }

        Bike res = searchBikeByName(arr, k);
        if (res != null) {
            System.out.println("id-" + res.getId());
            System.out.println("quantity-" + res.getQty());
            System.out.println("name-" + res.getName());
            System.out.println("price-" + res.getPrice());
        } else {
            System.out.println("No Bike found with mentioned attribute");
        }

        sc.close();
    }

    public static Bike findMaxPriceOfBike(Bike[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        Bike m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].getPrice() > m.getPrice()) {
                m = a[i];
            }
        }
        return m;
    }

    public static Bike searchBikeByName(Bike[] a, String n) {
        for (Bike b : a) {
            if (b.getName().equalsIgnoreCase(n)) {
                return b;
            }
        }
        return null;
    }
}
