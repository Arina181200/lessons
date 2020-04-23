package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Student st1 = new Student1("Ivanov Ivan", 2, 3);
        Student st2 = new Student2("Petrov Petr", 3, 2);
        Student st3 = new Student3("Kuznetsov Vladimir", 1, 4);
        Scanner in = new Scanner(System.in);
Univer univer=new Univer();
        int key, keyAdd, keyRemove;
        System.out.println("Для работы программы нажмите любую клавишу,для конца программы нажмите 0");
        key = in.nextInt();
        while (key != 0) {
            System.out.println(st1);
            System.out.println(st2);
            System.out.println(st3);
            System.out.println("Для добавления студента ,введите его порядковый номер");
            keyAdd=in.nextInt();
            if(keyAdd==1) {
                univer.addStudent(st1);
                univer.outStudents();
            }
            if (keyAdd==2) {
                univer.addStudent(st2);
                univer.outStudents();
            }
            if (keyAdd==3) {
                univer.addStudent(st3);
                univer.outStudents();
            }
            System.out.println("Для удаления студента ,введите его порядковый номер");
            keyRemove=in.nextInt();
            if(keyRemove==1) {
                univer.removeStudent(st1);
            }
            if(keyRemove==2) {
                univer.removeStudent(st2);
            }
            if(keyRemove==3) {
                univer.removeStudent(st3);
            }


        }
    }
}
