package data;

public class course {
    String name;
    int hours;
    String type;
    char semester;
    String year;

    public course(String courseName ,int semesterHours, String courseType, char courseSemester, String courseYear){
        name = courseName;
        hours = semesterHours;
        type = courseType;
        semester = courseSemester;
        year = courseYear;
    }

    public String toString(){
        return ("This is " + name + " course.");
    }

    public static void main(String[] args){
        course chemistry = new course("Chemistry 1", 4, "required", 'a', "First");
        System.out.println(chemistry);
    }

}
