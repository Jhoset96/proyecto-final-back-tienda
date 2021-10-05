package com.mintic.tienda.dto;

public class VentaDto {

	private int codigo_venta;
	
	private int id_cliente;

	private int id_usuario;

	private String cedula_usuario;

	private int ivaventa;

	private int total_venta;
	
	private String valor_venta;

	public int getCodigo_venta() {
		return codigo_venta;
	}

	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

	public int getIvaventa() {
		return ivaventa;
	}

	public void setIvaventa(int ivaventa) {
		this.ivaventa = ivaventa;
	}

	public int getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(int total_venta) {
		this.total_venta = total_venta;
	}

	public String getValor_venta() {
		return valor_venta;
	}

	public void setValor_venta(String valor_venta) {
		this.valor_venta = valor_venta;
	}
	
	
}
