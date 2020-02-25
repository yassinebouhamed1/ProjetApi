package com.ncq.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncq.dao.WorkflowRepository;
import com.ncq.enties.Workflow;

@Service
public class WorkflowMetierImpl implements WorkflowMetier {
	@Autowired
	private WorkflowRepository workflowRepository;

	@Override
	public List<Workflow> findWorkflow(Long idCategory, String name, Integer status) {
		if (name == null && status == null && idCategory == null) {
			return workflowRepository.findAll();
		}
		List<Long> s = workflowRepository.findWorkflow(idCategory, name, status);
		List<Workflow> workflows = new ArrayList<Workflow>();
		Workflow x;
		for (int i = 0; i < s.size(); i++) {
			x = workflowRepository.findWorkflowById(s.get(i));
			workflows.add(x);
		}
		return workflows;
	}

}
