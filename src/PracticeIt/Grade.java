package PracticeIt;

public class Grade {
    public static void main(String[] args) {
         double average = 76.7;

         String grade;

         if (average >= 90){
             grade = "A";
         }else if (average >= 80){
             grade = "B";
         }else if (average >= 70){
             grade = "C";
         }else if (average >= 60){
             grade = "D";
         }else  {
             grade ="F";
         }
        System.out.println("Your grade is : "+grade);
    }
}
