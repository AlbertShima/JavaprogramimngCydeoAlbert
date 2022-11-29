package day09_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
        char character = '_';
        if (character >= 32 && character <= 47 || character >= 58 && character <= 64
                || character >= 91 && character <= 96 || character >= 123 && character <= 126) {
            System.out.println("special character");
        } else if (character >= 48 && character <= 57) {
            System.out.println("digit");
        } else if (character >= 65 && character <= 90 || character >= 97 && character <= 122) {
            System.out.println("Alphabetic Character");
        }
    }
}
