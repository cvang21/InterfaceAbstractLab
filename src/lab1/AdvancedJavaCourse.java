package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Ching Vang
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }
    
   }
