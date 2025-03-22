// ------------------------- Pasta -----------------------------------
package br.com.fecaf.model;

// ---------------- Interface Figura ----------------------
// Explicação -> a interface do java funciona praticamente igual ao
// pré-processador do "C", é como se vc definisse uma função padrão
// e depois colasse elas em suas classes

// "Default" -> 'keyword' usada para definir uma função padrão
// caso a classe que herdar não a sobreponha

public interface Figura {
    // Retorna o nome da classe
    default String Nome(){return "";};

    // Calcula a área da figura
    default void calcularArea(){};

    // Calcula o perimetro da figura
    default void calcularPerimetro(){};

    // Define os valores das principais variáveis
    default void cadastrar(){};

    // Imprime as escolhes de funções da classe
    default void opcoesMenu(){};

    // ------------------ O restante são funções que são usadas para um tipo específico ------------------

    // Definição dentro da classe Retângulo
    default void definirQuadrado(){};

    // Definição dentro da classe Triângulo
    default void definirTipo(){};

    // Definição dentro da classe Triângulo
    default boolean TrianguloRetangulo(){ return false; };

    // Definição dentro da classe Triângulo
    default void e345(){};
}
