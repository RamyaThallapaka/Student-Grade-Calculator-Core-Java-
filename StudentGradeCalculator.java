 import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks obtained (out of 100) in subject1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks obtained (out of 100) in subject2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks obtained (out of 100) in subject3: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter marks obtained (out of 100) in subject4: ");
        int sub4 = sc.nextInt();
        System.out.print("Enter marks obtained (out of 100) in subject5: ");
        int sub5 = sc.nextInt();
        int totalMarks = sub1+sub2+sub3+sub4+sub5;
        double avgpercentage = (double) totalMarks / 5;
        String gradePercentage;
        if (avgpercentage >= 90) 
        {
            gradePercentage = "A";
        }
            else if (avgpercentage >= 85)
        {
            gradePercentage = "B";
        } 
            else if (avgpercentage >= 75) 
        {
            gradePercentage = "C";
        }
            else if (avgpercentage >= 50) 
        {
            gradePercentage = "D";
        } 
            else 
        {
            gradePercentage  = "Fail";
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgpercentage + "%");
        System.out.println("GradePercentage: " + gradePercentage);
        sc.close();
    }
}