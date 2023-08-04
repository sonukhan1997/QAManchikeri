package takingscreenshots;

import java.time.LocalDateTime;

public class NameScreenShot {
public static void main(String[] args) {
//	LocalDateTime dateAndTime = LocalDateTime.now();
//	System.out.println(dateAndTime);
//	String updatedType = dateAndTime.toString();
//	//System.out.println(updatedType);
//	String finalFormat = updatedType.replace(':', '-');
//	System.out.println(finalFormat);
	String timeStamp = LocalDateTime.now().toString().replace(':','-');
}
}