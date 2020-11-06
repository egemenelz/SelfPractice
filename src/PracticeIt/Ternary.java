package PracticeIt;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result;

        result = (num %2 ==0)? "even": "Odd";

        int num1 = 50;
        int num2 = 60;
        int num3 = 2000;

        if (num1> num2){
            System.out.println(num1 +" is maximum");
        }else{
            System.out.println(num2 +" is maximum");
        }
        String max = (num1 > num2)? "Num1 max" : "Num2 max";

        if (num1 < num2){
            System.out.println(num1 + " is minimum");
        }else{
            System.out.println(num2 +" is minimum");
        }
        String min = (num1 < num2)? "Num1 min" : "Num2 min";

        if (num1 > num2 && num1 > num3){
            System.out.println(num1+ " is max");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 +" is max");
        }else{
            System.out.println(num3 +" is max");
        }
        String min2 = (num1 > num2 && num1 > num3) ? "Num1 is max" :(num2 > num1 && num2 > num3)?"Num2 is max":"Num3 is max";
        System.out.println(min2);

        if(num1 < num2 && num1< num3){
            System.out.println(num1+" is min");
        }else if (num2 < num1 && num2 < num3){
            System.out.println(num2+" is min");
        }else{
            System.out.println(num3+" is min");
        }
    }
}
