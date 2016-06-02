package com.myguitar2.model;

public class guitarspec {

	private String builder;  
	private String type;
	private String backWood;
	private String topWood;

	 
	public guitarspec() {
	 
	  }

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	  public boolean matches(guitarspec spec) {
		  if(spec.getType()!=null && !spec.getType().equals(type)){
				return false;
			}
			if(spec.getBuilder()!=null && !spec.getBuilder().equals(builder)){
				return false;
			}
			
			if(spec.getBackWood()!=null && !spec.getBackWood().equals(backWood)){
				return false;
			}
			return true;
	  }

}


