import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football_cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> teamGoals = new HashMap<>();

        // Read and process each goal
        for (int i = 0; i < n; i++) {
            String team = sc.nextLine();
            teamGoals.put(team, teamGoals.getOrDefault(team, 0) + 1);
        }

        // Find the team with the maximum goals
        String winningTeam = "";
        int maxGoals = 0;
        for (Map.Entry<String, Integer> entry : teamGoals.entrySet()) {
            if (entry.getValue() > maxGoals) {
                maxGoals = entry.getValue();
                winningTeam = entry.getKey();
            }
        }

        // Print the winning team
        System.out.println(winningTeam);
    }
}
