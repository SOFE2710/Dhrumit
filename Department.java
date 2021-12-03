//Name: Dhrumit Patel
//Student number: 100809140
//Date : 2021-12-03

import java.util.Random;
import java.util.Vector;


public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.




    public Department(String name, String id) { //constructor
        // also initialize the vectors
        this.name=name;
        this.id=id;
        this.courseList=new Vector<Course>();
        this.registerList=new Vector<Student>();


    }


    public void offerCourse(Course course) //adds the courses to the course list

    {
        this.courseList.add(course);

    }


    public void printCoursesOffered() //Display all the courses offered by department
    {
        for (Course course : this.courseList)
        {
            System.out.println(course);
        }
    }


    public void registerStudentCourseInDepartment(Student student,Course course)//add courses and students
    {

        if(!this.courseList.contains(course))//checks if the course is in the list
        {
            this.courseList.add(course);
        }
        if(!this.registerList.contains(student))//check if the student is registered
        {
            this.registerList.add(student);
        }

    }


    public void printStudentsByName() //displays list of the students in the course
    {


        for(Student register : registerList)       //goes through the students in the register list
            System.out.println(register.toString());
    }




    public String getName()
    {
        return this.name;

    }


    public String getId()
    {
        return this.id;
    }



    public boolean isStudentRegistered(Student student)//method to check if student is registered in a course
    {
        return this.registerList.contains(student);

    }

    public Vector StudentsRegisteredInCourse(int code) //Method to return the students in the course
    {
        Vector<Student> studentList=new Vector<>();  //store the students
        for( Course c:courseList)//goes through the course list
        {
            if(c.getNumber()==code)
            {
                studentList= c.getList();
            }
        }
        return studentList; //returns the students stored in the course

    }


    public void printStudentsRegisteredInCourse(int code)//displays students specific course
    {
        Vector<Student>classList = StudentsRegisteredInCourse(code); //stores the students in the course

        for(Student information:classList)//cycle though all the students in the classList.
        {

            System.out.println(information.getName()+" "+information.getId()); //prints the student info.(name and id)
        }

    }




    public Course largestCourse() { //find the largest course

        Vector<Student> StudentList;   //define a list to store no of students in the classlist
        Course hold, largenum = null;
        int max = 0;                   // stores max class list

        for(int i = 0; i<courseList.size(); i++)
        { //access courses and classlist
            hold = courseList.elementAt(i);       //stores course from the course list
            StudentList = hold.getList();
            if(max <= StudentList.size())
            {       //compares max from the size and if it is less than swap
                max =  StudentList.size();      //stores the size of the list.
                largenum = hold;
            }

        }
        return largenum;


    }


    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students

        return this.name+": "+String.valueOf(this.courseList.size())+"courses, "+ String.valueOf(this.registerList.size())+"  Students";



    }



}

