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
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Table(name= "veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_veiculo")
	private Long id;
	
	@Column(name = "placa")
	@NotBlank(message = "O placa não pode ser vazio")
	private String placa;
	
	@Column(name = "modelo")
	@NotBlank(message = "O modelo não pode ser vazio")
	private String modelo;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "km")
	private String km;
	
	@Column(name = "ano_fabricacao")
	private String ano_fabricacao;

}
