package conta.model;

public class ContaCorrente extends Conta { // extends = herança/ herda

	// Atributos / Variáveis
	private float limite;

	// Método especial - método construtor

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo); // invocando o método construtor
		this.limite = limite; // this => nome da classe
	}

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;

	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	@Override
	// Polimorfismo de Sobrescrita +> add mais lógica a um método já existente
	public void visualizar() {
		super.visualizar(); // Método da Classe Conta
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
