package com.mintic.tienda.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Proveedor.TABLE_NAME)
public class Proveedor {
	public static final String TABLE_NAME = "proveedor";
	
	private int id_provedor;
	private int provedor;
	private String ciudad_proveedor;
	private String direccion_proveedor;
	private String nombre_proveedor;
	private String telefono_proveedor;
	
	
	public int getId_provedor() {
		return id_provedor;
	}
	public void setId_provedor(int id_provedor) {
		this.id_provedor = id_provedor;
	}
	public int getProvedor() {
		return provedor;
	}
	public void setProvedor(int provedor) {
		this.provedor = provedor;
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
	public static String getTableName() {
		return TABLE_NAME;
	}
	
}