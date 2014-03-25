package com.xxy;
 
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
 
@ManagedBean(name="user")
@SessionScoped
public class UserBean{
 
	public void isAdmin(ComponentSystemEvent event){
				
		FacesContext fc = FacesContext.getCurrentInstance();
		
		if (!"admin".equals(fc.getExternalContext().getSessionMap().get("role"))){
			ConfigurableNavigationHandler nav 
			= (ConfigurableNavigationHandler) 
				fc.getApplication().getNavigationHandler();
		
			nav.performNavigation("access-denied");
		}
		
	}
	
}