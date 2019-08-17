package com.examples.controllers;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.models.Employee;
import com.examples.validators.NameValidator;

@Controller
public class PageController {
	
	@Autowired
	NameValidator nameValidator;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String Welcome() {
		return "HomePage";
	}

	@RequestMapping(value="EmployeeFormCtr",method=RequestMethod.GET)
	public ModelAndView addEmployee() {
		ModelAndView mv=new ModelAndView("EmployeeForm");
		mv.addObject("employeeObj",new Employee());
		return mv;
		
	}
	
	/*@RequestMapping(value="ViewEmployeeCtr",method=RequestMethod.POST)
	public String viewEmployee(@ModelAttribute Employee employeeObj,ModelMap m1,BindingResult result) {
		
		if(result.hasErrors()) {
		m1.addAttribute("employeeObj", employeeObj);
			return "ViewEmployee";
		}
		return "Error";
	}*/
	
	
	
	@RequestMapping(value="ViewEmployeeCtr",method=RequestMethod.POST)
	public ModelAndView viewEmployee(@Valid @ModelAttribute(name="employeeObj") Employee employeeObj,BindingResult result) {
		
		System.out.println("Hello 1");
		
		nameValidator.validate(employeeObj,result);
		
		
		if(result.hasErrors()) {
			System.out.println("Hello 2");
			ModelAndView mv=new ModelAndView("EmployeeForm");
			
			return mv;
		}
		ModelAndView mv=new ModelAndView("ViewEmployee");
		return mv;
	}
	
}
