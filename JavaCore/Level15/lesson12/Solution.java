package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static Scanner sc;

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        sc = new Scanner(System.in);
        String planetName = sc.nextLine();
        switch (planetName){
            case Planet.MOON: thePlanet = Moon.getInstance();
            break;
            case Planet.EARTH: thePlanet = Earth.getInstance();
            break;
            case Planet.SUN: thePlanet = Sun.getInstance();
            break;

            default: thePlanet = null;
            break;
        }
    }
}
