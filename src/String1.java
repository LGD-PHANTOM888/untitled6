import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine();
        String[] parts = sentence.split(" ");
        int Count = 0;
        for (int i = 0; i < parts.length; i++) {
            if (!parts[i].equals("")) {
                Count++;
            }
        }
        int Count1 = 0;
        String symbols = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (symbols.indexOf(c) != -1) {
                Count1++;
            }
        }
        String mod = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                mod += "-";
            } else {
                mod += c;
            }
        }
        System.out.println("Количество слов: " + Count);
        System.out.println("Количество гласных: " + Count1);
        System.out.println("Изменённое предложение: " + mod);
    }
}
