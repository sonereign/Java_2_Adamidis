package projects.impl;

public class Foititis 
{
	String name;
	String surName;
	short mitNum;
	short age;
	float avg;
	
	
	public Foititis()
	{
		name="";
		surName="";
		mitNum=0;
		age=0;
		avg=0;
	}
	 public Foititis(String name, String surName, short mitNum, short age, float avg)
	 {
		 this.name=name;
		 this.surName=surName;
		 this.mitNum=mitNum;
		 this.age=age;
		 this.avg=avg;
	 }
	 
	 @Override
	 public String toString()
	 {
		 String display="";
		 display="Name: " + name + "\n" +
				 "SurName: " +surName +  "\n" +
				 "Arithmo Mitrwou: " +mitNum + "\n" +
				 "Etos Eisagwghs: " +age + "\n" +
				 "Mesos oros: " + avg;
		 return display;
	 }
	 
	// Access methods
		public String getName()
		{
			return name;
		}
		public String getEpitheto()
		{
			return surName;
		}
		public short getAM()
		{
			return mitNum;
		}
		public short getEtosEisagogis()
		{
			return age;
		}
		public float getAverage()
		{
			return avg;
		}
		
		// Mutator methods
		public void setOnoma(String name)
		{
			this.name=name;
		}
		public void setEponymo(String epon)
		{
			this.surName=epon;
		}
		public void setAM(short am)
		{
			mitNum=am;
		}
		public void setEtosEisagogis(short EE)
		{
			age=EE;
		}
		public void setAverage(float avg)
		{
			this.avg=avg;
		}
}
