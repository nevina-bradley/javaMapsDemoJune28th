package com.codedifferently.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void count(List<String> words) {
        Map<Character, List<String>> wordMap = new HashMap<>(); //make a hashmap called wordMap
        for (int x = 0; x < words.size(); x++) { //iterate through list of strings called words
            String word = words.get(x);
            Character firstLetter = word.charAt(0);
            if (wordMap.containsKey(firstLetter)) {
                wordMap.get(firstLetter).add(word);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(word);
                wordMap.put(firstLetter, newList);
            }
        }

        for (Map.Entry<Character, List<String>> entry : wordMap.entrySet()) {
            Character key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key + " " + value.size());
        }
    }

    public static void main(String[] args) {
        try {
            List<String> words = new ArrayList<>(); //creates new list of strings
            Files.lines(Paths.get("input.txt")) //reads the input.txt file
                    .map(line -> line.split(",")) //.map() grabs each line and splits it
                    .flatMap(Arrays::stream)
                    .map(String::trim)
                    .map(s -> s.replace("\"", ""))
                    .forEach(words::add);
            Collections.shuffle(words);
            count(words);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
