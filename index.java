import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   // exercicio1
   // String planeta = "Plutão";
   // System.out.println(planeta);

    //exercicio 2
    //System.out.println("Qual o seu nome?");
    //Scanner pergunta1 = new Scanner(System.in);
    //String nome = pergunta1.nextLine();
    //System.out.println("Olá " + nome);

    //exercicio 3
    //System.out.println("Qual o seu nome?");
    //Scanner perg1 = new Scanner(System.in);
    //String nome = perg1.nextLine();
    //System.out.println("Digite sua idade");
    //int idade = perg1.nextInt();
    //System.out.println("Olá " + nome + ", sua idade é " + idade);

    //exercicio 4
    //retângulo
    //System.out.println("Qual o valor da base do retângulo?");
    //Scanner perg1 = new Scanner(System.in);
    //int base = perg1.nextInt();
    //System.out.println("Qual o valor da altura do retângulo?");
    //int altura = perg1.nextInt();
    //System.out.println("O valor da aréa do retângulo é " + base * altura);

    //quadrado
    //System.out.println("Qual o valor do lado do quadrado?");
    //Scanner perg1 = new Scanner(System.in);
    //int lado = perg1.nextInt();
    //System.out.println("O valor da aréa do quadrado é " + lado * lado);

    //trapézio
    //System.out.println("Qual o valor do base maior?");
    //Scanner perg1 = new Scanner(System.in);
    //int baseMaior = perg1.nextInt();
    //System.out.println("Qual o valor do base menor?");
    //int baseMenor = perg1.nextInt();
    //System.out.println("Qual o valor da altura?");
    //int altura = perg1.nextInt();
    //System.out.println("A aréa do trapézio é " + (baseMaior + baseMenor)*altura/2);

    //losango
    /*System.out.println("Qual o valor da diagonal maior?");
    Scanner scan = new Scanner(System.in);
    int diagMaior = scan.nextInt();
    System.out.println("Qual o valor da diagonal menor?");
    int diagMenor = scan.nextInt();
    System.out.println("A aréa do losango é " + (diagMaior * diagMenor)/2);*/

    //paralelogramo
    /*System.out.println("Qual o valor da base?");
    Scanner scan = new Scanner(System.in);
    int base = scan.nextInt();
    System.out.println("Qual o valor da altura?");
    int altura = scan.nextInt();
    System.out.println("A aréa do paralelogramo é " + (base * altura));*/

    //triangulo
    /*System.out.println("Qual o valor da base?");
    Scanner scan = new Scanner(System.in);
    int base = scan.nextInt();
    System.out.println("Qual o valor da altura?");
    int altura = scan.nextInt();
    System.out.println("A aréa do paralelogramo é " + (base * altura)/2);*/

    //exercicio 5
    /*System.out.println("Informe um valor");
    Scanner scan = new Scanner(System.in);
    int valorUm = scan.nextInt();
    if(valorUm < 0){
     System.out.println("O número informado é negativo"); 
    }
    else if(valorUm > 0){
      System.out.println("O número informado é positivo");
    }
    else{
      System.out.println("O valor informado é zero");
    }*/

    
    //exercicio 6
    /*System.out.println("Informe um valor");
    Scanner scan = new Scanner(System.in);
    int valorUm = scan.nextInt();

    System.out.println("Informe um segundo valor");
    int valorDois = scan.nextInt();

    System.out.println("Informe terceiro valor");
    int valorTres = scan.nextInt();
    if(valorUm > valorDois && valorUm > valorTres){
     System.out.println("O valor maior é " + valorUm);
    }
    else if(valorDois > valorUm && valorDois > valorTres){
    System.out.println("O maior valor é" + valorDois);
    }
    else{
    System.out.println("O maior valor é " + valorTres);
    }*/
    

    //exercicio 7
   /* System.out.println("Informe um valor");
    Scanner scan = new Scanner(System.in);
    int valorUm = scan.nextInt();

    System.out.println("Informe um segundo valor");
    int valorDois = scan.nextInt();

    System.out.println("Informe terceiro valor");
    int valorTres = scan.nextInt();

    if(valorUm < valorDois && valorUm < valorTres){
      System.out.println("Soma = " + (valorDois + valorTres));
    };
    else if(valorDois < valorTres && valorDois < valorUm){
      System.out.println("Soma = " + (valorTres + valorUm));
    };
    else{
      System.out.println("Soma = " + (valorDois + valorUm));
    };*/

    //exercicio 8 
    /*System.out.println("Informe um valor");
    Scanner scan = new Scanner(System.in);
    int valorUm = scan.nextInt();
    System.out.println("Informe um segundo valor");
    int valorDois = scan.nextInt();

    while(valorDois <= 0){
      System.out.println("Informe um valor maior que 0");
      valorDois = scan.nextInt();
    }

    System.out.println("O resultado da divisão é " + (valorUm / valorDois));*/
  }
}
