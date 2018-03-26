package jdp.demo.whatever.stringDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MainStringDemo {

	public static void main(String[] args) {
//		String name = "legance\\agay";
//		System.out.println(name);
//		
//		if(name.contains("\\")){
//			String[] split = name.split("\\\\");
//			for(int i=0; i<split.length; i++){
//				System.out.println(split[i]);
//			}
//		} else {
//			System.out.println("False condition");
//		}
//		
//		
//		String officeName = "_OFFICE_24378695";
//		System.out.println(officeName.replaceAll("_OFFICE_", ""));

		System.out.println("Params job");
		String params = "123#111#PMIContattiGasPower#Mr#PIVA0876#nicolo#politi#333#nick@pol#gas#voghera#PV#3m3#1#";
		String [] paramArray =  params.split("#");
		List<String> paramList = new ArrayList<String>();
		paramList = Arrays.asList(paramArray);
		
		System.out.println("Array size " + paramArray.length);
		System.out.println("List size " + paramList.size());
		
//		for (String string : paramArray) {
//			System.out.println(string);
//		}
		List<String> parameters = new ArrayList<String>();
		parameters.add("companyId");
		parameters.add("groupId");
		parameters.add("categoria");
		parameters.add("ragioneSociale");
		parameters.add("piva");
		parameters.add("nome");
		parameters.add("cognome");
		parameters.add("telefono");
		parameters.add("email");
		parameters.add("fornituraRichiesta");
		parameters.add("comune_fornitura");
		parameters.add("urlProv");
		parameters.add("prodottoRichiesto");
//		parameters.add("agreedToS");
		try{
			HashMap<String, String> paramMap = populateMap(parameters, paramList);
			for (Entry<String, String> entry : paramMap.entrySet()) {
				System.out.println("Key: " + entry.getKey() + " - " + " value: " + entry.getValue());
			}
		} catch (Exception e){
			e.printStackTrace(System.out);
		}
	}
	
	public static HashMap<String, String> populateMap(List<String> params, List<String> values) throws Exception{
		HashMap<String, String> paramMap = new HashMap<String, String>();
		if(params.size() == values.size()){
			for(int i=0; i<params.size(); i++) {
				paramMap.put(params.get(i), values.get(i));
			}
		} else {
			String message = "Error creating map";
			Throwable cause = new Throwable("Parameter list and value list are not the same size");
			MapException exception = new MapException(message, cause);
			throw exception;
		}
		return paramMap;
	}
}