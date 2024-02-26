package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AnagramValidator extends RuntimeException {

    public boolean validate(String word1, String word2){
        if (word1.length() != word2.length()) return false;

        Map<String, Integer> word1Letters = getLettersOfWord(word1);
        Map<String, Integer> word2Letters = getLettersOfWord(word2);

        for (String letter : word1Letters.keySet()) {
            if (!word2Letters.containsKey(letter)) return false;
            if (word1Letters.get(letter) != word2Letters.get(letter)) return false;
        }
        for (String letter : word2Letters.keySet()) {
            if (!word1Letters.containsKey(letter)) return false;
            if (word2Letters.get(letter) != word1Letters.get(letter)) return false;
        }

        Set<Integer> set = Collections.emptySet();
        set.add(3);

        return true;
    }

    private Map<String, Integer> getLettersOfWord(String word) {
        Map<String, Integer> response = new HashMap<>();
        for (String s : word.split("")) {
            if (response.containsKey(s)) {
                response.put(s, response.get(s) + 1);
            } else {
                response.put(s, 1);
            }
        }
        return response;
    }
}


/**
 *
 * var input = [
 *
 * 	// startDate			endDate				priority	price
 *
 *   ["2020-06-14T00:00:00Z", "2020-12-31T23:59:59Z", 0, "35.50"],
 *
 *   ["2020-06-14T15:00:00Z", "2020-06-14T18:30:00Z", 1, "25.45"],
 *
 *   ["2020-06-15T00:00:00Z", "2020-06-15T11:00:00Z", 1, "30.50"],
 *
 *   ["2020-06-15T16:00:00Z", "2020-12-31T23:59:59Z", 1, "38.95"],
 *
 * ];
 *
 *
 *
 * Output
 *
 * // startDate				endDate					price
 *
 * ["2020-06-14T00:00:00Z", "2020-06-14T14:59:59Z", "35.50"],
 *
 * ["2020-06-14T15:00:00Z", "2020-06-14T18:29:59Z", "25.45"],
 *
 * ["2020-06-14T18:30:00Z", "2020-06-14T23:59:59Z", "35.50"],
 *
 * ["2020-06-15T00:00:00Z", "2020-06-15T10:59:59Z", "30.50"],
 *
 * ["2020-06-15T11:00:00Z", "2020-06-15T15:59:59Z", "35.50"],
 *
 * ["2020-06-15T16:00:00Z", "2020-12-31T23:59:59Z", "38.95"],
 *
 */

/**
 * validate that don't have two prices with same priority at same time
 * create the time periods
 * for each time period i search the max priority price
 */
