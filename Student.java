package com.example.demo.student;

public class Student
{
    public String name;
    public Integer age;
    public Long id;

    public Student(String name,
                   Integer age,
                   Long id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;

    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

   // @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }//
}

