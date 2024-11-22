package com.bridgelabz;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorPractice {
    public static void main(String[] args) {
        /*TODO there are 2 iterator 1.iterator and 2, listiterator
        *
        * 1.iterator used to iterate over any collection like arraylist,hashset etc  one way traversal , u can remove but can't add and set*/

        List<String> stringList = Arrays.asList("Prashanth", "Navin");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        /*TODO 2. List iterator designed  forList implementions like LinkedList and ArrayList supports biderectional  trsversal allows set , add and removal while iteration*/

        ListIterator<String> listIterator =stringList.listIterator();
        while (listIterator.hasNext())
        {
            String value = listIterator.next();
           listIterator.set(value.toUpperCase()); // modify the element
        }
        System.out.println(stringList);
    }
}
