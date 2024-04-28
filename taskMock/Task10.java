package org.example.taskMock;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {


        List<String> carList = new ArrayList<>();
        carList.add("bmw");
        carList.add("bmw");
        carList.add("audi");
        carList.add("lambo");


        Set<String> newSet = new LinkedHashSet<>(carList);
        System.out.println(newSet);
    }

}

