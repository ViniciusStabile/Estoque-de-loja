package Programa;

/*
Um programa para simular um estoque de uma loja,
com ID,nome,preco e quantidade do produto.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entidades.entidades;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		List<entidades> estoque = new ArrayList<>();
		
		
		
		
		int escolha = 1 ;
		
		while(escolha != 4) {
			System.out.printf(" [1]Ver produtos %n [2]adicionar %n [3]Remover %n [4]Sair %n ");
			escolha = sc.nextInt();
			if(escolha == 1) {
				System.out.println(estoque);
			}
			if (escolha == 2) {
				System.out.printf(" [1]Novo produto%n [2]Produto ja existente %n");
				int add = sc.nextInt();
				if (add == 1) {
				System.out.print("Nome: ");
				String nome = sc.next();
				
				System.out.print("ID: ");
				Integer ID = sc.nextInt();
				
				System.out.print("Preço: ");
				Double preco = sc.nextDouble();
				
				System.out.print("Quantidade: ");
				Integer quantidade = sc.nextInt();
				
				entidades adicionar = new entidades(nome,ID,preco,quantidade);
				
				estoque.add(adicionar);}
				
				else {
					System.out.println("Digite o ID do produto: ");
					int idProduto = sc.nextInt();
					entidades estoque2 = estoque.stream().filter(y -> y.getCodigoProduto() == idProduto).findFirst().orElse(null);
					
					if (estoque2 == null) {
						System.out.println("Esse ID não existe");
						
					}
					else {
					
					System.out.println("Quantos produtos deseja adiconar? ");
					int adicionarProduto = sc.nextInt();
					
					
					
					estoque2.aumentarQuantidade(adicionarProduto);}
				}
				
				
				
				;}
			
			if(escolha == 3) {
				System.out.print("Digite o ID do produto que deseja diminuir a quantidade do estoque: ");
				int idProduto = sc.nextInt();
				entidades estoque2 = estoque.stream().filter(y -> y.getCodigoProduto() == idProduto).findFirst().orElse(null);
				
				if (estoque2 == null) {
					System.out.println("Esse ID nao existe");
	
				}
				else {
				
				System.out.print("Quanto produtos deseja remover: ");
				int qtdRemover = sc.nextInt();
				
				
				estoque2.diminuirQuantidade(qtdRemover);}
			}
		
				
		;}
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
