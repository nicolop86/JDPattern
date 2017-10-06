package jdp.demo.whatever.demoDate;

import org.joda.time.DateTime;

public class MainDemoDate {

	public static void main(String[] args){
		DateTime dataCorrente = new DateTime();
		int giorno = dataCorrente.getDayOfMonth();
		int giornoSettimana = dataCorrente.getDayOfWeek();
		int giornoAnno = dataCorrente.getDayOfYear();
		int mese = dataCorrente.getMonthOfYear();
		int anno = dataCorrente.getYear();
		System.out.println("Giorno: " + giorno + "\nMese: " + mese + "\nAnno: " + anno);
		System.out.println("Giorno della settimana: " + giornoSettimana);
		System.out.println("Giorno dell'anno: " + giornoAnno);
	}
}
