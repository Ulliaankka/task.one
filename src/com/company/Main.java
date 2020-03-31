package com.company;

public class Main {

    public static void main(String[] args) {
        // Напишіть програму, яка міняє місцями елементи одновимірного масиву з String в зворотному порядку. Не використовуйте додатковий масив для зберігання результатів.
        String[] array={"one", " ", "two", " ", "three", " ", "four", " ", "five", " ",};
        for(int i=0; i<array.length; i++){

            System.out.print(array[i]);
        }
        String temp;
        for(int i=0; i<array.length/2; i++){
            temp = array[array.length-i-1];
            array[array.length-i-1]=array[i];
            array[i]=temp;
        }
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
