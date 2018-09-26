import java.lang.Math;

public class Thrice1000 {
    public static void main(String[] args) {
        double avg = 0;

        for (int turn = 1; turn <= 1000; turn ++) {
            // round 1
            double count = 1;
            int dice1 = (int) (Math.random()*6 + 1);
            int dice2 = (int) (Math.random()*6 + 1);
            int dice3 = (int) (Math.random()*6 + 1);
            int value = dice1 + dice2 + dice3;
            double tally = value;

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
            for (count = 1; count <= tripletWorth; count++) {
                dice1 = (int) (Math.random()*6 + 1); 
                dice2 = (int) (Math.random()*6 + 1);
                dice3 = (int) (Math.random()*6 + 1);
                value = dice1 * dice2 * dice3;
                tally = tally + value;
            }

            // round 3
            count = 0;
            while ((dice1 != dice2 && dice2 != dice3)) {
                dice1 = (int) (Math.random()*6 + 1); 
                dice2 = (int) (Math.random()*6 + 1);
                dice3 = (int) (Math.random()*6 + 1);

                tally = tally + (Math.pow(3, count));
                count++;
            }

            if (dice1 == tripletWorth) {
                tally = tally * 3;
            } else {
                tally = dice1;
            }

            avg = avg + tally;
            System.out.println("After turn " + turn + " your tally is " + tally);
        }

        avg = avg / 1000;
        System.out.println("The average tally for 1000 turns is " + avg);

    }
}