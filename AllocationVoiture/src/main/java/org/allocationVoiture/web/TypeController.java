package org.allocationVoiture.web;

import java.util.List;

import org.allocationVoiture.dao.ITypeVoitureDao;
import org.allocationVoiture.entities.Type_Voiture;
import org.allocationVoiture.entities.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/types")
public class TypeController {

	@Autowired
	private ITypeVoitureDao typeDao;
	

	
	

}
