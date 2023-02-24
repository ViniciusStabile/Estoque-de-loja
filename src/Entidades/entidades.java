package Entidades;

public class entidades {
	
	private String nome;
	private int codigoProduto;
	private double precoProduto;
	private int quantidade;
	
	
	
	
	
	
	public entidades() {
		
	}




	public entidades(String nome, int codigoProduto, double precoProduto, int quantidade) {
		this.nome = nome;
		this.codigoProduto = codigoProduto;
		this.precoProduto = precoProduto;
		this.quantidade = quantidade;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getCodigoProduto() {
		return codigoProduto;
	}




	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}




	public double getPreco() {
		return precoProduto;
	}




	public void setPreco(double preco) {
		this.precoProduto = preco;
	}




	public int getQuantidade() {
		return quantidade;
	}




	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	public double aumentarQuantidade(int quantidadeADD) {
		return this.quantidade += quantidadeADD
		
	;}
	
	public double diminuirQuantidade(int quantidadeRemover) {
		return this.quantidade -= quantidadeRemover
		
	;}
	
	
	public double precoTotal() {
		return quantidade * precoProduto;
	}
	
	public String toString() {
		return
				" Nome: " + nome
				+ ", codigo do Produto: " + codigoProduto
				+ ", preço: " + precoProduto
				+ ", quantidade: " + quantidade + "\n"
				;
				
	}
	
	
}


