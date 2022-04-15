import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*
    Developer has written this function and the Task of the QA is to test
    this function
     */
    public Integer returnMaxWordOccurence(String sentence) {
        String[] words = sentence.split("\\s+");
        List<String> wordList = Arrays.asList(words).stream().map(word -> word.toLowerCase())
                .collect(Collectors.toList());
        Map<String, Integer> map = new HashMap<>();
        for (String word : wordList) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
        return map.values().stream().max(Integer::compare).get();
    }

}
