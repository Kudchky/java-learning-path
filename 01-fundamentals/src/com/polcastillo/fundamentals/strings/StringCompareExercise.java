package com.polcastillo.fundamentals.strings;

public class StringCompareExercise {
    void main() {
        String s1 = "Javo";
        String s2 = "JAVA";

        if (s1.toUpperCase().equals(s2)) {
            IO.println("Textos iguales");
        } else {
            IO.println("Textos diferentes");
        }
    }
}
