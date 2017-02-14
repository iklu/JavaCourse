package university;

import java.util.List;

/**
 * Created by ovidiu on 12-Jan-17.
 */
public class University {

    //are references
    private List<Teacher> teachers;
    private Student[] students;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
