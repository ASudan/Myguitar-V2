package com.myguitar2.model;

public enum builder {
	
	b1,b2;
	
	  public String toString() {
	    switch(this) {
	      case b1:   return "b1";
	      case b2:   return "b2";
	      default:       return "Unspecified";
	    }
	  }
}
