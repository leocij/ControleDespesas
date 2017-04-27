package controle.v5.android.v1.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parcelamento implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int dia;
	private String descricao;
	private String mes;
	private int ano;
	private int quantParcelas;
	private int valorParcela;

	public Parcelamento() {
		super();
	}

	public Parcelamento(Long id, int dia, String descricao, String mes, int ano, int quantParcelas, int valorParcela) {
		super();
		this.id = id;
		this.dia = dia;
		this.descricao = descricao;
		this.mes = mes;
		this.ano = ano;
		this.quantParcelas = quantParcelas;
		this.valorParcela = valorParcela;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getQuantParcelas() {
		return quantParcelas;
	}

	public void setQuantParcelas(int quantParcelas) {
		this.quantParcelas = quantParcelas;
	}

	public int getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(int valorParcela) {
		this.valorParcela = valorParcela;
	}

	@Override
	public String toString() {
		return "Parcelamento [id=" + id + ", dia=" + dia + ", descricao=" + descricao + ", mes=" + mes + ", ano=" + ano
				+ ", quantParcelas=" + quantParcelas + ", valorParcela=" + valorParcela + "]";
	}

}
