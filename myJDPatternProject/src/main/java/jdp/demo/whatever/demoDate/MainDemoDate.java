package jdp.demo.whatever.demoDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		
		String dateString = "29/02/2019";
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			System.out.println("Date is: " + sdf.parse(dateString));
		} catch (ParseException e) {
			System.err.println("Error in date parsing.");
			e.printStackTrace();
		}
	}
}
