package com.company;

// class declaration
public class Student {
    // instance variables
    String name;
    String school;
    String state;
    int age;
    int graduateAge;

    // constructor declaration of class
    public Student(String name, int age, String school, String state) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.state = state;
    }

    public String getName() {
        return name;
    }

  
    public int getAge() {
        graduateAge = age + 4;
        System.out.println("When I graduate I'll be: " + graduateAge + " years old!");
        return age;
    }

    
    public String getSchool() {
        return school;
    }

    
    public String getState() {
        return state;
    }

    public String toString() {
        return ("My name is: " + this.getName() +
                ".\nI am: " + this.getAge() + " years old." + "\nI go to: " +
                this.getSchool() + ".\nMy school is located in: " + this.getState() + "!");
    }

    public static void main(String[] args) {
// objects
        Student s1 = new Student("Karina", 24, "New York University", "New York");
        Student s2 = new Student("Michael", 28, "Duke University", "North Carolina");
        Student s3 = new Student("Jake", 21, "Columbia University", "New York");
        Student s4 = new Student("Gabriella", 19, "Columbia University", "New York");

// printing out student information
        System.out.println(s1.toString());

    }
}
