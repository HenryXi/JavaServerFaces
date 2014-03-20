package com.mkyong;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class NormalActionListener implements ActionListener{

	@Override
	public void processAction(ActionEvent event)
			throws AbortProcessingException {
		
		System.out.println("Any use case here?");
	
	}
	
}