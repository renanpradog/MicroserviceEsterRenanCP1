package br.fiap.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.app.models.Produto;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@GetMapping("")
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("produto/index");
		List<Produto> listaProduto = new ArrayList<Produto>();

		Produto produtoUm = new Produto();
		produtoUm.setId(1);
		produtoUm.setNome("Plug Anal");

		Produto produtoDois = new Produto();
		produtoDois.setId(2);
		produtoDois.setNome("Lubrificante");

		listaProduto.add(produtoUm);
		listaProduto.add(produtoDois);

		model.addObject("produtos", listaProduto);
		return model;
	}

}
