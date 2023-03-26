import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task_3 {
    public static void main(String[] args) {
        Scanner symbol = new Scanner(System.in);
        System.out.print("Enter num1 --> ");
        float num1 = symbol.nextFloat();
        System.out.print("Enter action --> ");
        String action = symbol.next();
        System.out.print("Enter num2 -->  ");
        float num2 = symbol.nextFloat();
        float resultFloat = 0;
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
        
        if (action.equals(d)){
            resultFloat = num1/num2;
            System.out.print(resultFloat);
        }
        
        symbol.close();
        }
            
}
