// Nome -> William C S de Carvalho
// Turma -> Ads3nc
// Periodo -> Noturno
// RA -> 105637

// ------------------------- Pasta -----------------------------------
package br.com.fecaf.model;

// --------------------- Importa os classes à serem usadas -----------------
import java.util.Scanner;

// Nesses "imports" abaixo, segue a mesma regra que citei no arquivo menu
import static java.lang.System.out;
import static java.lang.Math.pow;
import static java.lang.Math.max;
import static java.lang.Math.min;

// Obs -> "Mas ora vc usa sem 'System' ora não", como eu peguei o código feito
// não vi necessidade de mudar alguns prints, já outros sim, então neles apaguei
// a linha e reescrevi

// ---------------- Classe Triangulo ----------------------
public class Triangulo implements Figura{
    // Variáveis necessárias para os métodos da classe
    public double area, perimetro, altura, hip, c1, c2,base;

    Scanner scanner = new Scanner(System.in); // Já explicado nos outros arquivos

    // ---------------- Metodo cadastrar ---------------------
    // Define os valores das principais variáveis
    public void cadastrar() {
        out.println("\n/************************/");
        out.println("/*   Cadastro Triângulo  */");
        out.println("/************************/");
        out.print("Informe a base: ");
        base = scanner.nextDouble();
        out.print("Informe o primeiro lado: ");
        double lado2 = scanner.nextDouble();
        out.print("Informe o segunda lado: ");
        double lado3 = scanner.nextDouble();
        out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        out.println("\n/* Triângulo Cadastrado com Sucesso! */\n");

        // Determina qual é a hipotenusa (maior lado)
        hip = max(base, max(lado2, lado3));

        // Determina quais são os catetos.
        // Coloquei "c1" para ser o maior dos catetos para facilitar
        // nas outras funções.
        if (hip == base) {
            c1 = max(lado2,lado3);
            c2 = min(lado2,lado3);
        } else if (hip == lado2) {
            c1 = max(base,lado3);
            c2 = min(base,lado3);
        } else {
            c1 = max(base,lado2);
            c2 = min(base,lado2);
        }
    }

    // ---------------- Metodo calcularArea ---------------------
    // Calcula a área da figura
    public void calcularArea() {
        out.println("/*********************************/");
        out.println("/*        Calculando Área        */");
        out.println("/*********************************/");

        area = (base * altura) / 2;
        out.println("/***********************************/");
        out.printf("A área é: %.2f\n", area);
        out.println("/*********************************/");
    }

    // ---------------- Metodo calcularPerimetro ---------------------
    // Calcula o perimetro da figura
    public void calcularPerimetro() {
        out.println("/***********************************/");
        perimetro = hip + c1 + c2;
        out.printf("O perímetro é: %.2f\n", perimetro);
        out.println("/*********************************/");
    }

    // ---------------- Metodo definirTipo ---------------------
    // Mostra em qual tipo esse triângulo se encaixa
    public void definirTipo() {
        out.println("/*********************************/");
        out.println("/*        Definindo Tipo         */");
        out.println("/*********************************/");

        if (hip == c1 && hip == c2) {
            out.println("Este Triângulo é Equilátero ...");
        } else if (hip != c1 && hip != c2 && c1 != c2) {
            out.println("Este Triângulo é Escaleno ...");
        } else {
            out.println("Este Triângulo é Isósceles ...");
        }
        out.println("/***************************************/");
    }

    // ---------------- Metodo TrianguloRetangulo ---------------------
    // Verifica se o triângulo se encaixa nas condições de retângulo
    public boolean TrianguloRetangulo() {
        out.println("*************************");
        if (pow(c1, 2) + pow(c2, 2) == pow(hip, 2)) {
            out.println("É um triângulo retângulo!");
            out.println("c1^2 + c2^2 = h^2");
            out.printf("%.2f + %.2f = %.2f\n",pow(c1, 2),pow(c2, 2),pow(hip, 2));
            out.println("*************************");
            return true;
        }
        out.println("Não é um triângulo retângulo!");
        out.println("*************************");
        return false;
    }

    // ---------------- Metodo e345 ---------------------
    // Verifica se o triângulo se encaixa nas condições 3,4,5
    public void e345() {
        out.println("***************************");
        // "%" Verifica se o resto é 0, ou seja, divisível
        if (c1 % 4 == 0 && c2 % 3 == 0 && TrianguloRetangulo()) {
            out.println("O triângulo se encaixa na condição 3,4,5.");
            out.printf("cateto 1 (4) -> %.2f\n",c1);
            out.printf("cateto 2 (3) -> %.2f\n",c2);
            out.printf("hipotenusa (5) -> %.2f\n",hip);
        } else {
            out.println("O triângulo não se encaixa na condição 3,4,5.");
        }
        out.println("***************************");
    }

    // ---------------- Metodo opcoesMenu ---------------------
    // Imprime as escolhes de funções da classe
    public void opcoesMenu() {
        out.println("\n\n/**************************/");
        out.println("/****     Triângulo      ****/");
        out.println("/**************************/");
        out.println("/* 1 - Calcular Área      */");
        out.println("/* 2 - Calcular Perímetro */");
        out.println("/* 3 - Verificar se é Triângulo Retângulo */");
        out.println("/* 4 - Verificar se é Triângulo 3,4,5 */");
        out.println("/* 5 - Qual o tipo do triângulo? */");
        out.println("/* 6 - Sair               */");
        out.println("/**************************/");
        out.print("\n\nInforme a opção desejada: ");
    }

    // ---------------- Metodo Nome ---------------------
    // Retorna o nome da classe
    public String Nome(){
        return "Triângulo";
    }
}
