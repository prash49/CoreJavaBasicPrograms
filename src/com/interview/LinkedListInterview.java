package com.interview;

import org.w3c.dom.Node;

import javax.swing.plaf.synth.SynthStyle;
import java.util.LinkedList;

public class LinkedListInterview {

    public static void main(String[] args){


        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        int p1 = 0;
        int p2  = 0;

        for(int i = p1; i < list.size() -1 ; i ++){
            for (int j = 0 ; j < list.size() - 1 ; ){
                if(j < list.size()  &&  list.get(i) == list.get(j) ){
                    System.out.println("its circular at position i:"+ i + "  j:"+ j);
                }else {
                    j =j + 2;
                }
            }
        }



    }
}
