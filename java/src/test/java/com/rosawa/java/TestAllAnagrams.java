package com.rosawa.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestAllAnagrams {

    @Test
    public void testAllAnagrams() {
        String[] expected = {"abc", "acb", "bac", "bca", "cab", "cba"};
        List<String> actual = AllAnagrams.allAnagrams("abc");

        Assert.assertEquals(actual.size(), 6);
        Assert.assertEquals(actual, Arrays.asList(expected));
    }
}
