package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassroomTest {
    private Classroom classroom;

    @BeforeEach
    public void setUp() {
        classroom = new Classroom();
    }

    @Test
    public void testAddStudent() {
        Student student = new Student(1, "Vugar", 90.0);
        classroom.addStudent(student);

        assertEquals(1, classroom.getNumberOfStudents());
    }

    @Test
    public void testRemoveStudent() {
        Student student = new Student(1, "Nihad", 90.0);
        classroom.addStudent(student);

        classroom.removeStudent(student);

        assertEquals(0, classroom.getNumberOfStudents());
    }

    @Test
    public void testGetNumberOfStudents() {
        assertEquals(0, classroom.getNumberOfStudents());

        Student student1 = new Student(1, "Vugar", 90.0);
        Student student2 = new Student(2, "Nihad", 85.0);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        assertEquals(2, classroom.getNumberOfStudents());
    }

    @Test
    public void testIsClassroomEmpty() {
        assertTrue(classroom.isClassroomEmpty());

        Student student = new Student(1, "Vugar", 90.0);
        classroom.addStudent(student);

        assertFalse(classroom.isClassroomEmpty());
    }

    @Test
    public void testClearClassroom() {
        Student student1 = new Student(1, "Vugar", 90.0);
        Student student2 = new Student(2, "Nihad", 85.0);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        classroom.clearClassroom();

        assertEquals(0, classroom.getNumberOfStudents());
    }
}
