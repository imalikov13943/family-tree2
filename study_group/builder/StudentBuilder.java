package familytree2.study_group.builder;

import familytree2.study_group.student.Student;

public class StudentBuilder {
    private int maxId;

    public Student build(String name, int age){
        Student student = new Student(maxId++, name, age);
        return student;
    }
}
