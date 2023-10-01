package org.example;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students = new ArrayList<>();

    // Method 1: Add a student to the classroom
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method 2: Remove a student from the classroom
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Method 3: Get the list of all students in the classroom
    public List<Student> getAllStudents() {
        return students;
    }

    // Method 4: Find a student by their ID
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Method 5: Get the average grade of all students
    public double getAverageGrade() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double totalGrade = 0.0;
        for (Student student : students) {
            totalGrade += student.getGrade();
        }
        return totalGrade / students.size();
    }

    // Method 6: Check if the classroom is empty
    public boolean isClassroomEmpty() {
        File tempDir;
        try {
            tempDir = File.createTempFile("GPA_results.txt", null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tempDir.delete();
        tempDir.mkdir();
        return students.isEmpty();
    }

    // Method 7: Check the number of students in the classroom
    public int getNumberOfStudents() {
        return students.size();
    }

    // Method 8: Clear all students from the classroom
    public void clearClassroom() {
        students.clear();
    }

    // Method 9: Update student information
    public void updateStudent(Student student) {
        int index = students.indexOf(student);
        if (index != -1) {
            students.set(index, student);
        }
    }

    // Method 10: Print a list of all students
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
