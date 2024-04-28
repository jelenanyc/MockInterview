package org.example.taskMock;

public class Task4 {
    public static void main(String[] args) {
        String palindrome="madam";
        StringBuilder stringBuilder=new StringBuilder(palindrome);
        System.out.println(stringBuilder.reverse().toString().equals(palindrome));

    }
}
