package com.company;

public class Main {
    public static void main(String[] args) {
        printToN(50);
    }

    public static void printToN(int n) {
        printToN(n, n);
    }

    public static void printToN(int startN, int currentN) {
        System.out.println(startN - currentN + 1);
        if (currentN - 1 == 0) {
            return;
        }
        printToN(startN, currentN-1);
    }
}
