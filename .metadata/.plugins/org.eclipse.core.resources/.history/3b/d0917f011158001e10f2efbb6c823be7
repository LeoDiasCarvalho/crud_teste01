package com.leo.crud.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Endereco {

	@Id
	@Column(name = "id_endereco")
	private Long id_endereco;

	@Column(name = "logradouro")
	@NotBlank(message = "O logradouro não pode ser vazio")
	private String logradouro;
	
	@Column(name = "bairro")
	@NotBlank(message = "O bairro não pode ser vazio")
	private String bairro;
	
	@Column(name = "cep")
	@NotBlank(message = "o CEP não pode ser vazio")
	private String cep;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "Cidade_id_cidade")
	private Cidade cidade;
}
