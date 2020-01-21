package coding;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String re = get("today+179","yyyy/MM/dd");
   //System.out.print(re);
   
   String s = "2020/06/07  00:00:00";
   String n= s.substring(0,12);
   //s.replaceAll(regex, replacement)
   
   System.out.print(n);
	}

	
	public static String get(String date, String dateFormat) {
		String returnDate = "";
		int daysToAdd = 0;
		
		if(date.equals("today")) {
			daysToAdd=0;
		}else if(date.toLowerCase().contains("today")){
			
			if(date.contains("+")) {
				daysToAdd=Integer.parseInt(date.substring(date.lastIndexOf("+")));
			}
			if(date.contains("-")) {
				daysToAdd=Integer.parseInt(date.substring(date.lastIndexOf("-")));
			}
			
		}else {
			daysToAdd=0;
		}
		
		DateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,daysToAdd );
		
		returnDate = simpleDateFormat.format(cal.getTime());
		return returnDate;
		
		
	}
}
