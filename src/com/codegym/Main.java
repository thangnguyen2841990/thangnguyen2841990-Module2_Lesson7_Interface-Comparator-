package com.codegym;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("blue", false, 3.5);
        System.out.println("Pre - sorted");
        for (ComparableCircle circle:circles) {
            System.out.println(circle);
        }
        Comparator comparator = new ComparableCircle();
        Arrays.sort(circles,comparator);

        for (ComparableCircle circle1: circles) {
            System.out.println(circle1);
        }

    }
}
