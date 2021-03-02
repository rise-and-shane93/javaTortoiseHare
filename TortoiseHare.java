import java.lang.Math;

public class TortoiseHare {
    public static void main(String[] args) {

        // Generates a random number between 1 and 10
        int randomNumber = 0;

        int numPositions = 2;

        for (int i = 1; i <= numPositions; i++) {
            randomNumber = (int) ( 10 * Math.random() ) + 1;
            // System.out.println(randomNumber);
            moveRacers(randomNumber);
        }

    }

    public static void moveRacers(int num) {

        int tortoiseInitPosition = 1;
        int hareInitPosition = 1;
        String message = "";

        if (num >= 1 || num <= 5) {
            tortoiseInitPosition += 3;
        } else if (num >= 6 || num <= 8) {
            tortoiseInitPosition += 1;
        } else if (num >= 9 || num <= 10) {
            if (tortoiseInitPosition <= 6) {
                tortoiseInitPosition = 1; 
            } else {
                tortoiseInitPosition -= 6;
            }
        }

        if (num >= 1 || num <= 2) {
            hareInitPosition += 9;
        } else if (num >= 3 || num <= 5) {
            hareInitPosition += 1;
        } else if (num == 6) {
            if (hareInitPosition <= 12) {
                hareInitPosition = 1;
            } else {
                hareInitPosition -= 12;
            }
        } else if (num >= 7 || num <= 8) {
            if (hareInitPosition <= 2) {
                hareInitPosition = 1;
            } else {
                hareInitPosition -= 2;
            }
        } else if (num >= 9 || num <= 10) {
            // fall asleep
        }

        // System.out.println(tortoiseInitPosition);
        // System.out.println(hareInitPosition);
        displayProgress(tortoiseInitPosition, "T");
        displayProgress(hareInitPosition, "H");
        System.out.println("\n");
    }

    public static void displayProgress(int animalPosition, String animal/*, String update*/) {

        System.out.println(animalPosition);

        for (int i = 1; i <= animalPosition; i++) {
            for (int j = 1; j <= i; j++) {
                if (animal == "T") {
                    System.out.print("T");
                } else if (animal == "H") {
                    System.out.print("H");
                }
            }
        }
        System.out.print("\n");
    }

}