package OOexerciseUniversitywithStudents;

public class Student {
    private String name;
    private String ID;
    private String courses[];
    private double grade[];

    public  static final int MAX_NUM_COURSES = 5;

    public Student(String name, String ID){
        this.name=name;
        this.ID = ID;

        grade = new double[MAX_NUM_COURSES];
        courses = new String[MAX_NUM_COURSES];
    }

    public void addCourseGrade(String course, double grade){
//        grade[0]=grade;

    }
    public  boolean equals(Object anotherObject){
        if(anotherObject instanceof Student ) {
            Student anotherStudent = (Student) anotherObject;
//          Option 1
            if (this.ID.equals(anotherStudent.ID)) {
                return true;
            } else {
                return false;
            }
//            Option 2:
//            return this
        } else {
            return  false;
        }
    }

//  GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String[] getCourses() {
        return courses;
    }

    public double[] getGrade() {
        return grade;
    }


}
