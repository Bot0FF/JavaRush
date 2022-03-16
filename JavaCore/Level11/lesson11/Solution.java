package com.javarush.task.task11.task1123;

/* 
Реализуй метод, который возвращает
объект класса Pair. 
В поле х этого объекта
должно содержаться минимальное число, 
а в поле у - максимальное число из 
массива inputArray.
*/

public class Solution {
    public static void main(String[] args){
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }

    public static Pair getMinimumMaximumPair(int[] inputArray){
        if(inputArray == null || inputArray.length == 0){
            return new Pair(null, null);
        }

        int temp = 0;
        for(int i = 0; i < inputArray.length; i++){
            for(int j = 1; j < inputArray.length - 1; j++){
                if(inputArray[j - 1] > inputArray[j]) {
                    temp = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }

        int minimum = inputArray[0];
        int maximum = inputArray[inputArray.length - 1];

        return new Pair(minimum, maximum);
    }
}
