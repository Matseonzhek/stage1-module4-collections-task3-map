package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class KeyValueSwapper {

    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        NavigableMap<Integer, String> navigableMap = new TreeMap<>(sourceMap).descendingMap();
        for (Map.Entry<Integer, String> entry : navigableMap.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }
}
