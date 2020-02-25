package com.ncq.metier;

import java.util.List;

import com.ncq.enties.Workflow;

public interface WorkflowMetier {
	public List<Workflow> findWorkflow(Long idCategory,String name,Integer status );
	


}
