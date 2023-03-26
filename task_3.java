import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task_3 {
    public static void main(String[] args) {
        Scanner symbol = new Scanner(System.in);
        System.out.print("Enter num1 --> ");
        double num1 = symbol.nextDouble();
        System.out.print("Enter action --> ");
        String action = symbol.next();
        System.out.print("Enter num2 -->  ");
        double num2 = symbol.nextDouble();
        
        String a = "+";
        String b = "-";
        String c = "*";
        String d = "/";

        if (action.equals(a))
            System.out.println(num1 + num2);
        
        if (action.equals(b))
            System.out.print(num1 - num2);
        
        if (action.equals(c))
            System.out.print(num1*num2);
        
        if (action.equals(d))
            System.out.print(num1/num2);
        
        symbol.close();
        }
            
}
