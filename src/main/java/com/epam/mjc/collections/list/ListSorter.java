package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    ListComparator listComparator = new ListComparator();

    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Double aFun = (5 * Math.pow(Double.parseDouble(a), 2) + 3);
        double bFun = (5 * Math.pow(Double.parseDouble(b), 2) + 3);
        return aFun.equals(bFun) ? a.compareTo(b) : Double.compare(aFun, bFun);
    }
}
