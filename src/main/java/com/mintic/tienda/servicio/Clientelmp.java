package com.mintic.tienda.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.dto.ClienteDto;
import com.mintic.tienda.entities.Cliente;
import com.mintic.tienda.entities.TipoDocumento;
import com.mintic.tienda.repositories.ICliente;


@Service
public class Clientelmp implements IClienteService {
	
	@Autowired
	ICliente iCliente;

	@Override
	public List<Cliente> clientes() {
		return (List<Cliente>) iCliente.findAll();
	}

	@Override
	
		public Cliente nuevoCliente(ClienteDto clienteDto) {
			Cliente c = new Cliente();

			if (clienteDto.getId_cliente() != null) {
				c.setId_cliente(clienteDto.getId_cliente());
			}

			TipoDocumento tipo = new TipoDocumento();
			tipo.setId(clienteDto.getId_tipo_documento());

			c.setDireccion_cliente(clienteDto.getDireccion_cliente());
			c.setEmail_cliente(clienteDto.getEmail_cliente());
			c.setId_tipo_documento(tipo);
			c.setNombre_cliente(clienteDto.getNombre_cliente());
			c.setCedula_cliente(clienteDto.getCedula_cliente());
			c.setTelefono_cliente(clienteDto.getTelefono_cliente());

			return iCliente.save(c);
	}

	@Override
	public Cliente buscarCliente(Long id) {
		// TODO Auto-generated method stub
		Cliente c = iCliente.findById(id).orElse(null);
		return c;
	}

	@Override
	public void borrarCliente(Long id) {
		iCliente.deleteById(id);
		
	}

	@Override
	public Cliente buscarClienteCedula(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findByNumeroDocumento(String cedula) {
		// TODO Auto-generated method stub
		return iCliente.findByNumeroDocumento(cedula);
	}
	
}