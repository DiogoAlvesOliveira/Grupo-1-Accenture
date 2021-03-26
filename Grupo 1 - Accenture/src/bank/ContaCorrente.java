package bank;

public class ContaCorrente {
	private int id;
	private int contaCorrenteNumero;
	public ContaCorrente(int id, int contaCorrenteNumero) {
		super();
		this.id = id;
		this.contaCorrenteNumero = contaCorrenteNumero;
	}
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
	
}
