/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ching Vang
 */
public interface Course {
    
    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);    

    public abstract double getCredits();

    public abstract void setCredits(double credits);

    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);
    
    public String getPrerequisites();
    
    public void setPrerequisites(String prerequisites);

}
