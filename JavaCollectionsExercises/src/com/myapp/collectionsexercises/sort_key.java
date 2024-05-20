package com.myapp.collectionsexercises;

import java.util.Comparator;

public class sort_key implements Comparator<String>{
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
