package com.practice.collections;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
        //Duplicates Allowed Value Store
        List<Integer> arrayList = new ArrayList<>();

        //Duplicates not Allowed Value Store
        Set<Integer> set = new HashSet<>();

        //Duplicates Allowed Key-Value Store
        HashMap<String,String> hashMap = new HashMap<>();

        //Insertion order sort (if no duplicates then use set)
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();

        //Value order sort (if key should be in sorted order then use map)
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("ArrayList Output");
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1); //duplicate
        arrayList.forEach(System.out::println);

        System.out.println("Set Output");
        set.add(1);
        set.add(2);
        set.add(1);//Ignored as it is duplicate
        set.forEach(System.out::println);

        System.out.println("HashMap Output");
        hashMap.put("1","hello");
        hashMap.put("2","world");
        System.out.println("key:value");
        hashMap.forEach((key,value) -> System.out.println(key+":"+value));

        System.out.println("Linked HashMap Output");
        linkedHashMap.put("2","world");
        linkedHashMap.put("1","hello");
        linkedHashMap.forEach((key,value) -> System.out.println(key+":"+value)); //order would be same has insertion

        System.out.println("TreeSet Output");
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.forEach(System.out::println);// output would be 1,2,5 even though 1 was inserted later

        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("world");
        System.out.println(stack.pop()+" "+stack.pop()); // o/p world,hello LIFO

        Queue<String> queue = new LinkedList<>();

        queue.offer("hello");
        queue.offer("world");
        queue.forEach(System.out::println);
    }

}
