package com.mintic.tienda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = Cliente.TABLE_NAME)
public class Cliente {
	public static final String TABLE_NAME = "cliente";
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id_cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_documento")
	private TipoDocumento id_tipo_documento;
	
	
	private String cedula_cliente;
	
	private String direccion_cliente;
	
	private String email_cliente;
	
	private String nombre_cliente;
	
	private String telefono_cliente;
	
	public Cliente() {

	}
	
	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public TipoDocumento getId_tipo_documento() {
		return id_tipo_documento;
	}

	public void setId_tipo_documento(TipoDocumento id_tipo_documento) {
		this.id_tipo_documento = id_tipo_documento;
	}

	public String getCedula_cliente() {
		return cedula_cliente;
	}

	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getTelefono_cliente() {
		return telefono_cliente;
	}

	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}

	public static String getTableName() {
		return TABLE_NAME;
	}
	
	
}
