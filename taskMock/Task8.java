package org.example.taskMock;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();
        stringList.add("apple");
        stringList.add("Mango");
        stringList.add(("Annanas"));

        for (String str:stringList){
            if (str.startsWith("A")){
                System.out.println(str.toLowerCase());
            }
        }


    }


}



