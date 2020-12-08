package MuhtarOnly.StudentInfo;

public class Student {
    public String name;
    public int age;
    public char gender;
    public String ID;

    public void setInfo(String studentName, int studentAge, char studentGender, String studentID){
        name = studentName;
        age = studentAge;
        gender = studentGender;
        ID = studentID;
    }
    public void getInfo(){
        System.out.println(name+" "+ age +" "+ gender+" "+ID);
    }
    public void study(){
        System.out.println(name+" is studying now. Don't Disturb!");
    }
    public void sleep(){
        System.out.println(name+" is sleeping now.");
    }
    public void practice(){
        System.out.println(name+" started practice replit tasks");
    }

}
