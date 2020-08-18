package Banco;

public class Cliente {
	private String nome;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private int rg;
	
	public void imprimirCliente() {
		System.out.println(" Nome: " + this.nome);
		System.out.println(" CPF: " + this.cpf);
		System.out.println(" RG: " + this.rg);
		System.out.println(" Nome da Mãe: " + this.nomeMae);
		System.out.println(" Nome do Pai: " + this.nomePai);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
	
	
}
