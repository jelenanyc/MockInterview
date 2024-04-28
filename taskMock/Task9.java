package org.example.taskMock;

public class Task9 {
    public static void main(String[] args) {
        String str = "abracadabra";

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("The first non-repeating character is: " + ch);
                break;
            }
        }
    }
}

