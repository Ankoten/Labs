import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        //  путь к файлу
        String filePath = "text.txt";
        // создаем объект File
        File file = new File(filePath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // создаем объект Map для хранения слов и их количества
        Map<String, Integer> wordCountMap = new HashMap<>();
        // читаем файл по словам и добавляем их в Map
        while (scanner.hasNext()) {
            String word = scanner.next();
            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
            if (word.length() > 0) {
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }
        scanner.close();
        //  список из элементов Map
        List<Map.Entry<String, Integer>> wordList = new LinkedList<>(wordCountMap.entrySet());
        // сортируем список по убыванию количества повторений
        Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        //  топ-10 слов
        for (int i = 0; i < 10 && i < wordList.size(); i++) {
            System.out.println(wordList.get(i).getKey() + " - " + wordList.get(i).getValue() + " times");
        }
    }
}
