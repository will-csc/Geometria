// Nome -> William C S de Carvalho
// Turma -> Ads3nc
// Periodo -> Noturno
// RA -> 105637

// ------------------------- Pasta -----------------------------------
package br.com.fecaf.controller;
// Package -> pasta onde o arquivo atual se encontra

// --------------------- Importa os arquivos/classes à serem usadas -----------------
import br.com.fecaf.model.*; // Importa tudo dentro da pasta "model"
import java.util.Scanner; // Importa a classe Scanner para ler o "input" do usuário

import static java.lang.System.out; // Esse importa não é nessecessario
// Motivo -> Uso o nvim e fonte 24, fica muito ruim ter que redigitar "System.out..." toda vez, então
// para mim é mais fácil fazer o import estatico e digitar menor

// ---------------- Classe Menu ----------------------
public class Menu {
    // Cria uma instância de "Scanner" para ler o "input" do usuário
    Scanner scanner = new Scanner(System.in);

    // ----------------- Metodo para executar as principais funções do menu -----------------
    public void executarMenu () {
        boolean exit = false; // Variável condicional para controle do proprío usuário

        // inicia o looping para o usuário escolher qual figura usar
        while (!exit) {
            // Interface Gráfica para o usuário escolher uma opção
            out.println("\n\n/*******************/");
            out.println("/*    Geometria    */");
            out.println("/*******************/");
            out.println("/* 1 - Circulo     */");
            out.println("/* 2 - Retângulo   */");
            out.println("/* 3 - Triângulo   */");
            out.println("/* 4 - Sair        */");
            out.println("/*******************/\n");

            // "Input" do usuario para escolher a figura
            out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();

            // Seleciona a opção adequada
            // Explicação -> Mudei oque foi feito em aula pois estava muito complicado de ler codigo repitido
            // fora criado uma outra função para esse repetição com implementação de uma interface para as funções
            switch (optionUser) {
                case 1: // Circulo
                    Circulo circulo = new Circulo();
                    opcoesFiguras(circulo);
                    break;
                case 2: // Retangulo
                    Retangulo retangulo = new Retangulo();
                    opcoesFiguras(retangulo);
                    break;
                case 3: // Triangulo
                    Triangulo triangulo = new Triangulo();
                    opcoesFiguras(triangulo);
                    break;
                case 4: // Sai da aplicação
                    out.println("\n\n*******************");
                    out.println("Saindo...");
                    out.println("*******************");
                    exit = true;

                    break;
                default:
                    // Explicação -> caso a opção seja fora do padrão, vem para esse bloco
                    // Serve para os outros switches
                    out.println("Selecione uma opção válida!");
                    break;
                    // "break" -> termina esse bloco de código para nao testar as outras condições
                    // serve para outros outros "switches"
            }
        }
    }

    // ----------------- Metodo Generico para as opções -----------------

    // a interface "Figura" está em "model".

    // É uma função para evitar a repetição dentro do switch case, como não da para colocar um único tipo
    // como parâmetro, busquei a tipagem genêrica atráves da implementação de uma interface com as funções à serem
    // utilizadas.

    // Link do meu drive e github onde pratico esses estudos em Java
    // Drive -> https://drive.google.com/drive/folders/1-cBVUbQihxetICaVGP9uLTjvFJLvtElr?usp=sharing
    // Github -> https://github.com/will-csc

    public <F extends Figura> void opcoesFiguras(F figura){
        boolean exit = true; // Variável condicional para controle do proprío usuário

        figura.cadastrar(); // Cadastra as principais variáveis da figura
        // Obs -> Era muito melhor utilizar construtor, mas como ja estava feito e
        // hoje é sabado a noite deu preguiça de mudar

        // inicia o looping para o usuário escolher qual metodo da figura usar
        while (exit) {
            figura.opcoesMenu(); // Imprime as opções da figura escolhida
            int option = scanner.nextInt(); // Escolha do usuário

            // Seleciona a opção
            switch (option) {
                case 1:
                    figura.calcularArea(); // Calcula a area
                    break;
                case 2:
                    figura.calcularPerimetro(); // Calcula o Perimetro
                    break;
                case 3:
                    if(figura.Nome().equals("Circulo")){ // Opção 3 do circulo -> Sair
                        exit = false;
                    } else if (figura.Nome().equals("Retangulo")) { // Opção 3 do Retangulo -> testa se é quadrado
                        figura.definirQuadrado();
                    }else{
                        figura.TrianguloRetangulo(); // Opção 3 do Triângulo -> testa se é triângulo retângulo
                    }
                    break;
                case 4:
                    if(figura.Nome().equals("Circulo")){ // Opção 4 do circulo -> Opção inválida
                        out.printf("Escolha uma Opção Válida !");
                    } else if (figura.Nome().equals("Retangulo")) { // Opção 4 do Retangulo -> Sair
                        exit = false;
                    }else{
                        figura.e345(); // Opção 4 do Triângulo -> testa se é triângulo 3,4,5
                    }
                    break;
                case 5:
                    if(figura.Nome().equals("Triângulo")){ // Opção 5 do Triângulo -> mostra o tipo do triângulo
                        figura.definirTipo();
                    }else{
                        out.printf("Escolha uma Opção Válida !"); // Opção 5 das outras figuras -> Opção inválida
                    }
                    break;
                case 6:
                    if(figura.Nome().equals("Triângulo")){ // Opção 6 do Triângulo -> Sair
                        exit = false;
                    }else{ // Opção 6 das outras figuras -> Opção inválida
                        out.printf("Escolha uma Opção Válida !");
                    }
                    break;
                default:
                    out.printf("Escolha uma Opção Válida !");
                    break;
            }
        }
    }
}


