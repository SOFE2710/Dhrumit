//Name: Dhrumit Patel
//Student number: 100809140
//Date : 2021-12-03

import java.util.Vector;

public class Student extends Person {
    //initializers

    private String id;
    private String  name;
    private Vector<Course> courses; // contains all courses the student is registered in


    public Student(String studentdName, String studentdId) { //constructors
        this.name = studentdName;//contains student name
        this.id = studentdId; // contains id
        this.courses = new Vector<Course>();

    }


    public String getName()
    { //returns the name
        return name;

    }

    public String getId()
    { //returns the id
        return id;

    }

    public void registerFor(Course course)//check if the student is added or not
    {

        if(!this.courses.contains(course))
            this.courses.add(course);



    }




    public boolean isRegisteredInCourse(Course course) //checks if the student is registered
    {
        return this.courses.contains(course);

    }

    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
        if(this.courses.size() == 0){
            return this.id+"  "+this.name;
        }

        String addcourse="";
        for(Course course:this.courses){
            addcourse+=course.getCode()+" "+course.getNumber()+"  ";
        }

        return this.id+"  "+this.name+"\n"+"Registered courses: "+ "\n "+addcourse+" ";
    }








}






