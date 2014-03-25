package com.xxy;

import javax.faces.application.Application;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.PostConstructApplicationEvent;
import javax.faces.event.PreDestroyApplicationEvent;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

public class FacesAppListener implements SystemEventListener{

	@Override
	public void processEvent(SystemEvent event) throws AbortProcessingException {

		if(event instanceof PostConstructApplicationEvent){
			System.out.println("PostConstructApplicationEvent is Called");
		}
		
		if(event instanceof PreDestroyApplicationEvent){
			System.out.println("PreDestroyApplicationEvent is Called");
		}
		
	}

	@Override
	public boolean isListenerForSource(Object source) {
		//only for Application
		return (source instanceof Application);
		
	}
	
}