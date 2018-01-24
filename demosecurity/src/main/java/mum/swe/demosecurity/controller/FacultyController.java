package mum.swe.demosecurity.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mum.swe.demosecurity.model.Faculty;
import mum.swe.demosecurity.service.FacultyService;

@Controller
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;

	@RequestMapping(value="/faculties", method = RequestMethod.GET)
	public ModelAndView faculties(){		
		List<Faculty> faculties = facultyService.findAll();		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("faculties", faculties);
		modelAndView.setViewName("faculty/list");
		return modelAndView;
	}
	
	@RequestMapping(value="/faculty", method = RequestMethod.GET)
	public String create(Model model){			
		model.addAttribute("faculty", new Faculty());
		return "faculty/edit";
	}
	
	@RequestMapping(value = "/faculty", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("faculty") Faculty faculty, 
			BindingResult result, Model model)  {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "faculty/edit";
		}
		faculty = facultyService.save(faculty);
		return "redirect:/faculties";
	}	
	
	@RequestMapping(value="/faculty/{id}", method = RequestMethod.GET)
	public String view(@PathVariable Long id, Model model){	
		model.addAttribute("faculty", facultyService.findOne(id));
		return "faculty/edit";
	}
	
	@RequestMapping(value="/faculty/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model model){		
		facultyService.delete(id);
		return "redirect:/faculties";
	}	
}
