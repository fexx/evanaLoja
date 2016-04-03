package br.com.evana.loja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.evana.loja.enums.TipoUnidade;

@Entity
@Table(name="PRODUTO")
public class Produto {
	
	@Id
	@SequenceGenerator(name="SEQ_PROD_GEN", sequenceName="PRODUTO_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_PROD_GEN")
	@Column(name = "ID", columnDefinition = "serial")
	private Long id;
	
	@Column(name = "CODIGO_BARRA")
	private String codigoBarra;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	private String precoCusto;
	
	private String precoVenda;
	
	private Categoria categoria;
	
	private TipoUnidade unidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
