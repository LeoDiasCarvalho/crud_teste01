package com.leo.crud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cidade")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Cidade {
	
	@Id
	@Column(name = "id_cidade")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cidade;
	
	@Column(name = "nome")
	@NotBlank(message = "O nome da cidade não pode ser vazio")
	private String nome;
	
	@Column(name = "estado")
	@NotBlank(message = "O estado não pode ser vazio")
	private String estado;

}
