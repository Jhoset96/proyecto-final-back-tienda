package com.mintic.tienda.dto;

public class Detalle_ventaDto {

	private int id_detalle_venta;
	private int cantidad_producto;
	private int codigo_producto;
	private int codigo_venta;
	private int valor_total;
	private int valor_venta;
	private int valor_iva;
	
	
	public int getId_detalle_venta() {
		return id_detalle_venta;
	}
	public void setId_detalle_venta(int id_detalle_venta) {
		this.id_detalle_venta = id_detalle_venta;
	}
	public int getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public int getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public int getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public int getValor_total() {
		return valor_total;
	}
	public void setValor_total(int valor_total) {
		this.valor_total = valor_total;
	}
	public int getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(int valor_venta) {
		this.valor_venta = valor_venta;
	}
	public int getValor_iva() {
		return valor_iva;
	}
	public void setValor_iva(int valor_iva) {
		this.valor_iva = valor_iva;
	}
	
	
	
}
