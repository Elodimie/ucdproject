package GCLASS;

import java.util.Calendar;
import java.util.Scanner;
//
public class MaDate {

		/*********************** ATTRIBUTS ***********************************/
		private int year;
		private int month;
		private int day;
		private int dayOfWeek;


		/*********************** CONSTRUCTEUR ***********************************/
		public MaDate(int d, int m, int y) {

			
			if  ((d==0)&&(m==0)&&(y==0)){			
				Calendar cal = Calendar.getInstance();
				year = cal.get(Calendar.YEAR);
				month = cal.get(Calendar.MONTH);     
				month++; // 0 to 11
				day = cal.get(Calendar.DAY_OF_MONTH);
			}
			else {
				year = y;
				month = m;
				day = d;
			}
		}

		public MaDate() {
			ajoutDate();
		}

		
		/*********************** ACCESSEURS ET MUTATEURS  ***********************************/
		public int getYear() {
			return year;}

		public void setYear(int year) {
			this.year = year;}

		public int getMonth() {
			return month;}

		public void setMonth(int month) {
			if(month > 0 && month <= 12) {
			       this.month = month;
			   } else {
			        throw new IllegalArgumentException("Les mois vont de 1 à 12. Vous avez tapé :" + month);}
		}
		
		public int getDay() {
			return day;}

		public void setDay(int day) {
			if(day > 0 && day <= 31) {
			       this.day = day;
			   } else {
			        throw new IllegalArgumentException("Les mois comprennent au maximum 31 jours. Vous avez tapé :" + day);}
		}
		
		public void ajoutDate()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Saisir le jour");
			day=sc.nextInt();
			System.out.println("Saisir le mois");
			month=sc.nextInt();
			System.out.println("Saisir l'année");
			year=sc.nextInt();		
			//System.out.println("La date saisie est : "+day + "/" + month + "/" + year);
		}
		public void modifDate()
		{
			MaDate ancien= new MaDate(getDay(), getMonth(), getYear());
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Saisir le jour");
			setDay(sc.nextInt());
			System.out.println("Saisir le mois");
			setMonth(sc.nextInt());
			System.out.println("Saisir l'année");
			setYear(sc.nextInt());		
			System.out.println("La date "+ ancien +" a été modifiée en : "+day + "/" + month + "/" + year);
		}

		/*********************** METHODES ***********************************/

		
		
		/*********************** METHODE PRECEDE AUTRE ou PAS **********************/
		public int precedeoupas(MaDate autre)
		{
			int  precedeoupas;
			precedeoupas = -2;

			if ( year < autre.getYear())
			{
			}
			else if ( year > autre.getYear())
			{
				precedeoupas = 3;
			}
			else if ( year == autre.getYear())
			{
				if ( month < autre.getMonth())
				{
				}
				else if ( month > autre.getMonth())
				{
					precedeoupas = 3;
				}
				else if ( month == autre.getMonth())
				{
					if ( day < autre.getDay())
					{
					}
					else if ( day > autre.getDay())
					{
						precedeoupas = 3;
					}
					else if (day == autre.getDay())
					{
						precedeoupas = 0;
					}
				}					
			}	
			
			if (precedeoupas == 3){
				}
			else {
				System.out.println("La période saisie est impossible : la date de début doit précéder la date de fin. Veuillez recommencer s'il vous plait.");
			}
			//System.out.println(precedeoupas + " (+3 : la date est prochaine/ -2 : la date précède notre jour/ 0 alors il s'agit d'aujourd'hui).");
			return precedeoupas;
		}

		
		public void interpreterCompare(int res, MaDate d1, MaDate d2)
		{
			if(res == 3)
			{
				System.out.println(d1 + " est supérieure à " + d2);
			}
			else if(res == -2 )
			{
				System.out.println(d2 + " est supérieure à " + d1);
			}
			else
			{
				System.out.println(d1 + " est la même que " + d2);
			}
		}
		

		/*********************** METHODE MA DATE PLUS PETITE **********************/
		public MaDate pluspetite(MaDate autre)
		{
			MaDate cas;
			if ((this.precedeoupas(autre)<0 )||(this.precedeoupas(autre) == 0))
			{
				cas=this;	
			}	
			else
			{
				cas= autre;	
			}	
			return cas;
		}
		
		/*********************** METHODE AFFICHER date DD/MM/YYYY **********************/
		public String toString()
		{
			System.out.println("Date : " +day+ "/"+month+"/"+year+".");
			return day+ "/"+month+"/"+year;
		}

		/*********************** METHODE AFFICHER MOIS EN LETTRES **********************/
		public String dateEnLettres()
		{
			String moislettres;
			moislettres = "mois";

			switch (this.month){

			case 1 : moislettres= ("janvier");
			break;
			case 2 : moislettres= ("février");
			break;
			case 3 : moislettres= ("mars");
			break;
			case 4 : moislettres= ("avril");
			break;
			case 5 : moislettres= ("mai");
			break;
			case 6 : moislettres= ("juin");
			break;
			case 7 : moislettres= ("juillet");
			break;
			case 8 : moislettres= ("août");
			break;
			case 9 : moislettres= ("septembre");
			break;
			case 10 : moislettres= ("octobre");
			break;
			case 11 : moislettres= ("novembre");
			break;
			case 12 : moislettres =("décembre");
			break;
			}
			System.out.println("Date : " +day+ " "+moislettres+" "+year+".");
			return moislettres;
		}

		/*********************** METHODE AFFICHER date avec JOUR SEMAINE **********************/
		public void JourSemaineJMA(){

			String  j;
			 
			switch (dayOfWeek) {
			case Calendar.MONDAY:
				j ="lundi";
				break;
			case Calendar.TUESDAY:
				j ="mardi";
				break;
			case Calendar.WEDNESDAY:

				//j ="lundi";
				break;
			case Calendar.THURSDAY:

				//j ="lundi";
				break;
			case Calendar.FRIDAY:

				//j ="lundi";
				break;
			case Calendar.SATURDAY:

				//j ="lundi";
				break;
			case Calendar.SUNDAY:

				//j ="lundi";}

			//System.out.println(  "jour de la semaine: " + j );
			System.out.println("Date : " +day+ "/"+month+"/"+year+".");
			
		}	
	}
	}