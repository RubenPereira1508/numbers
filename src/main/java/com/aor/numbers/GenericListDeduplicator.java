package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public interface GenericListDeduplicator {

    public static List<Integer> deduplicate(List<Integer> list) {

        ListSorter listSorter = new ListSorter();
        List<Integer> sorted = listSorter.sort(list);
        List<Integer> unique = new ArrayList<>();

        Integer last = null;

        for (Integer number : sorted)
            if (!number.equals(last)) {
                last = number;
                unique.add(number);
            }

        return unique;
    }
}

