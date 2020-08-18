package Banco;

public class Conta {
	private int agencia;
	private int conta;
	private int codBanco;
	private double saldo;
	private int senha;
	private Cliente titular; // Referenciando a classe cliente para as classes ficarem mais organizada e mais facil de manutenção
	
	
	public void imprimirDadosBancarios() {
		System.out.println(" Agência: " + this.agencia);
		System.out.println(" Conta Corrente: " + this.conta);
		System.out.println(" Codigo do Banco: " + this.codBanco);
	}
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com Sucesso !!! ");
			return true;
		}
		else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
		
	}
	
	public boolean transferir(double valor,Conta destino) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.depositar(valor);
			System.out.println(" Transfêrencia Realizada com Sucesso !! ");
			return true;
		}
		else {
			System.out.println(" Transferencia Não Realizada , sem saldo suficiente.");
			return false;
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
