package model;

public class Aluno {

	private String matricula, name, email, sexo, empresa, cidade;
	private int idade;
	
	public Aluno() {
		this.matricula = matricula;
		this.name = name;
		this.idade = idade;
		this.sexo = sexo;
		
		
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\n\nAluno"+
			   "\nMatricula: " + matricula + 
			   "\nNome: " + name +
			   "\nE-mail: " + email +
			   "\nIdade:" + idade +
			   "\nSexo: " + sexo +
			   "\nEmpresa: " + empresa +
			   "\nCidade: " + cidade ;
	}

	

}
