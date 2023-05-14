package E08_TextProcessing_Exercise;

import java.util.Scanner;

public class E03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int fileNameIndex = text.lastIndexOf("\\");
        int extensionIndex = text.lastIndexOf(".");

        System.out.printf("File name: %s%n", text.substring(fileNameIndex + 1, extensionIndex));
        System.out.printf("File extension: %s%n", text.substring(extensionIndex + 1));

    }
}
