package com.dilip.object_dependecy_injection_loose_coupling_2;

public class Airtel {

	
	Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	void activateService() {
		service.service();
	}
	
}
