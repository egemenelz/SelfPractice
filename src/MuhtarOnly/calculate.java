package MuhtarOnly;

public class calculate {
    public static void main(String[] args) {
      int firstNum = 2;
      int secondNum = 4;
      int thirdNum = 6;
      boolean check = false;
      int sum = 0;

      if (firstNum % 2 == 0){
          firstNum *= 5;
      }else {
          firstNum *= 10;
      }
      if (thirdNum % 5 == 0){
          thirdNum /= 5;
      }else {
          thirdNum /= 2;
      }
      if (check){
          sum = firstNum + secondNum + thirdNum;
          if (sum % 10 == 0){
              System.out.println(sum);
          }else {
              System.out.println("Invalid");
          }
      }else{
          sum = firstNum * secondNum * thirdNum;
          if (sum % 2 != 0){
              System.out.println(sum);
          }else{
              System.out.println("Invalid Result");
          }
      }

    }
}
