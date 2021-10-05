package com.mintic.tienda.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mintic.tienda.entities.Cliente;
import com.mintic.tienda.entities.TipoDocumento;
import com.mintic.tienda.entities.Usuario;

public interface ICliente extends CrudRepository<Cliente,Long> {

	@Query("select p from Cliente as p where p.cedula_cliente=:cedula_cliente")
	Cliente findByNumeroDocumento(@Param("cedula_cliente") String cedula_cliente);
	
}
	