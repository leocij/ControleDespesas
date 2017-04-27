package controle.v5.android.v1.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emprestimo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date data;
	private String descricao;
	private BigDecimal valor;
	private Date limitepgto;

	public Emprestimo() {
		super();
	}

	public Emprestimo(Long id, Date data, String descricao, BigDecimal valor, Date limitepgto) {
		super();
		this.id = id;
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		this.limitepgto = limitepgto;
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getLimitepgto() {
		return limitepgto;
	}

	public void setLimitepgto(Date limitepgto) {
		this.limitepgto = limitepgto;
	}

	@Override
	public String toString() {
		return "Emprestimo [id=" + id + ", data=" + data + ", descricao=" + descricao + ", valor=" + valor
				+ ", limitepgto=" + limitepgto + "]";
	}

}
