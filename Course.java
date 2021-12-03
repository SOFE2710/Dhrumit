//Name: Dhrumit Patel
//Student number: 100809140
//Date : 2021-12-03

import java.util.Vector;

public class Course{

    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector<Student> classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title)
    {
        // also initialize the classList;
        this.code=code;
        this.title=title;
        this.number=number;
        this.dept=dept;
        this.classList=new Vector<Student>();


    }

    public Course()
    {
        // TODO Auto-generated constructor stub

    }


    public int getNumber()
    { //returns the student number
        return  this.number;

    }


    public String getCode()
    { //returns the code
        return this.code;

    }

    public void addStudentToCourse(Student student)
    {

        this.classList.add(student);

    }

    public Vector<Student> getList()
    {  //used in department class, it returns the class list
        return classList;

    }


    public String toString()
    {
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
        ;

        return this.code+"  "+ this.number+" "+this.title+","+"Enrollment=   "+ String.valueOf(this.classList.size());
    }



}