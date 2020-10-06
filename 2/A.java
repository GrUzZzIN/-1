import java.util.Scanner;


class B {
    int y;
    public void me1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Y: ");
        y = scanner.nextInt();
    }
}

public class A extends B{
    public A(){
        System.out.println("Hello");
    }
    int x;

    void m1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X: ");
        x = scanner.nextInt();
    }
    void m2(){
        System.out.println(x+12);
    }
    void m3(){
        if (x%2 == 0){
            System.out.println("is even");
        }
        else {
            System.out.println("is odd");
        }
    }
    public void me2(){
        System.out.println("Input Y+X: ");
        System.out.println(y+x);
    }
}