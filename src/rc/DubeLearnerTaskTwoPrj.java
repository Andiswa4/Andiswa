/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class DubeLearnerTaskTwoPrj {
    static Learner objLearner = new Learner();
    

      public static void main(String[] args) {
        getLearnerInput();
        displayFinalMark();
    }
      
      //method to get learner input 
      public static void getLearnerInput(){
          objLearner.setFullName(JOptionPane.showInputDialog("Enter full name"));
          objLearner.setSubject(JOptionPane.showInputDialog("Enter subject name"));
          objLearner.setTestMark(Double.parseDouble(JOptionPane.showInputDialog("Enter TestMark")));
          objLearner.setAssignmentMark(Double.parseDouble(JOptionPane.showInputDialog("Enter AssignmentMark")));
          objLearner.setExamMark(Double.parseDouble(JOptionPane.showInputDialog("Enter ExamMark")));
          
          
      }
      
      //method for calculating final mark
      public static void displayFinalMark(){
          double FinalMark = objLearner.calcFinalMark();
            JOptionPane.showMessageDialog(null, "Final mark is:" + FinalMark);
            
             }
    
}