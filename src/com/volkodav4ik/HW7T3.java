package com.volkodav4ik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW7T3 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(19, "Ann"));
        list.add(new Person(25, "Alex"));
        list.add(new Person(16, "Ben"));
        list.add(new Person(21, "Harvy"));
        list.add(new Person(25, "Lika"));
        list.add(new Person(45, "Michael"));
        list.add(new Person(24, "Jack"));
        list.add(new Person(45, "John"));
        list.add(new Person(19, "Dolboslav"));
        list.add(new Person(16, "Boris"));
        System.out.println("LIST BEFORE DELETING DUPLICATES:");
        System.out.println(list);
        Map<Integer, String> map = new HashMap<>();
        for (Person person : list) {
            map.put(person.getAge(), person.getName());
        }
        list.clear();
        map.forEach((key, value) -> list.add(new Person(key, value)));
        System.out.println("LIST AFTER DELETING DUPLICATES:");
        System.out.println(list);
    }
}
