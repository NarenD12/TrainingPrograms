package com.infinite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.dao.EmpDaoImpl;
import com.infinite.user.Employee;

@Controller
public class MainTest {

	@Autowired
	EmpDaoImpl dao;

	@RequestMapping(value = "/insertEmp")
	public String insertForm(Model m) {
		
		m.addAttribute("command", new Employee());
		return "insertEmp";
		}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute("emp") Employee emp) {
		int status=dao.insertEmp(emp);
		if(status==0){
			return "failureIns";
		}else{
		return "redirect:/showemp";
		}
	}

	@RequestMapping("/deleteEmp")
	public String deleteForm(Model m) {
		m.addAttribute("command", new Employee());
		return "deleteEmp";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@ModelAttribute("emp") Employee emp) {
		int status=dao.deleteEmp(emp);
		if(status==0){
			return "failureDel";
		}else{
		return "redirect:/showemp";
		}
	}

	@RequestMapping(value = "/showemp")
	public String showallEmp(Model m) {
		List<Employee> list = dao.showallEmp();
		m.addAttribute("list", list);
		return "showemp";
	}
}
