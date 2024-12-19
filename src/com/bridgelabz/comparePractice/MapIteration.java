package com.bridgelabz.comparePractice;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {
        // lets do iteration of List and Set first
        List<String> list = new ArrayList<>();

        list = Arrays.asList("Navin", "Praveen");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String str : list) {
            System.out.println(str);
        }

        //using iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // using list iterator
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        Collections.sort(list);
        System.out.println(list);

        //Set
        Set<String> set = new HashSet<>();
        set.add("Prashanthhhhh");
        set.add("Naveen");

        // to iterate we need to use list
        List<String> listSet = new ArrayList<>(set);

        // using enhanced For
        for (String str : set) {
            System.out.println(str);
        }

        // using iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Prashanth");
        map.put(3, "naveen");
        map.put(2, "Prash");
        System.out.println(map);

        // iterating through map using  keySet
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println("key :" + key + " value:" + map.get(key));
        }

        // using EntrySet
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key :" + entry.getKey() + " value:" + entry.getValue());
        }

    }
}
