package AtividadeRevisao;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // Digitar um valor, se for maior que 10 digitar maior que 10, se for menor,
        // digitar menor que 10
        System.out.println("Informe um valor");
        double valor = sc.nextDouble();
        if (valor > 10) {
            System.out.println("O valor é maior que 10");
        } else if (valor < 10) {
            System.out.println("O Valor é menor que 10");
        } else {
            System.out.println("O valor é igual que 10");
        }
    }
    public void exemplo2(){
        System.out.println("Digite a quantidade de horas trabalhdas");
        double valorQHT = sc.nextDouble();
        System.out.println("Digite o valor da sua hora trabalhada");
        double valorVHR = sc.nextDouble();
        double valorHE = (valorQHT - 200) * 1.5 * valorVHR;
        double salarioN = ( 200 * valorVHR );
        double salarioC = (salarioN + valorHE);
        System.out.println("Salário a receber é de R$ " +salarioC);
    }
}
