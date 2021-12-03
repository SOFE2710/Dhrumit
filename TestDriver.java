//Name: Dhrumit Patel
//Student number: 100809140
//Date : 2021-12-03

public class TestDriver {


    public static void main(String[] args) {


        Department ecse = new Department("Electrical, Computer and Software Engineering :", " ECSE ");
        Department amme = new Department("Automotive, Mechanical and Manu Engineering :", " AMME ");

        //Create courses
        Course engr1200 = new Course("ENGR", 1200, ecse, "Introduction to Programming");
        Course sofe2800 = new Course("SOFE", 2800, ecse, "Web Programming");
        Course sofe2710 = new Course("SOFE", 2710, ecse, "Java Programming");
        Course mece2430 = new Course("MECE", 2430, amme, "Dynamics");

        //Create students
        Student john = new Student("100232122", "John Maxwell");
        Student sarah = new Student("100523332", "Sarah Lee");
        Student emily = new Student("100512132", "Emily Johnson");
        Student alex = new Student("100232732", "Alex Williams");
        System.out.println(engr1200);
        System.out.println(sofe2800);
        System.out.println(mece2430);
        System.out.println(ecse);
        System.out.println(amme);


        System.out.println(john);
        System.out.println(sarah);

        //sends info about student John

        john.registerFor(engr1200);
        engr1200.addStudentToCourse(john);
        john.registerFor(sofe2800);
        sofe2800.addStudentToCourse(john);
        john.registerFor(sofe2710);
        sofe2710.addStudentToCourse(john);


        sarah.registerFor(mece2430);
        mece2430.addStudentToCourse(sarah);
        sarah.registerFor(engr1200);
        engr1200.addStudentToCourse(sarah);

        //sends info about student Emilly
        emily.registerFor(engr1200);
        emily.registerFor(mece2430);//3
        engr1200.addStudentToCourse(emily);
        mece2430.addStudentToCourse(emily);//1

        //sends info about student Alex
        alex.registerFor(sofe2800);
        sofe2800.addStudentToCourse(alex);
        alex.registerFor(mece2430);
        mece2430.addStudentToCourse(alex);//2


        ecse.registerStudentCourseInDepartment(john, engr1200);
        ecse.registerStudentCourseInDepartment(john, sofe2800);
        ecse.registerStudentCourseInDepartment(john, sofe2710);
        amme.registerStudentCourseInDepartment(emily, mece2430);
        ecse.registerStudentCourseInDepartment(sarah, engr1200);
        ecse.registerStudentCourseInDepartment(sarah, sofe2800);
        ecse.registerStudentCourseInDepartment(alex,engr1200);
        amme.registerStudentCourseInDepartment(alex, mece2430);





        //print courses
        System.out.println("List of courses:");
        System.out.println(engr1200);
        System.out.println(sofe2800);
        System.out.println(mece2430);
        //print departments
        System.out.println("List of departments:");
        System.out.println(ecse);
        System.out.println(amme);



    }
}







