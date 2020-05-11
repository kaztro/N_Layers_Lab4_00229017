package com.uca.layers.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	@AssertTrue(message="A tu casa terminator solo los humanos pueden agregar productos xd")
	private Boolean soyRobot;

	public Robot() {
		super();
	}

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
}