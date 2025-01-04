package programming;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;






import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Converter {

		
		public static void main(String[] args) {

		System.out.println( "hhmmss"+getCurrentTime("hhmmss","G"));
		System.out.println( "hhmmss"+getCurrentTime("hhmmss","C"));
		System.out.println( "sss"+getCurrentTime("sss","G"));
		System.out.println( "sss"+getCurrentTime("sss","C"));
		System.out.println( "yyyymmdd"+getCurrentTime("YYYYMMdd","G"));
		System.out.println( "yyyymmdd"+getCurrentTime("YYYYMMdd","C"));

		
		}
		public static String getCurrentTime(String format, String timezone) {
		    ZonedDateTime currentTime = null;
		    
		    // Determine the timezone based on the input
		    if (timezone.equals("G")) {
		        currentTime = ZonedDateTime.now(ZoneId.of("GMT"));
		    } else if (timezone.equals("C")) {
		        currentTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		    }
		    
		    // Handle the special case for milliseconds
		    if (format.equals("sss")) {
		        int milliseconds = currentTime.getNano() / 1_000_000; // Convert nanoseconds to milliseconds

		        // Format milliseconds as a three-digit string
		        String formattedMilliseconds = String.format("%03d", milliseconds);

		        return formattedMilliseconds;
		    } else {
		        // Format the time according to the provided pattern
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

		        return currentTime.format(formatter);
		    }
		}
	
		
	}

