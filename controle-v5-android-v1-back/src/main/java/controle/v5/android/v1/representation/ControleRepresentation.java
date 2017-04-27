package controle.v5.android.v1.representation;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.hateoas.ResourceSupport;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import controle.v5.android.v1.entity.Controle;

public class ControleRepresentation extends ResourceSupport {

	@JsonInclude(Include.NON_NULL)
	private Long identifier;
	@JsonInclude(Include.NON_NULL)
	private Date data;
	@JsonInclude(Include.NON_NULL)
	private String descricao;
	@JsonInclude(Include.NON_NULL)
	private BigDecimal entrada;
	@JsonInclude(Include.NON_NULL)
	private BigDecimal saida;

	public ControleRepresentation() {
		super();
	}

	public ControleRepresentation(Controle controle) {
		this.identifier = controle.getId();
		this.data = controle.getData();
		this.descricao = controle.getDescricao();
		this.entrada = controle.getEntrada();
		this.saida = controle.getSaida();
	}

	public static Controle build(ControleRepresentation controleRepresentation) {
		Controle controle = new Controle();
		controle.setId(controleRepresentation.getIdentifier());
		controle.setData(controleRepresentation.getData());
		controle.setDescricao(controleRepresentation.getDescricao());
		controle.setEntrada(controleRepresentation.getEntrada());
		controle.setSaida(controleRepresentation.getSaida());
		return controle;
	}

	public Long getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
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

}
