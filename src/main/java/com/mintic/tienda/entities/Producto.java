package com.mintic.tienda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = Producto.TABLE_NAME)
public class Producto {
	public static final String TABLE_NAME = "producto";
	
	private int id_proveedor;
	private int nit_proveedor;
	private int nombre_producto;
	private int precio_compra;
	private int precio_venta;

/*
 * @id para identificar la llave primaria
 * @@GeneratedValue(strategy = GenerationType.IDENTITY) se define el autoincremental	
 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_producto")
	private int codigo_producto;
	
	/*@ManyToOne  hace referencia la relacion muchos a uno en este caso muchos usuario tienen un tipo de documento
	 * @JoinColumn  el campo que hace de referecia a la llave foranea
	 * */
	
	@Column(name = "iva_compra")
	private int iva_compra;


	public int getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public int getIva_compra() {
		return iva_compra;
	}
	public void setIva_compra(int iva_compra) {
		this.iva_compra = iva_compra;
	}
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public int getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(int nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public int getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(int nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public int getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(int precio_compra) {
		this.precio_compra = precio_compra;
	}
	public int getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}


}


