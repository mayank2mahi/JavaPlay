import java.util.*;

class Resort {
    private int resortid;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortid, String resortName, String category, double price, double rating) {
        this.resortid = resortid;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public int getResortid() { return resortid; }
    public String getResortName() { return resortName; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }

    public void setResortid(int resortid) { this.resortid = resortid; }
    public void setResortName(String resortName) { this.resortName = resortName; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(double price) { this.price = price; }
    public void setRating(double rating) { this.rating = rating; }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort[] arr = new Resort[4];
        
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double rate = sc.nextDouble();
            sc.nextLine();
            arr[i] = new Resort(id, name, category, price, rate);
        }

        String s = sc.nextLine();
        int result = findAvgPriceByCategory(arr, s);

        if (result == 0) {
            System.out.println("There are no such available resort");
        } else {
            System.out.println("Average price of the " + s + " Resort: " + result);
        }
    }

    public static int findAvgPriceByCategory(Resort[] arr, String cate) {
        double total = 0;
        int count = 0;

        for (Resort r : arr) {
            if (r.getCategory().equalsIgnoreCase(cate) && r.getRating() > 4) {
                total += r.getPrice();
                count++;
            }
        }

        if (count > 0) {
            return (int)(total / count);
        } else {
            return 0;
        }
    }
}
