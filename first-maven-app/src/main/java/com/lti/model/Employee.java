package com.lti.model;

public class Employee {
	int empId;
	String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
/*
//mvn commands
mvn archetype:generate -DgroupId=com.lti -DartifactId=maven-cmd-banking -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn compile
mvn exec:java -Dexec.mainClass=com.lti.App
mvn site>>for documentation

//jenkins
jenkins installation
 * java -jar jenkins.war --httpPort=9191
 * 
after installation
 * localhost:9191
 */
