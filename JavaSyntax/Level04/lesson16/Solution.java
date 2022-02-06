package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        int res = (a + b + c) - (max + min);

        if(a == b && b == c){
            System.out.println(a);
        } else System.out.println(res);

    }
}
