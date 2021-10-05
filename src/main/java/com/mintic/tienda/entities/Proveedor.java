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
@Table(name = Proveedor.TABLE_NAME)
public class Proveedor {
	public static final String TABLE_NAME = "proveedor";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_provedor")
	private Long id_proveedor;
	
	private Long nit_proveedor;
	
	private String ciudad_proveedor;
	
	private String direccion_proveedor;
	
	private String nombre_proveedor;
	
	private String telefono_proveedor;

	public Long getId_provedor() {
		return id_proveedor;
	}

	public void setId_provedor(Long id_provedor) {
		this.id_proveedor = id_provedor;
	}

	public Long getProveedor() {
		return nit_proveedor;
	}

	public void setProveedor(Long proveedor) {
		this.nit_proveedor = proveedor;
	}

	public String getCiudad_proveedor() {
		return ciudad_proveedor;
	}

	public void setCiudad_proveedor(String ciudad_proveedor) {
		this.ciudad_proveedor = ciudad_proveedor;
	}

	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}

	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}

	public String getNombre_proveedor() {
		return nombre_proveedor;
	}

	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}

	public String getTelefono_proveedor() {
		return telefono_proveedor;
	}

	public void setTelefono_proveedor(String telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
	
	
	
}
