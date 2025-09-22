


import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        
        // Scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.println("-------- ASHESI PREMIER LEAGUE - PLAYER SELECTION --------");
        System.out.println();

        //  Collect player information
        System.out.println("Enter player name: ");
        String playerName = input.nextLine();

        System.out.println("Enter player age: ");
        int playerAge = input.nextInt();

        System.out.println("Enter player height in meters (m): ");
        float playerHeight = input.nextFloat();

        System.out.println("Enter player weight in pounds (lb): ");
        float playerWeight = input.nextFloat();

        System.out.println("Enter jersey number: ");
        int jerseyNum = input.nextInt();

        //  Conversions
        final double POUND = 0.45359237; // 1 pound = 0.45359237 kg
        final int METER = 100;           // 1 meter = 100 cm

        double weightKg = playerWeight * POUND;   // convert to kg
        int weightKgInt = (int) weightKg;         // cast to int (drop decimals)
        int heightCm = (int) (playerHeight * METER); // convert to cm

        // Show original details
        System.out.println("\n--- Player Details ---");
        System.out.println("Player Name: " + playerName);
        System.out.println("Age: " + playerAge);
        System.out.println("Height: " + playerHeight + " m (" + heightCm + " cm)");
        System.out.println("Weight: " + playerWeight + " lbs (" + weightKgInt + " kg)");
        System.out.println("Jersey Number: " + jerseyNum);

        // Increment / Decrement
        System.out.println("\n--- After Season Simulation ---");
        System.out.println("Age before: " + playerAge);
        playerAge++; // increase by 1
        System.out.println("Age after ++ : " + playerAge);

        System.out.println("Jersey number before: " + jerseyNum);
        jerseyNum--; // decrease by 1
        System.out.println("Jersey number after -- : " + jerseyNum);

        //  Eligibility check
        boolean eligible;
        if (playerAge >= 18 && playerAge <= 35 && weightKgInt < 90) {
            eligible = true;
            System.out.println("Eligible");
        } else {
            eligible = false;
            System.out.println("Not Eligible");
        }

        // Step 6: Age category
        String category;
        if (playerAge < 20) {
            category = "Rising Star";
        } else if (playerAge <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }
        System.out.println("Category: " + category);

        // Position using switch
        String position;
        switch (jerseyNum) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player position not found";
        }
        System.out.println("Position: " + position);

        //  Nested if (lineup decision)
        String lineupDecision;
        if (playerAge >= 20 && playerAge <= 30) {  // Prime Player check
            if (weightKgInt < 80) {
                lineupDecision = "Player is in the starting line up.";
            } else {
                lineupDecision = "Player should be on bench.";
            }
        } else {
            lineupDecision = "Not a Prime Player (player on bench)";
        }
        System.out.println("Lineup Decision: " + lineupDecision);

        // Final Decision with ternary operator
        String finalStatus = eligible ? "Play" : "Rest";
        System.out.println("Final Decision: " + finalStatus);

        
        System.out.println("\n=== PLAYER REPORT ===");
        System.out.println("Name: " + playerName);
        System.out.println("Age: " + playerAge + " (" + category + ")");
        System.out.println("Height: " + heightCm + " cm");
        System.out.println("Weight: " + weightKgInt + " kg");
        System.out.println("Jersey: " + jerseyNum);
        System.out.println("Position: " + position);
        System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalStatus);
        System.out.println("============================");

        
        input.close();
    }
}
