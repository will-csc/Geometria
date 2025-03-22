// Nome -> William C S de Carvalho
// Turma -> Ads3nc
// Periodo -> Noturno
// RA -> 105637

// ------------------------- Pasta -----------------------------------
package br.com.fecaf.model;

// --------------------- Importa os classes à serem usadas -----------------
import java.util.Scanner;

// Nesses "imports" abaixo, segue a mesma regra que citei no arquivo menu
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.out;

// Obs -> "Mas ora vc usa sem 'System' ora não", como eu peguei o código feito
// não vi necessidade de mudar alguns prints, já outros sim, então neles apaguei
// a linha e reescrevi

// ---------------- Classe Circulo ----------------------
public class Circulo implements Figura {
    // Variáveis necessárias para os métodos da classe
    public double raio, area, perimetro;

    Scanner scanner = new Scanner(System.in); // Já explicado nos outros arquivos

    // ---------------- Metodo cadastrar ---------------------
    // Define os valores das principais variáveis
    public void cadastrar() {
        System.out.println("/******************************/");
        System.out.println("/*      Cadastro Circulo      */");
        System.out.println("/******************************/");
        System.out.print("Informe o raio do circulo: ");
        raio = scanner.nextDouble();
        System.out.println("\nCirculo Cadastrado com Sucesso !\n");
    }

    // ---------------- Metodo Nome ---------------------
    // Retorna o nome da classe
    public String Nome(){
        return "Circulo";
    }

    // ---------------- Metodo calcularArea ---------------------
    // Calcula a área da figura
    public void calcularArea() {
        System.out.println("/***********************************/");
        area = PI * pow(raio, 2);
        System.out.println("A area é " + area);
        System.out.println("/***********************************/");
    }

    // ---------------- Metodo calcularPerimetro ---------------------
    // Calcula o perimetro da figura
    public void calcularPerimetro() {
        System.out.println("/***********************************/");
        perimetro = 2 * PI * raio;
        System.out.println("O perimetro é " + perimetro);
        System.out.println("/***********************************/");
    }

    // ---------------- Metodo opcoesMenu ---------------------
    // Imprime as escolhes de funções da classe
    public void opcoesMenu() {
        out.println("\n\n/**************************/");
        out.println("/********* Circulo ********/");
        out.println("/**************************/");
        out.println("/* 1 - Calcular Area      */");
        out.println("/* 2 - Calcular Perimetro */");
        out.println("/* 3 - Sair               */");
        out.println("/**************************/");
        System.out.print("\n\nInforme a opção desejada: ");
    }
}
