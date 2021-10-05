/*package com.mintic.tienda.entities;

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
	
	private Long id_proveedor;
	private Long nit_proveedor;
	private Long nombre_producto;
	private Long precio_compra;
	private Long precio_venta;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_producto")
	private Long codigo_producto;
	
	
	
	@Column(name = "iva_compra")
	private Long iva_compra;


	

}*/
