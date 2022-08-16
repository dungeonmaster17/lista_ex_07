package app;

import entidades.Funcionario;
import entidades.INSS;
import entidades.servicos.ServicoDeCalculadora;
import entidades.servicos.ServicoDoINSS;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.util.Locale.US;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(US);


        System.out.print("Nome INSS: ");
        String empresa = sc.next();

        INSS inss = new INSS(empresa, new ServicoDeCalculadora());

        System.out.print("N funcionarios: ");
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            System.out.print("Func Nome: ");
            String nomeF = sc.next();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            System.out.print("Horas trab: ");
            int horasTrab = sc.nextInt();

            System.out.print("Valor Hora: ");
            double valorHora = sc.nextDouble();

            System.out.print("Num depen: ");
            int numDepen = sc.nextInt();

            Funcionario f = new Funcionario(nomeF, salario, horasTrab, valorHora, numDepen, inss);
            inss.addPensionista(f);
        }
        inss.imprimirHolerite();





    }




}
