package com.ncq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncq.enties.Workflow;
import com.ncq.metier.WorkflowMetier;

@RestController
public class WorkflowRestServices {
	@Autowired
	private WorkflowMetier workflowMetier;

	@RequestMapping(value = "/workflow", method = RequestMethod.GET)
	public List<Workflow> findWorkflow(@RequestParam(required = false) String name,
			@RequestParam(required = false) Integer status, @RequestParam(required = false) Long idCategory) {

		return workflowMetier.findWorkflow(idCategory, name, status);
	}

}