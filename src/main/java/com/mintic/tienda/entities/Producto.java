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
@Table(name = Producto.TABLE_NAME)
public class Producto {
	public static final String TABLE_NAME = "producto";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo_compra;
	
	@ManyToOne	
	@JoinColumn(name = "id_proveedor")
	private Proveedor id_proveedor;

	private Long nit_proveedor;
	
	private Long nombre_producto;
	
	private Long precio_compra;
	
	private Long precio_venta;

	public Long getId() {
		return codigo_compra;
	}


	public void setId(Long codigo_compra) {
		this.codigo_compra = codigo_compra;
	}


	public Long getCodigo_compra() {
		return codigo_compra;
	}


	public void setCodigo_compra(Long codigo_compra) {
		this.codigo_compra = codigo_compra;
	}


	public Proveedor getId_proveedor() {
		return id_proveedor;
	}


	public void setId_proveedor(Proveedor id_proveedor) {
		this.id_proveedor = id_proveedor;
	}


	public Long getNit_proveedor() {
		return nit_proveedor;
	}


	public void setNit_proveedor(Long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}


	public Long getNombre_producto() {
		return nombre_producto;
	}


	public void setNombre_producto(Long nombre_producto) {
		this.nombre_producto = nombre_producto;
	}


	public Long getPrecio_compra() {
		return precio_compra;
	}


	public void setPrecio_compra(Long precio_compra) {
		this.precio_compra = precio_compra;
	}


	public Long getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(Long precio_venta) {
		this.precio_venta = precio_venta;
	}


	public static String getTableName() {
		return TABLE_NAME;
	}
	
	

}
