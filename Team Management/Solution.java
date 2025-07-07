import java.util.*;

class Team {
    private int teamID;
    private String teamName;
    private String location;
    private int totalRunsByTeam;
    private int numberOfWicketsInTeam;

    // Constructor
    public Team(int teamID, String teamName, String location, int totalRunsByTeam, int numberOfWicketsInTeam) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.location = location;
        this.totalRunsByTeam = totalRunsByTeam;
        this.numberOfWicketsInTeam = numberOfWicketsInTeam;
    }

    // Getters and Setters
    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalRunsByTeam() {
        return totalRunsByTeam;
    }

    public void setTotalRunsByTeam(int totalRunsByTeam) {
        this.totalRunsByTeam = totalRunsByTeam;
    }

    public int getNumberOfWicketsInTeam() {
        return numberOfWicketsInTeam;
    }

    public void setNumberOfWicketsInTeam(int numberOfWicketsInTeam) {
        this.numberOfWicketsInTeam = numberOfWicketsInTeam;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Team[] arr = new Team[4];

        // Input team details
        for (int i = 0; i < 4; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String location = sc.nextLine();
            int runs = Integer.parseInt(sc.nextLine());
            int wickets = Integer.parseInt(sc.nextLine());

            arr[i] = new Team(id, name, location, runs, wickets);
        }

        // Read user input
        String inputLocation = sc.nextLine();
        int inputWickets = Integer.parseInt(sc.nextLine());

        // Find and print result
        int result = teamWithHighestRuns(arr, inputLocation, inputWickets);
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println("No any resort");
        }

        sc.close();
    }

    public static int teamWithHighestRuns(Team[] arr, String location, int k) {
        int maxRuns = 0;

        for (Team t : arr) {
            if (t.getLocation().equalsIgnoreCase(location) && t.getNumberOfWicketsInTeam() > k) {
                if (t.getTotalRunsByTeam() > maxRuns) {
                    maxRuns = t.getTotalRunsByTeam();
                }
            }
        }

        return maxRuns;
    }
}
