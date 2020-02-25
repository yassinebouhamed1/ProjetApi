package com.ncq.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ncq.enties.Workflow;

public interface WorkflowRepository extends JpaRepository<Workflow, Long>{
	
	@Query(value ="select * from Workflow t where t.Id_Workflow = ?1",nativeQuery = true) 
	public Workflow findWorkflowById( Long id);
	
	@Query(value ="select a.Id_Workflow from Workflow a INNER JOIN workflow_category b ON a.Id_Workflow=b.workflow_id_workflow where (b.\r\n" + 
			"category_id_category=?1 or ?1 is null) and (a.Name = ?2 or ?2 is null) and (a.Enabled = ?3 or ?3 is null)",nativeQuery = true) 
	public List<Long> findWorkflow( Long id,String name,Integer status);
	
	

}
