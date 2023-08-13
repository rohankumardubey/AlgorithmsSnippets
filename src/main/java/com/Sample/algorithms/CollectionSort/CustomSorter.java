package com.Sample.algorithms.CollectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorter {
    public static void main(String[] args){
      //


        Student elem3 = new Student(3,"c","1");
        Student elem4 = new Student(4,"d","13");
        Student elem1 = new Student(1,"a","21");
        Student elem2 = new Student(2,"b","5");

        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(elem3,elem4,elem1,elem2));

        System.out.println("unsorted");
        for(Student student:studentsList){
            System.out.println(student);
        }

        System.out.println("\nsorted list by roll Number");
        Collections.sort(studentsList,new SortByRollNumber());
        for(Student student:studentsList){
            System.out.println(student);
        }


        System.out.println("\nsorted list by percentage");
        Collections.sort(studentsList,new SortByPercentage());
        for(Student student:studentsList){
            System.out.println(student);
        }



    }
}


class Student{
    int rollnumber;
    String name;
    String percentage;

    public Student(int rollnumber,String name,String percentage){
        this.name=name;
        this.rollnumber=rollnumber;
        this.percentage=percentage;
    }

    @Override
    public String toString() {
        return "["+this.rollnumber+","+this.name+","+this.percentage+"]";
    }
}

class SortByRollNumber implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return s1.rollnumber-s2.rollnumber;
    }
}

class SortByPercentage implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return (Integer.parseInt(s1.percentage)-Integer.parseInt(s2.percentage));
    }
}