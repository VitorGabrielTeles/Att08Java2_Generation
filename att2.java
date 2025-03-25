package att_java08_2;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class att2 {
public static void main(String[] args) {
	 Scanner lerScanner = new Scanner(System.in);
	 Stack<String> pilha = new Stack<String>();
	 int opcao;
	 String livro;
	 
	 do {
		 System.out.println("***********************************************************");
         System.out.println("1 - Adicionar Livro a pilha");
         System.out.println("2 - Listar todos os Livros");
         System.out.println("3 - Retirar Livro da Pilha");
         System.out.println("0 - Sair");
         System.out.println("***********************************************************");
         System.out.print("Escolha uma opção: \n");

         opcao = lerScanner.nextInt();
         lerScanner.nextLine();
         
         switch (opcao) {
         
            case 1:    
            	System.out.println("\nDigite o nome do Livro: ");
            	livro = lerScanner.nextLine();
            	pilha.push(livro);
            	System.out.println("O Livro foi adicionado!\n");

            break;
            
            case 2:
            	if (pilha.isEmpty()) {
                    System.out.println("\nA pilha está vazia!\n");
                } else {
                    System.out.println("\n=== Livro na Pilha ===");
                    Iterator<String> iterator = pilha.iterator();
                    while (iterator.hasNext()) {
                        System.out.println("- " + iterator.next());
                    }
                    System.out.println();
                }
            break;	
            
            case 3:
            	 if (pilha.isEmpty()) {
                     System.out.println("\nA pilha está vazia! Não há livros para remover.\n");
                 } else {
                     System.out.println("\nO livro " + pilha.pop() + " foi removido!\n");
                 }
            break;	
            
            case 0:
            	System.out.println("Programa finalizado! ");
            break;	
            
            default:
                System.out.println("\nOpção inválida! Digite um número entre 0 e 3.\n");
         }
         
         
         
	 }while (opcao != 0);		 
	
	 }
}