package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human grandfather1 = new Human ("John",true,70);
        Human grandfather2 = new Human ("Jake",true,60);
        Human grandmother1 = new Human ("Alisa",false,69);
        Human grandmother2 = new Human ("Jenny",false,59);

        Human mother = new Human ("Helen",false,25, grandfather1, grandmother1);
        Human father = new Human ("Bob",true,31, grandfather2, grandmother2);

        Human firstChild = new Human ("Michel",false,3, mother, father);
        Human secondChild = new Human ("Anna",true,4, mother, father);
        Human thirdChild = new Human ("Bill",false,5, mother, father);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age,  Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
