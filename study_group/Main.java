package familytree2.study_group;

import java.util.ArrayList;
import java.util.List;

import familytree2.study_group.controller.Controller;
import familytree2.study_group.stream.Stream;
import familytree2.study_group.study_group.StudyGroup;
import familytree2.study_group.teacher.TeacherController;

public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        StudyGroup group1 = new StudyGroup();
        StudyGroup group2 = new StudyGroup();
        stream1.addStudyGroup(group1);
        stream1.addStudyGroup(group2);

        Stream stream2 = new Stream();
        StudyGroup group3 = new StudyGroup();
        stream2.addStudyGroup(group3);

        Stream stream3 = new Stream();
        StudyGroup group4 = new StudyGroup();
        StudyGroup group5 = new StudyGroup();
        StudyGroup group6 = new StudyGroup();
        stream3.addStudyGroup(group4);
        stream3.addStudyGroup(group5);
        stream3.addStudyGroup(group6);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        Controller streamController = new Controller();
        streamController.sortStreams(streams);

        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudyGroups().size() + " groups");
        }

        TeacherController teacherController = new TeacherController();

        teacherController.createTeacher("Светлана", "Математика");
        teacherController.createTeacher("Андрей", "Физика");

        System.out.println("Учителя после сформирования:");
        teacherController.displayTeachers();

        teacherController.editTeacher(1, "Светлана Петровна", "Математический анализ");

        System.out.println("Учителя после редактирования:");
        teacherController.displayTeachers();
    }
}
