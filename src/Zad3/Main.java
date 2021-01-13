package Zad3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int p = 2;
        int numberDays = 3;
        int wordsToLearn = 2;
        int numberForgottenWords = 2;
        int numberLearnDays = 10;
        int currentDay = 1;

        List<String> words = null;
        try (Stream<String> lines = Files.lines(Paths.get("slowa.txt"))) {
            words = lines.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        LinkedList<String> newWords = new LinkedList<>();
        LinkedList<String> oldWords = new LinkedList<>();
        ArrayList<String> forgottenWords = new ArrayList<>();

        while (currentDay <= numberLearnDays) {

            for (int i = 0; i < wordsToLearn; i++)
                newWords.add(words.remove(random.nextInt(words.size())));

            if (currentDay > numberDays) {
                for (int i = 0; i < numberForgottenWords; i++)
                    oldWords.add((newWords.remove(0)));
            }

            if (oldWords.size() > 0) {
                int temp;
                for (int i = 0; i < numberForgottenWords && oldWords.size() > 0; i++) {
                    temp = random.nextInt(oldWords.size());

                    if (random.nextInt(p) == 0)
                        forgottenWords.add(oldWords.remove(temp));
                }
            }
            System.out.println("Day " + currentDay);
            System.out.println("New words: " + newWords.get(newWords.size() - 2) + " " + newWords.get(newWords.size() - 1));

            StringBuilder sb = constructString(1, forgottenWords);
            System.out.println("Forgotten words: " + sb);

            StringBuilder sb2 = constructString(2, newWords, oldWords);
            System.out.println("All words: " + sb2 + "\n\n");

            for (int i = 0; i < forgottenWords.size(); i++)
                words.add(forgottenWords.remove(0));

            currentDay++;
        }
    }

    static StringBuilder constructString(int howMany, List<String>... args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < howMany; i++) {
            for (String s : args[i]) {
                sb.append(s);
                sb.append(" ");
            }
        }
        return sb;
    }
}
