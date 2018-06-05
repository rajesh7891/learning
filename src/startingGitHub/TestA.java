package startingGitHub;


import java.text.SimpleDateFormat;
import java.util.Date;


public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy hh:mm:ss a");
		System.out.println(simpleDateFormat.format(date));
		

	}

}
