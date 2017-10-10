package com.qlk.inter;



import java.util.Properties;

import org.testng.annotations.Test;

public class InterfaceTestNG {
	

	   private Properties properties;

	@Test  
	    public String getName() {  
	        System.err.println("return name.... getName()");  
	        return "name";  
	    }  
	  
	    @Test  
	    public void funtest() {  
	        System.err.println("this is funtest......");  
	    }  
	  
	    @Test  
	    public void saveMethod1() {  
	        System.err.println("this is saveMethod1......"); 
	        properties = System.getProperties();
	        System.out.println(properties.toString());
	    }  
	  
	    @Test  
	    public void saveMethod2() {  
	        System.err.println("this is saveMethod2......");  
	    }  
	  
	    @Test  
	    public void saveMethod3() {  
	        System.err.println("this is saveMethod3......");  
	    }  
	    @Test  
	    public void saveMethod4() {  
	        System.err.println("this is saveMethod4......");  
	    }  
	     @Test  
	    public void saveMethod5() {  
	        System.err.println("this is saveMethod5......");  
	    } 
	  
	}  


