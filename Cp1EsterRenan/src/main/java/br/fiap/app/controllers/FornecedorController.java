package br.fiap.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.app.models.Fornecedor;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {

	@GetMapping("")
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("cliente/index");
		List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();

		Fornecedor FornecedorUm = new Fornecedor();
		FornecedorUm.setNome("Atenas");
		FornecedorUm.setEndereco("Rua Quarenta, 41");
		FornecedorUm.setTelefone(997946231);

		Fornecedor FornecedorDois = new Fornecedor();
		FornecedorDois.setNome("Giovanni");
		FornecedorUm.setEndereco("Rua Sessenta e Cinco, 66");
		FornecedorUm.setTelefone(996325874);

		listaFornecedor.add(FornecedorUm);
		listaFornecedor.add(FornecedorDois);

		model.addObject("fornecedores", listaFornecedor);
		return model;
	}
}
