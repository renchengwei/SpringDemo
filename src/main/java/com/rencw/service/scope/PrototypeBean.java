package com.rencw.service.scope;

import java.util.Date;

public class PrototypeBean {

	private Long timeMilis;
	
	public PrototypeBean(){
        timeMilis = (new Date()).getTime();
    }

    public void printTime() {
        System.out.println(timeMilis+"");
    }
}
