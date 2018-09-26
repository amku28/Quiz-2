import java.lang.Math;
import java.util.Scanner;

public class ThriceTurn {
    public static void main(String[] args) {
        // round 1
        // count 1
        double count = 1;
        int dice1 = (int) (Math.random()*6 + 1);
        int dice2 = (int) (Math.random()*6 + 1);
        int dice3 = (int) (Math.random()*6 + 1);
        int value = dice1 + dice2 + dice3;
        double tally = value;

        // count 2....
        while (dice1 != dice2 && dice2 != dice3) {
            count++;
            dice1 = (int) (Math.random()*6 + 1); 
            dice2 = (int) (Math.random()*6 + 1);
            dice3 = (int) (Math.random()*6 + 1);
            value = dice1 + dice2 + dice3;

            if (count % 3 == 0) {
                tally = tally - value;
            } else {
                tally = tally + value;
            }
        }

        // round 2
        int tripletWorth = dice1;
        // sets the triplet from round 1
        for (count = 1; count <= tripletWorth; count++) {
            dice1 = (int) (Math.random()*6 + 1); 
            dice2 = (int) (Math.random()*6 + 1);
            dice3 = (int) (Math.random()*6 + 1);
            value = dice1 * dice2 * dice3;
            tally = tally + value;
        }

        // round 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to retire? (1-yes or 2-no)your current tally is " + tally);
        int retire = scan.nextInt();
        count = 0;
        while ((dice1 != dice2 && dice2 != dice3) || (retire != 1)) {
            dice1 = (int) (Math.random()*6 + 1); 
            dice2 = (int) (Math.random()*6 + 1);
            dice3 = (int) (Math.random()*6 + 1);

            tally = tally + (Math.pow(3, count));
            count++;
            System.out.println("Do you want to retire? (1-yes or 2-no) your current tally is " + tally);
            retire = scan.nextInt();
        }

        if (dice1 == tripletWorth) {
            tally = tally * 3;
        } else {
            tally = dice1;
        }

        System.out.println("Your current talley after turn is: " + tally);

    }
}