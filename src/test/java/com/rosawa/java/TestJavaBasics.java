package com.rosawa.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TestJavaBasics {

    @Test(enabled = false)
    public void basicArray() {
        String[] seasons = {"Spring", "Summer", "Fall", "Winter"};

        for (String season : seasons) {
            System.out.println(season);
        }
    }

    @Test
    public void testTwoIntArrays() {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};

        Assert.assertTrue(Arrays.equals(numbers1, numbers2));
    }

    @Test
    public void testSortIntArray() {
        int[] numbers = {2, 5, 1, 9, 6, 12};
        int[] expected = {1, 2, 5, 6, 9, 12};

        Arrays.sort(numbers);
        Assert.assertEquals(numbers, expected);
    }

    @Test
    public void testListCollection() {
        List seasons = new ArrayList();
        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Fall");
        seasons.add("Winter");

        ListIterator<String> it = seasons.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void testMapCollection() {
        Map<String, String> captialCities = new HashMap();
        captialCities.put("Japan", "Tokyo");
        captialCities.put("USA", "Washington DC");
        captialCities.put("Canada", "Ottawa");
        captialCities.put("UK", "London");

        System.out.println("Iterate keys");
        for (String country : captialCities.keySet()) {
            System.out.println(country);
        }

        System.out.printf("Iterate values");
        for (String city : captialCities.values()) {
            System.out.println(city);
        }

        System.out.println("Iterate entries");
        for (Map.Entry<String, String> entry : captialCities.entrySet()) {
            System.out.printf("%s: %s", entry.getKey(), entry.getValue());
        }

        System.out.println("Iterate using iterator");
        Iterator<Map.Entry<String, String>> it = captialCities.entrySet().iterator();
        while (it.hasNext()) {
            System.out.printf("%s: %s", it.next().getKey(), it.next().getValue());
        }
    }
}
