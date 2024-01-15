package com.employee.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.dto.EmployeeDTO;
import com.employee.service.EmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	private EmployeeService employeeService;
	
	
	public MainController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("/")
	public ModelAndView index(ModelAndView view) {
		view.setViewName("index");
		return view;
		
	}

	@RequestMapping("/login")
	public String login(String eno, String name, HttpSession session) {
		if(eno.equals(eno)&&name.equals(name)) {
			session.setAttribute("login", true);
			return "redirect:/employee_main";
		} else {
			return "redirect:/";
		} 
	}

	@RequestMapping("/main")
	public ModelAndView main(ModelAndView view) {
		List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();
		
		view.addObject("employeeList",employeeList);
		view.setViewName("employee_main");
		return view;
	}
	
	@RequestMapping("/employee/delete/{ENO}")
	public String deleteEmployee(@PathVariable("ENO") String ENO) {
		employeeService.deleteEmployee(ENO);
		return "redirect:/employee_main";
	}
	
	@GetMapping("/employee/update/view/{ENO}")
	public ModelAndView updateEmployeeView(@PathVariable("ENO") String ENO,ModelAndView view) {
		List<EmployeeDTO> dto = employeeService.selectEmployee(ENO);
		
		view.addObject("dto",dto);
		view.setViewName("employee_update");
		return view;
	}
	
	@PostMapping("/employee/update")
	public String updateEmployee(@PathVariable("ENO") String ENO) {
		employeeService.updateEmployee(ENO);
		return "redirect:/employee_main";
	}	

	@GetMapping("/employee/insert/view")
	public ModelAndView insertEmployeeView(ModelAndView view) {
		List<EmployeeDTO> employeeList = employeeService.insertEmployee();
		
		view.addObject("employeeList",employeeList);
		view.setViewName("employee_main");
		return view;
	}
	
	@PostMapping("/employee/insert")
	public String insertEmployee() {
		employeeService.insertEmployee();
		return "redirect:/employee_main";
	}	
	
	
	
	
}
