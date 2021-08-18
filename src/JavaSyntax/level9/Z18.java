package level9;

//Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
//Если все числа равны, выведи любое из них.

import java.util.Scanner;

public class Z18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if  (a>b && a<c || a>c && a<b){
            System.out.println(a);
        }else if (a<b && c>b || b>c && b<a) {
            System.out.println(b);
        }else if (c<b && a<c || c>b && c<a){
            System.out.println(c);
        }else if (a==b && c!=b || a==c && b!=c){
            System.out.println(a);
        }else if (b==c && a!=b) {
            System.out.println(b);
        }else if (a==b && b==c) {
            System.out.println(c);
        }
    }
}
