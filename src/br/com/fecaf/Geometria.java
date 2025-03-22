// Nome -> William C S de Carvalho
// Turma -> Ads3nc
// Periodo -> Noturno
// RA -> 105637

// ------------------------- Pasta -----------------------------------
package br.com.fecaf;
// Package -> pasta onde o arquivo atual se encontra

// --------------------- Importa os arquivos/classes à serem usadas -----------------
import br.com.fecaf.controller.Menu; // Importa o menu, dentro da pasta "controller", para utiliza-lo

// ------------------------- Classe Geometria -----------------------------------
public class Geometria {
    // ------------------- Função principal -------------------
    public static void main(String[] args) {
        Menu menu = new Menu(); // Instância o menu
        menu.executarMenu(); // Executa oque tem dentro de menu
    }
}
