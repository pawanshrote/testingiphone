package crudoperations;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Pojoobjectsclass {

	 String name;
	    String job;
	    String company;
	     
	   
	     
	    public Pojoobjectsclass(String name, String job, String company) {
	         
	        this.name = name;
	        this.job = job;
	        this.company = company;
	    }
	     
	    public String getname() {
	        return this.name;
	    }
	 
	    public void setname(String name) {
	        this.name = name;
	    }
	    
	    public String getjob() {
	        return this.job;
	    }
	 
	    public void setjob(String job) {
	        this.name = job;
	    }
	    
	    public String getcompany() {
	        return this.company;
	    }
	 
	    public void setcompany(String company) {
	        this.name = company;
	    }
	     
	    public String toString() {
	        return "My car is a " + this.name + " " + this.job + " " + this.company;
	    }
	



}