package CodingBat;

public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("abc","abc"));

    }
    public static int stringMatch (String a , String b){
        int shorter = Math.min(a.length(), b.length());//defining which one is shorter
        int count = 0 ;
        for (int i= 0 ,j=0; i < shorter-1; i++){
            if (a.substring(i,i +2).equals(b.substring(i,i+2))){
                count++;
            }
        }return count;
    }
    //xxcaazz --> {x , x, c, a, a, z, z}
    //xxbaaz --> {x , x, b, a, a, z}
}
