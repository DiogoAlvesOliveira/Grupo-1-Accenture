package bank;

public class ContaCorrente {
	private int id;
	private int contaCorrenteNumero;
	//construtor
	public ContaCorrente(int id, int contaCorrenteNumero) {
		super();
		this.id = id;
		this.contaCorrenteNumero = contaCorrenteNumero;
	}
	//metodos gets e sets
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContaCorrenteNumero() {
		return contaCorrenteNumero;
	}
	public void setContaCorrenteNumero(int contaCorrenteNumero) {
		this.contaCorrenteNumero = contaCorrenteNumero;
	}
	// metodo para depositar
	//falta programas o metodo
	public void deposito(double valor) {
		
	}
	//metodo para sacar
	//falta programas o metodo
	public void saque(double valor) {
		
	}
	//metodo para transferir
	//falta programas o metodo
	public void trasnferencia(double valor) {
		
	}
	//metodo para consultar o extrato da sua conta
	//falta programas o metodo
	public double extrato() {
		double valor = 0;
		return valor;
	}
	//metodo pararecalcular o extrato da sua conta
	//falta programas o metodo
	public double recalcularSaldo() {
		double saldo = 0;
		return saldo;
	}
}
