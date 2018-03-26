package jdp.demo.whatever.demoDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

		System.out.println("==========20-02-2018============");
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar initial date is " + cal.getTime());
		cal.add(Calendar.MONTH, -12);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		System.out.println("Calendar offset date is " + cal.getTime());
		Date now = new Date();
		System.out.println("Today date is " + now);
		Date preset = new Date(117, 1, 19);
		System.out.println("Preset date is " + preset);
		System.out.println("Today is after calendar? " + (cal.getTime().compareTo(now)<0 ? "True" : "False"));
		System.out.println("Preset is after calendar? " + (cal.getTime().compareTo(preset)<0 ? "True" : "False"));

		System.out.println("==========22-02-2018============");
		String timeStamp = "1519301554";
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date nd =  new Date(Long.parseLong(timeStamp)* 1000);
		System.out.println("Current date from TS: " + df.format(nd));
	}
}
