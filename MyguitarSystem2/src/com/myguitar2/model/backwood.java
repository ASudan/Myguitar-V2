package com.myguitar2.model;

public enum backwood {
	
	  MAPLE,COCOBOLO;

	  public String toString() {
	    switch(this) {
	      case MAPLE:              return "MAPLE";
	      case COCOBOLO:           return "COCOBOLO";
	      default:  return "unspecified";
	    }
	  }
	}

