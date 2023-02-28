// 1 - Pacote
package intro;


// 2 - Referência as bibliotecas

import java.sql.SQLOutput;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Calculo de Areas");

    }

    public void calcularAreaModoExtenso{

        // Calculo de area - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;

        resultado = largura * comprimento;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a area é de " +resultado+ "m2");

    }


    public void calcularAreaModoCompacto(){

        //Calculo de area Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a area é de " + largura*comprimento + "m2");
    }

}
