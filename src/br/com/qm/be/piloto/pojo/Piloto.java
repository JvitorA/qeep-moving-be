package br.com.qm.be.piloto.pojo;

public class Piloto {

	private String nome;
	private int matricula;
	private float horasVoo;
	private int numAeronave;
	private float salario;
	
	public Piloto(String nome, int matricula, float horasVoo, int numAeronave, float salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.horasVoo = horasVoo;
		this.numAeronave = numAeronave;
		this.salario = salario;
	}

	public Piloto() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getHorasVoo() {
		return horasVoo;
	}

	public void setHorasVoo(float horasVoo) {
		this.horasVoo = horasVoo;
	}

	public int getNumAeronave() {
		return numAeronave;
	}

	public void setNumAeronave(int numAeronave) {
		this.numAeronave = numAeronave;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Piloto [nome=" + nome + ", matricula=" + matricula + ", horasVoo=" + horasVoo + ", numAeronave="
				+ numAeronave + ", salario=" + salario + "]";
	}
	
	
	
}
