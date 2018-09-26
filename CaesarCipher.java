import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter message: ");
        String msg = scan.next();

        System.out.println("Enter code word: ");
        String codeWord = scan.next();
    
        for (int letter = 0, codeLetter = 0; letter != msg.length(); letter++, codeLetter++) {
            // the for loop initilizes 2 counters, one for the message and the other for the code word
            if (codeLetter == codeWord.length()) {
                // the codeword is repeated letter by letter trailing the msg
                codeLetter = 0;
            }
            int shift = (int) codeWord.charAt(codeLetter) - 96;
            // figures out how much to shift by in the alphabet from values 1-26

            int newLetter= (int) msg.charAt(letter) + shift;
            // figures out new letter for the msg corresponding to the shift amount

            System.out.print((char) newLetter);
        }
    }
}