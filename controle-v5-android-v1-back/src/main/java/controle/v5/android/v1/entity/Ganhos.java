package controle.v5.android.v1.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ganhos implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date data;
	private String diaSemana;
	private String descricao;
	private String sessao;
	private BigDecimal pagou;
	private BigDecimal deve;

	public Ganhos() {
		super();
	}

	public Ganhos(Long id, Date data, String diaSemana, String descricao, String sessao, BigDecimal pagou,
			BigDecimal deve) {
		super();
		this.id = id;
		this.data = data;
		this.diaSemana = diaSemana;
		this.descricao = descricao;
		this.sessao = sessao;
		this.pagou = pagou;
		this.deve = deve;
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

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSessao() {
		return sessao;
	}

	public void setSessao(String sessao) {
		this.sessao = sessao;
	}

	public BigDecimal getPagou() {
		return pagou;
	}

	public void setPagou(BigDecimal pagou) {
		this.pagou = pagou;
	}

	public BigDecimal getDeve() {
		return deve;
	}

	public void setDeve(BigDecimal deve) {
		this.deve = deve;
	}

	@Override
	public String toString() {
		return "Ganhos [id=" + id + ", data=" + data + ", diaSemana=" + diaSemana + ", descricao=" + descricao
				+ ", sessao=" + sessao + ", pagou=" + pagou + ", deve=" + deve + "]";
	}

}
