package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public static void main(String[] args) {
        Map<String, Integer> forPrinting = new WordRepetitionMapCreator().createWordRepetitionMap("");

        for (Map.Entry<String, Integer> entrySet : forPrinting.entrySet()) {
            System.out.println(entrySet.getKey() + " " + entrySet.getValue());
        }
    }

    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] splitSentence = sentence.split("[ .,]+");
        Map<String, Integer> result = new HashMap<>();
        for (String s : splitSentence) {
            if (!result.containsKey(s.toLowerCase()) && sentence.length() > 0) {
                result.put(s.toLowerCase(), 1);
            } else {
                result.computeIfPresent(s.toLowerCase(), (key, val) -> val = val + 1);
            }
        }
        return result;
    }
}
