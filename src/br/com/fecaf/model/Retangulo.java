// Nome -> William C S de Carvalho
// Turma -> Ads3nc
// Periodo -> Noturno
// RA -> 105637

// ------------------------- Pasta -----------------------------------
package br.com.fecaf.model;
// Package -> pasta onde o arquivo atual se encontra

// --------------------- Importa os classes à serem usadas -----------------
import java.util.Scanner; // Importa a classe Scanner para ler o "input" do usuário

import static java.lang.System.out; // Já explicado no arquivo "menu"

// Obs -> "Mas ora vc usa sem 'System' ora não", como eu peguei o código feito
// não vi necessidade de mudar alguns prints, já outros sim, então neles apaguei
// a linha e reescrevi

// ---------------- Classe Retangulo ----------------------
public class Retangulo implements Figura{
    // Variáveis necessárias para os métodos da classe
    public double lado1, lado2, area, perimetro;
    String name;

    Scanner scanner = new Scanner(System.in); // Já explicado nos outros arquivos

    // ---------------- Metodo cadastrar ---------------------
    // Define os valores das principais variáveis
    public void cadastrar() {
        System.out.println("/*************************/");
        System.out.println("/** Cadastrar Retangulo **/");
        System.out.println("/*************************/");
        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("\nRetangulo Cadastrado com Sucesso !\n");

        name = "Retangulo";
    }

    // ---------------- Metodo calcularArea ---------------------
    // Calcula a área da figura
    public void calcularArea() {
        System.out.println("/***********************************/");
        area = lado1 * lado2;
        System.out.println("A area é: " + area);
        System.out.println("/***********************************/");
    }

    // ---------------- Metodo calcularPerimetro ---------------------
    // Calcula o perimetro da figura
    public void calcularPerimetro () {
        System.out.println("/***********************************/");
        perimetro = lado1 * 2 + lado2 * 2;
        System.out.println("O Perimetro é: " + perimetro);
        System.out.println("/***********************************/");
    }

    // ---------------- Metodo definirQuadrado ---------------------
    // Define se é quadrado vendo se os lados são iguais
    public void definirQuadrado() {
        if (lado1 == lado2) {
            System.out.println("\n\n/***********************************/");
            System.out.println("Isso é um Quadrado ...");
            System.out.println("/***********************************/");
            return;
        }
        System.out.println("/***********************************/");
        System.out.println("Não é um Quadrado ...");
        System.out.println("/***********************************/\n\n");
    }

    // ---------------- Metodo opcoesMenu ---------------------
    // Imprime as escolhes de funções da classe
    public void opcoesMenu() {
        out.println("\n\n/**************************/");
        out.printf("/****     %s      ****/\n", name);
        out.println("/**************************/");
        out.println("/* 1 - Calcular Area      */");
        out.println("/* 2 - Calcular Perimetro */");
        out.println("/* 3 - Verifica se é quadrado */");
        out.println("/* 4 - Sair               */");
        out.println("/**************************/");
        System.out.print("\n\nInforme a opção desejada: ");
    }

    // ---------------- Metodo Nome ---------------------
    // Retorna o nome da classe
    public String Nome(){
        return "Retangulo";
    }

}
