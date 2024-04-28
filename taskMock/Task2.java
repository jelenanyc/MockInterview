package org.example.taskMock;

public class Task2 {
    public static void main(String[] args) {
        String str="abc123$#*";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());

    }
}
