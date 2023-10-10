package org.example.loggerStudent;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Student {
    private static final Logger logger = Logger.getLogger(Student.class.getName());

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void missClass() {
        logger.log(Level.WARNING, name + " (ID: " + id + ") missed the class.");
    }

    public void cutClass() {
        logger.log(Level.SEVERE, name + " (ID: " + id + ") cut the class.");
    }

    public void infoClass(){
        logger.info("No one cuts the class");
    }
    // Other properties and methods of the Student class
}

