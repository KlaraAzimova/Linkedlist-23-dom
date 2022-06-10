package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "Sorted array: ");
        sort(array);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(2));
        }
        System.out.print("\n" + "Arraylist: " + arrayList + "\n" + "Sorted arraylist: ");
        sort(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(2));
        }
        System.out.print("\n" + "Linkedlist: " + linkedList + "\n" + "Sorted linkedlist: ");
        sort(linkedList);
    }

    public static void sort(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            Collections.sort(list);
        }
        System.out.print(list);

    }

    public static void sort(ArrayList<Integer> array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            list.add(array.get(i));
            Collections.sort(list);
        }
        System.out.print(list);

    }

    public static void sort(LinkedList<Integer> array) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.size(); i++) {
            list.push(array.get(i));
            Collections.sort(list);
        }
        System.out.print(list);

    }
}
