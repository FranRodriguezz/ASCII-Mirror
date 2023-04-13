import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        if (a == 1){
            System.out.println("Yes!");
        }
        else if (a > 4){
            System.out.println("Unknown number");
        }
        else{
            System.out.println("No!");
        }
    }
}