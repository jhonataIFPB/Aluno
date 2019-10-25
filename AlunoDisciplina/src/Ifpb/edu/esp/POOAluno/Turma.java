package Ifpb.edu.esp.POOAluno;

import java.util.Set;

public class Turma {

	private Long codigo;
	private Set<Aluno> alunos;	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
}
