/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author Andiswa Dube (ST10459576)
 */
public class Learner {
    //Create attrivutes for learner details
   private String fullName;
   private String subject;
   private double assignmentMark;
   private double testMark;
   private double examMark;
   
   //create constructors for setting default values to their attributes 

    public Learner() {
        this.fullName = "";
        this.subject ="";
        this.assignmentMark = 0.0;
        this.testMark = 0.0;
        this.examMark = 0.0;
        
        //getters that return the values for each attributes
        
        
    }

    public String getFullName() {
        return fullName;
    }

    public String getSubject() {
        return subject;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public double getTestMark() {
        return testMark;
    }

    public double getExamMark() {
        return examMark;
    }

    //setter that assign values for each attribute

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public void setTestMark(double testMark) {
        this.testMark = testMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }
    
    /*method calculate the final mark
    
    */
    

  public double calcFinalMark(){
      return (getAssignmentMark()+ getExamMark() + getTestMark())/3;
      
  }

   }
          
  
      
      
      
  
    
  
    
   
   
    

