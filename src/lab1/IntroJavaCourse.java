package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Ching Vang
 * @version     1.00
 */
public class IntroJavaCourse extends IntroToProgrammingCourse {
    
    public IntroJavaCourse(String courseName, String courseNumber, double credits){
        super(courseName,courseNumber, credits);
        this.setPrerequisites("None");
    }
}
