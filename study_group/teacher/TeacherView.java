package familytree2.study_group.teacher;

import java.util.List;

public class TeacherView {
    public void displayTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
