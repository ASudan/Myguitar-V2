package com.myguitar2.model;

public enum topwood {
	
	  tw1,tw2;

	  public String toString() {
	    switch(this) {
	      case tw1:              return "tw1";
	      case tw2:           return "tw2";
	      default:  return "unspecified";
	    }
	  }

}
