package org.example;

public class test2 {
    public static void foo1(){
        try {
            int[] intArray = {1,2,3,4,5,6,7,8,9};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
    public static void main(String[] args) {
        foo1();
        try {
            int a = 231;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 23333);
            int[] abc = { 1, 2};
            abc[5] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }



}
