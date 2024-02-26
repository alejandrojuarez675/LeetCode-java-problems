package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * //Dado un string con multiples palabras separadas por un espacio buscar aquellas palabras repetidas.
 * String palabras = "hola como estas hola todo bien ? que se cuenta hola probando uno dos tres probando uno ";
 */
public class LenioLabs {

    public static void main(String[] args) {
        Map<String, Integer> duplicatedWords = findDuplicatedWords("hola como estas hola todo bien ? que se cuenta hola probando uno dos tres probando uno ");

        duplicatedWords.forEach((key, value) -> {
            if (value > 1) System.out.printf("word: %s -> %s%n", key, value);
        });

    }

    public static Map<String, Integer> findDuplicatedWords(String text) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : text.split(" ")) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

}
