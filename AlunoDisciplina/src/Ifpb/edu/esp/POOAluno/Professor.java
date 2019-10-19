package Ifpb.edu.esp.POOAluno;

import java.util.Set;

public class Professor {
	
	private Integer matriculaP;
	private String nomeP;
	private Set<Turma> turmas;
	
	
	public Integer getMatriculaP() {
		return matriculaP;
	}
	public void setMatriculaP(Integer matriculaP) {
		this.matriculaP = matriculaP;
	}
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public Set<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(Set<Turma> turmas) {
		this.turmas = turmas;
	}

	
}
