package com.example.student_library_management_system.converter;

import com.example.student_library_management_system.model.Student;
import com.example.student_library_management_system.requestdto.StudentRequestDto;

public class StudentConverter {

    // converter ----> it converts the requestdto into model classes so that class can saved in datadbase

    public static Student convertStudentRequestDtoIntoStudent(StudentRequestDto studentRequestDto){
        Student student=new Student();

        student.setName(studentRequestDto.getName());
        student.setDept(studentRequestDto.getDept());
        student.setGender(studentRequestDto.getGender());
        student.setDob(studentRequestDto.getDob());
        student.setSem(studentRequestDto.getSem());
        student.setEmail(studentRequestDto.getEmail());
        student.setMobile(studentRequestDto.getMobile());

        return student;
    }
}
