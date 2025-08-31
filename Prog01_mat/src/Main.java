import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- Calculadora simples de números inteiros ---");
        //decalarando variáveis//
        int resultado = 0;

        //entrada do primeiro número do usuário//
        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        //entrada do operador usado na operação//
        System.out.println("Digite o operador (+, -, *, /): ");
        String operador = entrada.next();

        //entrada do segundo número do usuário//
        System.out.println("Digite o segundo número:");
        int num2 = entrada.nextInt();

        boolean operacaoValida = true;

        // usando um switch para realizar a operação com base no operador selecionada pelo usuário //
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                // verificando se é uma divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro! Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Erro! Operador inválido.");
                operacaoValida = false;
                break;
        }

        // exibindo o resultado se o operador for válido //
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        // fechando o scanner
        entrada.close();
    }
}