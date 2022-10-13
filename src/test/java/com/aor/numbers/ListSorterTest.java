package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    public List<Integer> list;
    @BeforeEach
    public void setUp(){
        list = Arrays.asList(1,2,4,2,5);
    }
    @Test
    public void sort() {
        List<Integer> expected = Arrays.asList(1, 2,2,4,5);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }
}
