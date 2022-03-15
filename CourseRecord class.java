import java.util.Vector; 
import java.util.Enumeration; 
import java.util.Iterator;
public class CourseRecord {
private Student student; 
private Vector assignments;
CourseRecord() {assignments=new Vector();} 
public Student getStudent() {
return student;
}
public void setStudent(Student s) { 
student = s;
}public void addAssignment(Assignment a) { 
assignments.addElement(a);
}
public Enumeration getAssignments() { 
return assignments.elements();
}
public double average() {

        double sum = 0.0;
        double average = 0.0;
        int numberOfMark = 0;
        Vector<Assignment> x = (Vector<Assignment>) Assignment.Elements();
        Iterator itr = x.iterator();
        while (itr.hasNext()) {
            sum += x.elements().getMark();
        }
        numberOfMark++;
        average = sum / numberOfMark;

        return average;

    }
  public boolean canTakeFinalExam() {
       
        int count = 0;
        Enumeration<Assignment> x = assignments.elements();
        while(x.hasMoreElements()) {
            Assignment y = x.nextElement();
            
                y.getMark();
            
        }
        
        return count >= 3;
    }
}
