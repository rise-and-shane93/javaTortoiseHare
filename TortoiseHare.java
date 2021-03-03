import java.lang.Math;

public class TortoiseHare {
    public static void main(String[] args) {

        // Generates a random number between 1 and 10
        int randomNumber = 0;

        int numPositions = 50;

        int tortoiseInitPosition = 1;
        int hareInitPosition = 1;

        System.out.println("\nAND THEY'RE OFF!!\n");

        for (int i = 1; i <= numPositions; i++) {
            randomNumber = (int) ( 10 * Math.random() ) + 1;
            tortoiseInitPosition = moveTortoise(randomNumber, tortoiseInitPosition);
            hareInitPosition = moveHare(randomNumber, hareInitPosition);
            displayProgress(tortoiseInitPosition, "T");
            displayProgress(hareInitPosition, "H");

            if (tortoiseInitPosition == hareInitPosition) {
                System.out.println("OUCH!!");
            }

            System.out.println("\n");
        }

        if (tortoiseInitPosition > hareInitPosition) {
            System.out.println("TORTOISE WINS!!\n");
        } else if (tortoiseInitPosition < hareInitPosition) {
            System.out.println("HARE WINS!!\n");
        } else if (tortoiseInitPosition == hareInitPosition) {
            System.out.println("IT'S A TIE!!\n");
        }

    }

    public static int moveTortoise(int num, int tortoisePosition/*, int harePosition*/) {

        int tortoiseInitPosition = tortoisePosition;
        String message = "";

        if (num >= 1 && num <= 5) {
            tortoiseInitPosition += 3;
        } else if (num >= 6 && num <= 8) {
            tortoiseInitPosition += 1;
        } else if (num >= 9 && num <= 10) {
            if (tortoiseInitPosition <= 6) {
                tortoiseInitPosition = 1; 
            } else {
                tortoiseInitPosition -= 6;
            }
        }

        // displayProgress(tortoiseInitPosition, "T");
        // displayProgress(hareInitPosition, "H");
        return tortoiseInitPosition;

    }

    public static int moveHare(int num, int harePosition) {
        int hareInitPosition = harePosition;

        if (num >= 1 && num <= 2) {
            hareInitPosition += 9;
        } else if (num >= 3 && num <= 5) {
            hareInitPosition += 1;
        } else if (num == 6) {
            if (hareInitPosition <= 12) {
                hareInitPosition = 1;
            } else {
                hareInitPosition -= 12;
            }
        } else if (num >= 7 && num <= 8) {
            if (hareInitPosition <= 2) {
                hareInitPosition = 1;
            } else {
                hareInitPosition -= 2;
            }
        } else if (num >= 9 && num <= 10) {
            // fall asleep
        }

        return hareInitPosition;
    }

    public static void displayProgress(int animalPosition, String animal/*, String update*/) {

        for (int i = 1; i <= animalPosition; i++) {
            if (animal == "T") {
                System.out.print("T");
            } else if (animal == "H") {
                System.out.print("H");
            }
        }
        System.out.print("\n");
    }

}