package com.leo.crud.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Cliente {
	
	@Id
	@Column(name = "id_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cliente;
	
	@Column(name = "cpf")
	@NotBlank(message = "O CPF não pode ser vazio")
	private String cpf;
	
	@Column(name = "nome")
	@Size(min = 3, message = "O nome tem que ter mais de 3 caracteres")
	@NotBlank(message = "O nome não pode ser vazio")
	private String nome;
	
	@Column(name = "email")
	@Email(message = "Este não é um email válido")
	private String email;
	
	@Column(name= "nome_mae")
	private String nome_mae;
	
	@Column(name = "numero_casa")
	@NotBlank(message = "O número da casa não pode ser vazio")
	private String numero_casa;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "Telefone_id_telefone")
	private Telefone telefone;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "Endereco_id_endereco")
	private Endereco endereco;

}
