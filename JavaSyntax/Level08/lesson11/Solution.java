package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Модернизация ПО
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String secondName = reader.readLine();
            map.put(city, secondName);
        }

        String city = reader.readLine();
        if (map.containsKey(city)) {
            String secondName = map.get(city);
            System.out.printf(secondName);
        }
    }
}
