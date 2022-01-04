package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService
{



    protected static List<Student> getStudents()
    {
        return List.of
                (
                        new Student(
                                "venkata sai karthik",
                                21,
                                123L
                        )
                );
    }


}
