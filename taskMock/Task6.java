package org.example.taskMock;

public class Task6 {
    public static void main(String[] args) {
        String vowels = "documentation";
        System.out.println(countVowels(vowels));

    }
    static int countVowels(String str){
        return str.replaceAll("[^aeiouAEIOU]","").length();


    }
}
