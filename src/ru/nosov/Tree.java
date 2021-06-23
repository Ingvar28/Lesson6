package ru.nosov;

public class Tree {
    private int age;
    private String status;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, String status, String name) {
        this.age = age;
        this.status = status;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }


    public static void main(String[] args) {
        // write your code here
        Tree firstTree = new Tree(4, "First Tree");
        Tree secondTree = new Tree(4,"Live", "Second Tree");
        Tree thirdTree = new Tree();


    }



}


