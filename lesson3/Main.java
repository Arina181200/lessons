package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner in = new Scanner(System.in);
        for(int i =0; i<array.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i]=in.nextInt();
        }
        for(int i =array.length-1; i>=0 ; i--) {
            System.out.println("Элемент "  + array[i]);

        }

    }
}
