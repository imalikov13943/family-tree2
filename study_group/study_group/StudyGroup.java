package familytree2.study_group.study_group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import familytree2.study_group.student.Student;
import familytree2.study_group.student.comparators.StudentComparatorByAge;
import familytree2.study_group.student.comparators.StudentComparatorByName;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void sortByName(){
        studentList.sort(new StudentComparatorByName());
    }

    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }
}
