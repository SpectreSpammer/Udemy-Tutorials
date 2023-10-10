package org.example.loggerStudent;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Nami",3);

        student1.missClass();
        student2.cutClass();
        student3.infoClass();
    }
}
