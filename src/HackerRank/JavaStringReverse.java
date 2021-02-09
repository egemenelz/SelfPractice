package HackerRank;

public class JavaStringReverse {
    public static void main(String[] args) {
        String A= "madam";
        /* Enter your code here. Print output to STDOUT. */
        String B ="";
        for(int i = A.length()-1; i>= 0; i--){
            B += ""+A.charAt(i);
        }
        if(A.equals(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
