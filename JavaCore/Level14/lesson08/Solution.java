package com.javarush.task.task14.task1417;

/* 
Валюты
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for(Money money : ivan.getAllMoney()){
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount());
        }
    }

    static class Person{
        public String name;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Hryvna(10));
            allMoney.add(new Ruble(20));
            allMoney.add(new USD(30));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney(){
            return allMoney;
        }
    }
}