import java.util.Scanner;

public class C {
    int a,b,c;

    void m1(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }
    void m2(){
        System.out.println(a%10);
    }
    public void method3(){
        int firstint = Integer.parseInt(Integer.toString(b).substring(0, 1));
        System.out.println(firstint);
    }
    void m4(){
        int sum = 0;
        while (c > 0){
            sum = sum+c%10;
            c = c/10;
        }
        System.out.println(sum);
    }
    public void m5(){
        int frst = Integer.parseInt(Integer.toString(b).substring(0, 1));
        System.out.println((a%10)*firstint);
    }
    public void m6(){
        int frst = Integer.parseInt(Integer.toString(b).substring(0, 1));
        System.out.println((a%10)*(frst)+firstint);
    }
}