
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Course {

    private String title;
    private Vector courseRecords;

    Course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

     public void printCourseStudents() {
       
        Enumeration<CourseRecord> x = courseRecords.elements();
        while (x.hasMoreElements()) {
            String studentName; 
                    studentName= x.nextElement().getStudent().getName();
            System.out.println("the student name is "+ studentName);
        }
    }

    public void printBestStudent() {
       
        String Student = null ;
        double Average = 0;
        Enumeration<CourseRecord> e = courseRecords.elements();
        while (e.hasMoreElements()) {
           
                CourseRecord courseRecord = e.nextElement();
                double average = courseRecord.average();
                if (average > Average) {
                    Average = average;
                   Student = courseRecord.getStudent().getName();
                }
           
        System.out.println(" the Best Student is :" + Student);

        }

    public void printFinalExamStudents() {
      
        Enumeration<CourseRecord> c = courseRecords.elements();

        while(c.hasMoreElements()) {
            CourseRecord course = c.nextElement();
            if (course.canTakeFinalExam()) {
                System.out.println("Student " + course.getStudent().getName() + " can take the final exam");
            } else {
                System.out.println("Student " + course.getStudent().getName() + " can not take the final ");
            }
        }
}

}
