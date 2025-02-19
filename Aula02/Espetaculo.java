import java.util.Scanner;

public class Espetaculo {
    
    public static void main (String[] args) {

        Scanner entrada = new Scanner (System.in);
        // entrada de entradas
        System.out.println("Custo de produção");
        float custoProducao = entrada.nextFloat();

        System.out.println("Valor do ingresso");
        float valorIngresso = entrada.nextFloat();

        //Processamento dos dados 
        // Math.ceil é um metódo da classe que math que arredonda um número decimal para inteiro.
        int quantidadeConvites = (int) Math.ceil  (custoProducao / valorIngresso);
        int quantidadeConvites23 = (int) Math.ceil (custoProducao * 1.23 / valorIngresso);
        System.out.printf("Quantidade de convites = %d\n", quantidadeConvites);
        System.out.printf("Lucro de 23%%: %d\n", quantidadeConvites23  );



    }
}
