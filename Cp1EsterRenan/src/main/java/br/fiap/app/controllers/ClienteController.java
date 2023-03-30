package br.fiap.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.app.models.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@GetMapping("")
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("cliente/index");
		List<Cliente> listaCliente = new ArrayList<Cliente>();

		Cliente ClienteUm = new Cliente();
		ClienteUm.setNome("Alice");
		ClienteUm.setEndereco("Rua Um, 2");
		ClienteUm.setTelefone(993314714);

		Cliente ClienteDois = new Cliente();
		ClienteDois.setNome("Ester");
		ClienteUm.setEndereco("Rua Nove, 8");
		ClienteUm.setTelefone(998745213);

		listaCliente.add(ClienteUm);
		listaCliente.add(ClienteDois);

		model.addObject("clientes", listaCliente);
		return model;
	}
}
