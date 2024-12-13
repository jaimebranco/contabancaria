package conta.model;

// classe abstrata => base para criar outras classes
public abstract class Conta {

	// Atributos / Variáveis
	private int numero; // 0
	private int agencia; // 1
	private int tipo; // 1
	private String titular; // "João"
	private float saldo; // 50f

	/*
	 * Comportamentos/Métodos * Encapsulamento/protegendo os arquivos
	 * 
	 * Privated (Celular particular) - Somente a própria classe que o definiu
	 * Protected (Telefone residencial) -Somente as classes dentro do package que se
	 * encontra Public (orelhão) Default -
	 */

	/*
	 * Método especial - método construtor / transformar a conta em um objeto em si,
	 * determinar já os valores
	 */
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {

		// this => Classe conta
		// Conta.numero = atributo
		// numero = 6
		// this.numero = 6

		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;

	}
	// Comportamentos/ Métodos
	// Métodos de acesso

	// Get-> Pegar

	public int getNumero() {
		return numero;
	}
	// Set -> Colocar/Setar

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;

	}

	public void depositar(float valor) {

		this.setSaldo(this.getSaldo() + valor);
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);

	}

}
