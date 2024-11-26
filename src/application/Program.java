package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();


        System.out.println("Enter the number of tax payers ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n;i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.println("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Anual income");
            double renda = sc.nextDouble();
            if (ch == 'i'){
                System.out.println("Health expenditures: ");
                double gastos = sc.nextDouble();
                PessoaFisica pf = new PessoaFisica(renda,name,gastos);
                list.add(pf);
            }
            if (ch == 'c'){
                System.out.println("Number of employees");
                int num = sc.nextInt();
                PessoaJuridica pj = new PessoaJuridica(renda,name,num);
                list.add(pj);

            }
        }

        double sum = 0.0;

        System.out.println("Taxes paid");
        for (Pessoa pessoa: list){
            double tax = pessoa.tax();
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("Total");
        System.out.println(sum);

        sc.close();
    }
}
