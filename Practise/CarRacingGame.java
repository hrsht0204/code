import java.util.Scanner;

public class CarRacingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Car Racing Game!");
        System.out.println("Press Enter to start the race.");
        scanner.nextLine();

        int playerPosition = 0;
        int opponentPosition = 0;
        final int finishLine = 50;

        while (playerPosition < finishLine && opponentPosition < finishLine) {
            System.out.println("Press Enter to accelerate your car.");
            scanner.nextLine();

            // Generate random distances for opponent
            int opponentMove = (int) (Math.random() * 5) + 1;

            // Update positions
            playerPosition += accelerate();
            opponentPosition += opponentMove;

            // Print the race track
            printRaceTrack(playerPosition, opponentPosition, finishLine);

            try {
                Thread.sleep(500); // Pause for 0.5 seconds between moves
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Determine the winner
        if (playerPosition >= finishLine && opponentPosition >= finishLine) {
            System.out.println("\nIt's a tie!");
        } else if (playerPosition >= finishLine) {
            System.out.println("\nCongratulations! You won the race!");
        } else {
            System.out.println("\nSorry, you lost the race. Try again!");
        }

        scanner.close();
    }

    public static int accelerate() {
        return (int) (Math.random() * 5) + 1; // Random acceleration between 1 and 5
    }

    public static void printRaceTrack(int playerPosition, int opponentPosition, int finishLine) {
        // ASCII art for the race track and cars
        String road = "=======================================================================================================";
        StringBuilder playerCar = new StringBuilder();
        StringBuilder opponentCar = new StringBuilder();
        for (int i = 0; i < finishLine; i++) {
            if (i == playerPosition) {
                playerCar.append("P");
            } else {
                playerCar.append(" ");
            }
            if (i == opponentPosition) {
                opponentCar.append("O");
            } else {
                opponentCar.append(" ");
            }
        }

        // Print the race track with cars
        System.out.println();
        System.out.println(road);
        System.out.println(playerCar + "|" + opponentCar);
        System.out.println(road);
    }
}
