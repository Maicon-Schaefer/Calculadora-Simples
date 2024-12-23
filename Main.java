import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite o segundo número:");
        double segundoNumero = scanner.nextDouble();

        double resultado;

        switch (operador){
            case '+':
                resultado = primeiroNumero + segundoNumero;
                break;
            case '-':
                resultado = primeiroNumero - segundoNumero;
                break;
            case '*':
                resultado = primeiroNumero * segundoNumero;
                break;
            case '/':
                if (segundoNumero != 0) {
                    resultado = primeiroNumero / segundoNumero;
                } else{
                    System.out.println("Divisão por zero não permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println("O resultado da sua operação matemática foi: " + resultado);
        scanner.close();
    }
}