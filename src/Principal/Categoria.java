package Principal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIA")
public class Categoria implements Serializable
{
	@Id
	@Column(name="categoria_id")
	private Integer id;
	
	
	private Integer tipo;
	
	private String nome;
	
	public Categoria() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getTipo() 
	{
		return tipo;
	}

	public void setTipo(Integer tipo) 
	{
		this.tipo = tipo;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}
}
