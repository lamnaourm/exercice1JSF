package com.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class FactorielBean {

	private long nombre;
	
	public FactorielBean() {
		
	}
	
	public long getNombre() {
		return nombre;
	}
	public void setNombre(long nombre) {
		this.nombre = nombre;
	}

	
	public void calcul() {
		long res = 1;
		for(long i=1;i<=nombre; i++)
			res *= i;
		
		String r=nombre + "! = " + res;
		addMessage(FacesMessage.SEVERITY_INFO, "Resultat",r);
	}
	
	
	public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }
}
