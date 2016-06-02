package com.myguitar2.model;

public enum type {
	
	t1,t2;
	
	  public String toString() {
	    switch(this) {
	      case t1: return "t1";
	      case t2: return "t2";
	      default:       return "unspecified";
	    }
	  }
}
