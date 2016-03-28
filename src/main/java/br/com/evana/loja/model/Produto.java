package br.com.evana.loja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
public class Produto {
	
	@Id
	@SequenceGenerator(name="SEQ_PROD_GEN", sequenceName="PRODUTO_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_PROD_GEN")
	@Column(name = "ID", columnDefinition = "serial")
	private Long id;
	
	@Column(name = "NOME")
	private String Nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
}
