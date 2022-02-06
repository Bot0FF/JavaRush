package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

//Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма». Вывести на экран полученную сумму.

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
        int sum = 0;
      
        while (true) {
            String str = reader.readLine();
            if (str.equals("сумма")) {
                System.out.println(sum);
                break;
            } else {
                sum += Integer.parseInt(str);
            }
        }
    }
}
