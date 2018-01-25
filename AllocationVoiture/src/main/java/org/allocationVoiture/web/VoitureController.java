package org.allocationVoiture.web;

import java.util.List;

import org.allocationVoiture.dao.IClientDao;
import org.allocationVoiture.dao.ITypeVoitureDao;
import org.allocationVoiture.dao.IVehiculeDao;
import org.allocationVoiture.entities.Client;
import org.allocationVoiture.entities.Type_Voiture;
import org.allocationVoiture.entities.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/voitures")
public class VoitureController {

	@Autowired
	private IVehiculeDao vehiculeDao ;
	
	@Autowired
	private ITypeVoitureDao typeVoiture;

	
	@RequestMapping(value ="")
	public String Index(Model model, @RequestParam(name = "page", defaultValue = "0") int p) {
		Page<Voiture> pageVoitures = vehiculeDao.findByDisponible(true, new PageRequest(p,3));
		int pagesCount = pageVoitures.getTotalPages();
		int[] pages = new int[pagesCount];
		for (int i = 0; i < pagesCount; i++) {
			pages[i] = i;
		}
		model.addAttribute("pages", pages);
		model.addAttribute("pageCourante", p);
		model.addAttribute("voitures", pageVoitures);
		return "voitures/listVoitures";
	}

	@RequestMapping(value = "/enregistrerVoiture", method = RequestMethod.POST)
	public String enregistrerClient(Voiture v) throws Exception {
		vehiculeDao.save(v);
		return "redirect:";
	}
	
	@RequestMapping(value = "/formVoiture")
	public String form(Model model)
	{
		List<Type_Voiture> types=typeVoiture.findAll();
		model.addAttribute("voiture", new Voiture());
		model.addAttribute("types", types);
		
		return "voitures/formVoiture";
	}
	
	@RequestMapping(value = "/formtype")
	public String formType(Model model)
	{
		model.addAttribute("type", new Type_Voiture());

		return "voitures/formType";
	}
	
	
	@RequestMapping(value = "/enregistrerType", method = RequestMethod.POST)
	public String enregistrerV(Type_Voiture T) {
		typeVoiture.save(T);
		return "redirect:";
	}
	
	@RequestMapping(value = "/SupprimerVoiture", method = RequestMethod.GET)
	public String SupprimerV(String immatricule) {
		vehiculeDao.delete(immatricule);
		return "redirect:";
	}
	
}
