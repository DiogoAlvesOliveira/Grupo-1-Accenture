package bank;

import java.util.Date;

public class Extrato{
	private int id;
	private Date dataHoraMovimento;
	private String operacao;
	public Extrato(int id, Date dataHoraMovimento, String operacao) {
		super();
		this.id = id;
		this.dataHoraMovimento = dataHoraMovimento;
		this.operacao = operacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataHoraMovimento() {
		return dataHoraMovimento;
	}
	public void setDataHoraMovimento(Date dataHoraMovimento) {
		this.dataHoraMovimento = dataHoraMovimento;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
}
