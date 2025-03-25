package att_java08_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class att1 {
public static void main(String[] args) {
	 Scanner lerScanner = new Scanner(System.in);
	 LinkedList<String> fila = new LinkedList<String>();
	 int opcao;
	 String nome;
	 
	 do {
		 System.out.println("***********************************************************");
         System.out.println("1 - Adicionar Cliente na Fila");
         System.out.println("2 - Listar todos os Clientes");
         System.out.println("3 - Retirar Cliente da Fila");
         System.out.println("0 - Sair");
         System.out.println("***********************************************************");
         System.out.print("Escolha uma opção: \n");

         opcao = lerScanner.nextInt();      
         lerScanner.nextLine();
         
         switch (opcao) {
         
            case 1:    
            	System.out.println("\nDigite o nome: ");
            	nome = lerScanner.nextLine();
            	fila.add(nome);
            	System.out.println("O nome foi adicionado!\n");

            break;
            
            case 2:
            	if (fila.isEmpty()) {
                    System.out.println("\nA fila está vazia!\n");
                } else {
                    System.out.println("\n=== CLIENTES NA FILA ===");
                    Iterator<String> iterator = fila.iterator();
                    while (iterator.hasNext()) {
                        System.out.println("- " + iterator.next());
                    }
                    System.out.println();
                }
            break;	
            
            case 3:
            	 if (fila.isEmpty()) {
                     System.out.println("\nA fila está vazia! Não há clientes para remover.\n");
                 } else {
                     System.out.println("\nO cliente " + fila.remove() + " foi removido!\n");
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

