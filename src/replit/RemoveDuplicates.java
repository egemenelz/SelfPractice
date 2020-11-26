package replit;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(uniqueChars("wooden-spoon"));

    }
    public static String uniqueChars (String str){
        String unique = "";
        for (int i = 0; i <str.length() ; i++) {
            if (!unique.contains( ""+str.charAt(i)) ){
                unique+= str.charAt(i);
            }
        }return unique;


    }
}
