package com.dio;
import java.util.*;

public class MensageDay {
	
	public static String dia_tarde_noite(){
		
		long hrs;
		String string;
		Calendar calendar = GregorianCalendar.getInstance(); 
		hrs = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.print("São "+ hrs +"h, ");
		if(hrs >=0 && hrs< 12  )
			string = "Bom Dia!";
		else if(hrs >=12 && hrs<18 )
			string = "Boa tarde!";
		else if(hrs >=18 && hrs<=23)
			string = "Boa Noite!";
		else string = null;
		return string;
	}

}
