package com.mintic.tienda.entities;
/*prueba commit*/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = Cliente.TABLE_NAME)
public class Cliente {
	public static final String TABLE_NAME = "cliente";
	
	/*
	 * @id para identificar la llave primaria
	 * @@GeneratedValue(strategy = GenerationType.IDENTITY) se define el autoincremental	
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private int id_cliente;
	

	/*@ManyToOne  hace referencia la relacion muchos a uno en este caso muchos usuario tienen un tipo de documento
	 * @JoinColumn  el campo que hace de referecia a la llave foranea
	 * */
	
	@JoinColumn(name = "id_tipo_documento")
	private TipoDocumento id_tipo_documento;
	
	/*@Column nombre de la columna , si el nombre en la base de datos del campo es igual a el de la variable no es necesario poner la anotacion
	 * */
	@Column(name = "cedula_cliente")
	private String cedula_cliente;
	
	@Column(name = "direccion_cliente")
	private String direccion_cliente;
	
	@Column(name = "email_cliente")
	private String email_cliente;
	
	@Column(name = "nombre_cliente")
	private String nombre_cliente;
	
	@Column(name = "telefono_cliente")
	private String telefono_cliente;
	
	public Cliente() {

	}

	public Cliente(int id_cliente, TipoDocumento id_tipo_documento, String cedula_cliente, String direccion_cliente, String email_cliente,
			String nombre_cliente, String telefono_cliente) {
		this.id_cliente = id_cliente;
		this.id_tipo_documento = id_tipo_documento;
		this.cedula_cliente = cedula_cliente;
		this.direccion_cliente = direccion_cliente;
		this.email_cliente = email_cliente;
		this.nombre_cliente = nombre_cliente;
		this.telefono_cliente = telefono_cliente;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
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
