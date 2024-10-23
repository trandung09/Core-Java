package org.lap9.bttl2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Class {

    private String course;
    private String semester;
    private List<Student> students;

    public Class(String course, String semester) {
        this.course = course;
        this.semester = semester;
        this.students = new ArrayList<Student>();
    }
}
