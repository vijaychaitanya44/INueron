package customUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		
		System.out.println(dt);
		SimpleDateFormat customDate = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
	
	String date = customDate.format(dt);
	
	System.out.println(date);
	
	
	String date2 = (new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy")).format(new Date());

	}

}
