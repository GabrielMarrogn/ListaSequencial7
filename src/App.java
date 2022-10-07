import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double lado, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de um lado");
        lado = sc.nextDouble();
        area = lado * lado;
        area = area * 2;
        System.out.println("O valor do dobro da area é: " +area);
        sc.close();
    }
}
