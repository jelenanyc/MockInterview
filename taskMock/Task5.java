package org.example.taskMock;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());


        if (areAnagrams == true){
            System.out.println("are anagrams");
        }else {
            System.out.println("not anagrams");
        }

    }
}



