import java.util.*;
import java.lang.*;
import java.io.*;


public class Students
{   // Instance Variables 
    int ID;
    String Name;
    int CreditCompleted;
    double LastSemesterGPA;
    double CGPA;
    boolean Eligibility;
    int Percent;
    
    // Constructor Declaration of Class 
    public Students(int ID, String Name, int CreditCompleted, double ,double CGPA)
    { 
        this.ID = ID;
        this.Name = Name;
        this.CreditCompleted = CreditCompleted;
        this.LastSemesterGPA = LastSemesterGPA;
        this.CGPA = CGPA;
    }
    
    // method CalculateEligibility 
    public void CalculateEligibility()
    { 
        if (CGPA>=2.75 && CreditCompleted>=9) this.Eligibility = true
        else this.Eligibility = false
        if (this.Eligibility = false) return
        if(LastSemesterGPA>=2.75 && LastSemesterGPA<3.00) this.Percent = 25
        if(LastSemesterGPA>=3.00 && LastSemesterGPA<3.25) this.Percent = 30
        if(LastSemesterGPA>=3.25 && LastSemesterGPA<3.50) this.Percent = 35
        if(LastSemesterGPA>=3.50 && LastSemesterGPA<3.80) this.Percent = 40
        if(LastSemesterGPA>=3.80 && LastSemesterGPA<3.90) this.Percent = 50
        if(LastSemesterGPA>=3.90 && LastSemesterGPA<4.00) this.Percent = 75
        if(LastSemesterGPA = 4.00) this.Percent = 100
    }
    
    //method toString()
    public String toString()
    {
        return(ID + " " + Name + " " + CreditCompleted + " " + LastSemesterGPA + " " 
                + CGPA + " " + this.Eligibility + " " + this.Percent + "%\n")
    }
    
    public static void main(String[] args) throws Exception
    { 
        File file = new File("input.txt"); 
        FileWriter fw=new FileWriter("output.txt"); 
        
        Scanner sc = new Scanner(file); 
        
        while (sc.hasNextLine()){
             String[] list = sc.nextLine().split().map{};
             Students newstudent = new Students(list[0].toInt(), list[1], list[2].toInt(), 
                                                list[3].toDouble(), list[4].toDouble());
             fw.write(newstudent.toString()); 
        }
        
        fw.close();
    }
    } 
    
    
    
}
