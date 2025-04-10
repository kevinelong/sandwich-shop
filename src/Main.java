import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Prompt the user for the size of the sandwich (1 or 2):
//        - 1: Regular: base price $5.45
//        - 2: Large: base price $8.95
        System.out.print("Size (1 or 2): ");
        int size = s.nextInt();
//        Prompt the user for their age:
        System.out.print("Age in years: ");
        int age = s.nextInt();
        double basePrice = 5.45;
        if( size == 2){
            basePrice = 8.95;
        }
        double discount = 0;
//        - Student (17 years old or younger) — receive a 10% discount
        if(age <=17){
            discount = 0.1;
        }
//        - Seniors (65 years old or older) — receive a 20% discount
        if(age >= 65){
            discount = 0.2;
        }
        double discountAmount = basePrice * discount;
        double finalPrice = basePrice - discountAmount;
//        Display the cost of the sandwich to the screen
        System.out.printf("BASE PRICE: %.2f \n", basePrice);
        System.out.printf("DISCOUNT PERCENT: %.0f%% \n", discount * 100);
        System.out.printf("DISCOUNT AMOUNT: %.2f \n", discountAmount);
        System.out.printf("FINAL PRICE: %.2f \n", finalPrice);
    }
}