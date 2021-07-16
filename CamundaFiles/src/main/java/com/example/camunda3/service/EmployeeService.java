package com.example.camunda3.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.camunda.bpm.engine.variable.VariableMap;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public Object triggerProcess(String activityName, String name) {
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey(activityName);
		instance.setVariable("employeeName", name);
		ProcessInstanceWithVariables response = instance.executeWithVariablesInReturn();
		
		VariableMap variables = response.getVariables();
		System.out.println("Employee details from service are:" +variables.get("getEmployee"));
		return variables.get("getEmployee");
	}
}
