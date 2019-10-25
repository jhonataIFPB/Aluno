package Ifpb.edu.esp.POOAluno;

import java.util.Set;

public class Aluno {
		
		private Long matricula;
		private String nome;
		private Set<Turma> turmas;
				
		public Long getMatricula() {
			return matricula;
		}
		public void setMatricula(Long matricula) {
			this.matricula = matricula;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Set<Turma> getTurmas() {
			return turmas;
		}
		public void setTurmas(Set<Turma> turmas) {
			this.turmas = turmas;
		}
		
		

}
