package com.mintic.tienda.dto;

public class ProductoDto {

	private int codigo_producto;
	private int iva_compra;
	private int id_proveedor;
	private int nit_proveedor;
	private String nombre_producto;
	private int precio_compra;
	private int precio_venta;
	
	
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
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
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
