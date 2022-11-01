package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int fA = 5*intA*intA + 3;
        int fB = 5*intB*intB + 3;
        if (fA == fB) return intA - intB;
        return fA - fB;
    }
}
