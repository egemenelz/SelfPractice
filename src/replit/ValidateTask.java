package replit;

public class ValidateTask {
    public static boolean validateTask(boolean notEmpty, int taskId, int currentId){
        if (notEmpty){
            if (taskId - currentId == 1)
            return true;
        }else{
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validateTask(true,3,1));
    }
}
