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
@Table(name = "telefone")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Telefone {
	
	@Id
	@Column(name = "id_telefone")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_telefone;
	
	@Column(name = "tel_principal")
	@NotBlank(message = "O telefone principal não pode ser vazio")
	private String tel_principal;
	
	@Column(name = "tel_recado")
	private String tel_recado;

}
