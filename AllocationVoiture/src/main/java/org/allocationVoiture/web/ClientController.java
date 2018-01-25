package org.allocationVoiture.web;

import java.util.List;

import org.allocationVoiture.dao.IClientDao;
import org.allocationVoiture.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private IClientDao clientDao;

	@RequestMapping(value = "")
	public String Index(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "motCle", defaultValue = "") String mc) {
		Page<Client> pageClients = clientDao.chercherClients(mc, new PageRequest(p, 4));
		int pagesCount = pageClients.getTotalPages();
		int[] pages = new int[pagesCount];
		for (int i = 0; i < pagesCount; i++) {
			pages[i] = i;
		}
		model.addAttribute("pages", pages);
		model.addAttribute("pageCourante", p);
		model.addAttribute("clients", pageClients);
		return "clients/listClient";
	}

	@RequestMapping(value = "/enregistrerClient", method = RequestMethod.POST)
	public String enregistrerClient(Client c) throws Exception {
		clientDao.save(c);
		return "redirect:";
	}
	
	@RequestMapping(value = "/form")
	public String form(Model model)
	{
		model.addAttribute("client", new Client());
		return "clients/formClient";
	}
	
}
