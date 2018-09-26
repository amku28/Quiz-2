import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Message: ");
        //zoo
        //crr
        String msg = scan.next();

        System.out.println("Enter amount to shift: ");
        int shift = scan.nextInt();

        for (int letter = 0; letter != msg.length(); letter++) {
            int newLetter = (int) msg.charAt(letter) + shift;

            if (newLetter > 122) {
                newLetter = 96 + shift;
            }
            System.out.print((char) newLetter);
        }
        
    }
}