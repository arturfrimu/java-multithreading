package com.arturfrimu.multithreading;

public class Reference {
    public static void main(String[] args) {
        var john = new User("John");
        String name = john.name;
        String name1 = john.getName();
        System.out.println(name == name1);
    }
}
