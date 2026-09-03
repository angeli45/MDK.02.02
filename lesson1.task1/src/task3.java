import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int eggs = Integer.parseInt(in.nextLine());
        if (eggs > 3) System.out.print("Рекомендую приготовить омлет.");
        else System.out.print("Рекомендую позавтракать бутербродами.");
        System.out.print("\nПриятного аппетита!");
    }
}
