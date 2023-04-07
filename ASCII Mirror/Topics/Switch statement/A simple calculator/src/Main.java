import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long a = scanner.nextLong();
        String op = scanner.next();
        long b = scanner.nextLong();
        if(Objects.equals(op, "+")){
            System.out.println(a + b);
        }
        else if(Objects.equals(op, "-")){
            System.out.println(a - b);
        }
        else if(Objects.equals(op, "/")){
            if(b == 0){
                System.out.println("Division by 0!");
            }
            else{
                System.out.println(a / b);
            }
        }
        else if(Objects.equals(op, "*")) {
            System.out.println(a * b);
        }
        else{
            System.out.println( "Unknown operator");
        }
    }
}