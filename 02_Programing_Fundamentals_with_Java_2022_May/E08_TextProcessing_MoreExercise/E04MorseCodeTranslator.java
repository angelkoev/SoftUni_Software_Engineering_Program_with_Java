package E08_TextProcessing_MoreExercise;

import java.util.Scanner;

public class E04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
            String textToCompare = text[i];
            switch (text[i]) {
                case ".-":
                    result.append("A");
                    break;
                case "-...":
                    result.append("B");
                    break;
                case "-.-.":
                    result.append("C");
                    break;
                case "-..":
                    result.append("D");
                    break;
                case ".":
                    result.append("E");
                    break;
                case "..-.":
                    result.append("F");
                    break;
                case "--.":
                    result.append("G");
                    break;
                case "....":
                    result.append("H");
                    break;
                case "..":
                    result.append("I");
                    break;
                case ".---":
                    result.append("J");
                    break;
                case "-.-":
                    result.append("K");
                    break;
                case ".-..":
                    result.append("L");
                    break;
                case "--":
                    result.append("M");
                    break;
                case "-.":
                    result.append("N");
                    break;
                case "---":
                    result.append("O");
                    break;
                case ".--.":
                    result.append("P");
                    break;
                case "--.-":
                    result.append("Q");
                    break;
                case ".-.":
                    result.append("R");
                    break;
                case "...":
                    result.append("S");
                    break;
                case "-":
                    result.append("T");
                    break;
                case "..-":
                    result.append("U");
                    break;
                case "...-":
                    result.append("V");
                    break;
                case ".--":
                    result.append("W");
                    break;
                case "-..-":
                    result.append("X");
                    break;
                case "-.--":
                    result.append("Y");
                    break;
                case "--..":
                    result.append("Z");
                    break;
                case "|":
                    result.append(" ");
                    break;

            }
        }

        System.out.println(result);
    }
}
