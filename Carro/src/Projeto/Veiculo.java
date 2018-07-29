package Projeto;


public class Veiculo {

	private String marca;
	private String nome;
	private String modelo;
	private String cor;
	private int ano;
	private int portas;
	private boolean completo;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPortas() {
		return this.portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public boolean getCompleto() {
		return this.completo;
	}

	public void setCompleto(Boolean comp) {
		this.completo = comp;

	}

	// metodo construtor
	public Veiculo(String marca, String nome, String modelo, String cor, int ano, int portas, boolean completo) {
		this.marca = marca;
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.portas = portas;
		this.completo = completo;
		
	}
	
	public void format() {
		System.out.println("Marca:" + this.marca);
		System.out.println("Nome:" + this.nome);
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Cor:" + this.cor);
		System.out.println("Ano:" + this.ano);
		System.out.println("Portas:" + this.portas);
		System.out.println("Completo:" + this.completo);
	}
}
