package controle.v5.android.v1.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Controle implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date data;
	private String descricao;
	private BigDecimal entrada;
	private BigDecimal saida;

	public Controle() {
		super();
	}

	public Controle(Long id, Date data, String descricao, BigDecimal entrada, BigDecimal saida) {
		super();
		this.id = id;
		this.data = data;
		this.descricao = descricao;
		this.entrada = entrada;
		this.saida = saida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getEntrada() {
		return entrada;
	}

	public void setEntrada(BigDecimal entrada) {
		this.entrada = entrada;
	}

	public BigDecimal getSaida() {
		return saida;
	}

	public void setSaida(BigDecimal saida) {
		this.saida = saida;
	}

	@Override
	public String toString() {
		return "Controle [id=" + id + ", data=" + data + ", descricao=" + descricao + ", entrada=" + entrada
				+ ", saida=" + saida + "]";
	}

}
