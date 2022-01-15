package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int [] arr= new int[10];
        System.out.println("Array before: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(2);
            System.out.println(arr[i]+" ");
        }
        System.out.println("After sorting :");
        Arrays.sort(arr);
        for (int i:arr
             ) {
            System.out.println(i);
        }
        System.out.print("Arraylist Before: "+" \n");
        ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j <=10; j++) {
                arrayList.add(r.nextInt(2));
            }
        for (Integer i:arrayList) {
            System.out.println(i);
        }
        System.out.println("After: ");
        sort(arrayList);
        System.out.println("Linkedlist Before: ");
            LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <=10; i++) {
            linkedList.add(r.nextInt(2));
        }
        for (Integer j:linkedList) {
            System.out.println(j);
        }
        System.out.println("After: ");
        sort(linkedList);


        }

    public static void sort(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
        System.out.println(linkedList);
    }

    public static void sort(ArrayList<Integer>arrayList){
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    }

