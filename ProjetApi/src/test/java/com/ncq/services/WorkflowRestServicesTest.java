package com.ncq.services;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ncq.enties.Category;
import com.ncq.enties.Workflow;

@SpringBootTest
class WorkflowRestServicesTest {

	@Autowired
	WorkflowRestServices workflowRestServices;

	@Test
	void testFindtWorkflow() {

		List<Workflow> list = initWorkflow();
		assertListWorkflow(workflowRestServices.findWorkflow("abc", 2, 1l), list);

	}

	private List<Workflow> initWorkflow() {
		List<Category> category = new ArrayList();
		Category cat = new Category(1l, "cat", "azerty", 2);
		category.add(cat);

		Workflow wk = new Workflow();

		wk.setEnabled(2);
		wk.setName("abc");
		wk.setCategory(category);
		List<Workflow> list = new ArrayList();
		list.add(wk);
		list.add(wk);

		return list;
	}

	private void assertListWorkflow(List<Workflow> findWorkflow, List<Workflow> lW) {
		if (findWorkflow.toString().equals(lW.toString())) {
			fail("not equal");
		}

	}

}
