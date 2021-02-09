import java.util.ArrayList;

public class Somthg {

}

class Phone{
    static int number;

    public Phone(String str){
        this(str.length());
    }
    public Phone(int num){
        this();
        number+=num;
    }

    public Phone(){
        number+=1;
    }
}
class Test{
    public static void main(String[] args) {
        new Phone("iphone");
        new Phone();
        new Phone(4);
        System.out.println(Phone.number);
    }
}
class Ball{
    boolean canBounce;
    String color;

    public static void main(String[] args) {
        Ball ball = new Ball();
        String color;
        color = "red";
        System.out.println(ball.color);
    }
}

class A{
    int count;
    public void m(){
        count++;
    }
    public void m(int b){
        count *= b;
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.m(5);
        obj.m();
        obj.count+=10;
        obj.m(2);
        System.out.println(obj);
    }
}
class Book{
    int pages;
    static String author;
    static {
        author = "Stephen King";
    }
    public void set(int pages){
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.set(500);
        b1.author = "Christopher Paolini";
        Book b2 = new Book();
        System.out.println(b1.author.equals(b2.author));
        System.out.println(b1.pages == b2.pages);
    }
}