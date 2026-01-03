package com.polcastillo.fundamentals.strings;

public class StringEmailValidationExercise {
    void main() {
        validateEmail("test@gmail.com");
        validateEmail("invalido.com");
        validateEmail("sin-arroba.gmail.com");
    }

    void validateEmail(String email) {
        if(email.contains("@") && email.contains(".")) {
            System.out.println("Email valido: " + email);
        } else {
            System.out.println("Email invalido: " + email);
        }
    }
}
