package com.mintic.tienda.dto;

public class ProductoDto {

	private Long codigo_producto;
	private Long iva_compra;
	private Long id_proveedor;
	private Long nit_proveedor;
	private String nombre_producto;
	private Long precio_compra;
	private Long precio_venta;
	public Long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public Long getIva_compra() {
		return iva_compra;
	}
	public void setIva_compra(Long iva_compra) {
		this.iva_compra = iva_compra;
	}
	public Long getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(Long id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public Long getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(Long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
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
	
	

}
