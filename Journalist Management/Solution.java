import java.util.Scanner;

class Journalist {
    private int id;
    private String name;
    private int experience;
    private String region;

    // Parameterized constructor
    public Journalist(int id, String name, int experience, String region) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.region = region;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getRegion() {
        return region;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // clear the newline

        Journalist[] journalists = new Journalist[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // clear the newline
            String name = sc.nextLine();
            int experience = sc.nextInt();
            sc.nextLine(); // clear the newline
            String region = sc.nextLine();
            arr[i] = new Journalist(id, name, experience, region);
        }

        String searchRegion = sc.nextLine();
        int searchId = sc.nextInt();

        double avgExp = findAverageExperienceByRegion(arr, searchRegion);
        if (avgExp > 0) {
            System.out.println("Average experience: " + avgExp);
        } else {
            System.out.println("No Journalist found from the given region.");
        }

        Journalist result = searchJournalistById(arr, searchId);
        if (result != null) {
            System.out.println("id-" + result.getId());
            System.out.println("name-" + result.getName());
            System.out.println("experience-" + result.getExperience());
            System.out.println("region-" + result.getRegion());
        } else {
            System.out.println("No Journalist found with the given id.");
        }
    }

    public static double findAverageExperienceByRegion(Journalist[] arr, String s) {
        int sum = 0;
        int count = 0;
        for (Journalist j : arr) {
            if (j.getRegion().equalsIgnoreCase(s)) {
                sum += j.getExperience();
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }

    public static Journalist searchJournalistById(Journalist[] arr, int id) {
        for (Journalist j : arr) {
            if (j.getId() == id) {
                return j;
            }
        }
        return null;
    }
}
