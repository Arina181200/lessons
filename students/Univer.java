package com.company;

import java.util.ArrayList;

public class Univer {
    private ArrayList<Student> list = new ArrayList<Student>();
 public void addStudent(Student student)
    {
        System.out.println("Студент " + student.getName()+"принят");
        list.add(student);
    }
   public void removeStudent (Student student)
    {
        System.out.println("Студент " + student.getName() + "исключен");
        list.remove(student);
    }
   public void outStudents()
    {
        for(Student students:list)
        {
            System.out.println("Студент " +students.getName()+" группа "+students.getCourse()+" GPA 1"+students.getGPA());
        }
        }

    @Override
    public String toString() {
        return "Univer{" +
                "list=" + list +
                '}';
    }
}
