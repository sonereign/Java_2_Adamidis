package projects.mainClasses;


import projects.impl.Foititis;
import projects.utils.UserInput;

public class Askisi1 
{
	
	static Foititis[] pinakasFoit = new Foititis[10];
	public static int studentNo=0;
	
	public static void main(String args[])
	{
		mainMenu();
	}

	public static void mainMenu()
	{
		System.out.println("Λιστα επιλογων");
		System.out.println("1. Εισαγωγη Φοιτητων");
		System.out.println("2. Emfanisi stoixeiwn foititi.");
		System.out.println("3. Emfanisi oloklirou tou pinaka.");
		System.out.println("4. Telos");
		System.out.println("Dwste epilogh.");
		
		int selection = UserInput.getInteger();
		
		switch(selection)
		{
		case 1:
			eisagwghFoititi();
			break;
		case 2:
			anazhthshFoititi();
			break;
		case 3:
			emfanishPinaka();
			break;
		case 4:
			System.exit(1);
			default:
				System.out.println("TI PATISES RE ALHTARA????");
				mainMenu();
				break;
		}
	}
	
	public static void eisagwghFoititi()
	{
		String name;
		String surName;
		short mitNum;
		short age;
		float avg;
		try
		{
			System.out.println("Dwse onoma.");
			name= UserInput.getString();
			System.out.println("Dwse epitheto");
			surName=UserInput.getString();
			System.out.println("Dwse arithmo mitrwou");
			mitNum=UserInput.getShort();
			System.out.println("Dwse etos eisagwghs");
			age=UserInput.getShort();
			System.out.println("Dwse meso oro mathimatwn");
			avg=UserInput.getInteger();
			
			for(int i=0; i<pinakasFoit.length;i++)
			{
				if(pinakasFoit[i]==null)
				{
					pinakasFoit[i]= new Foititis(name, surName, mitNum, age, avg);
					break;
				}
			}
			studentNo++;
			mainMenu();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error, please try again");
			eisagwghFoititi();
			return;
		}
	}
	
	public static void emfanishPinaka()
	{
		if(pinakasFoit[0] == null)
		{
			System.out.println("ADEIOS PINAKAS MY FRIEND");
			mainMenu();
		}
		
		for(Foititis foit : pinakasFoit)
		{
			if(foit != null)
			{
				System.out.println(foit);
			}
		}
		mainMenu();
	}

	public static void anazhthshFoititi()
	{
		System.out.println("Epilogh Pediou Anazhthshs");
		System.out.println("1. Epitheto");
		System.out.println("2. Arithmos Mitrwou");
		System.out.println("3. Epistrofh sto menu.");
		System.out.println("EPELEKSE NA TELEIWNOUME...");
		
		int selection = UserInput.getInteger();
		
		switch(selection)
		{
			case 1:
				break;
			case 2:
				break;
			case 3:
				mainMenu();
				break;
				default:
					System.out.println("lathos epilogh");
					anazhthshFoititi();
					break;
		}
	}
	
	public static void methodosAnazitisis()
	{
		System.out.println("Epelekse methodo");
		System.out.println("1. Seiriaki");
		System.out.println("2. Diadiki");
		System.out.println("3. Epistrofh pediou anazitisis");
		System.out.println("Dwse epilogh");
	}
	
	
}
