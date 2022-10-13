package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    public List<Integer> list;
    @BeforeEach
    public void setUp(){
        list = Arrays.asList(3,2,6,1,4,5,7);
    }
    @Test
    public void deduplicate() {

        List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7);

        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }
}
