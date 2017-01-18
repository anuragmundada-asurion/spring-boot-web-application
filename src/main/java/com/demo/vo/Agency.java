package com.demo.vo;

//import javax.xml.bind.annotation.XmlRootElement;
//
//@XmlRootElement
public class Agency {
    private int agency_id;
    private String name;
    
    public Agency() {
    }


	public int getAgency_id() {
		return agency_id;
	}

	public void setAgency_id(int agency_id) {
		this.agency_id = agency_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
