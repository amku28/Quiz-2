import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter message: ");
        String msg = scan.next();

        System.out.println("Enter code word: ");
        String codeWord = scan.next();

        //hello
        //ab
        //igmnp

        // for (int letter = 0; letter != codeWord.length(); letter++) {
            int shift = (int) codeWord.charAt(0) - 96;

            System.out.println(shift);

            System.out.println((char) 105);
        // }

        // if (newLetter > 26) {
        //     newLetter =  + shift;
        // }
        // System.out.println(shift);
        // System.out.print((char) newLetter);
        
    }
}