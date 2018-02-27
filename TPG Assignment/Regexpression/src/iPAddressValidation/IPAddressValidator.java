package iPAddressValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator {
	private Pattern pattern;
	private Matcher matcher;
	
	private static final String IPAddress_Pattern=
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	public IPAddressValidator(){
		pattern=Pattern.compile(IPAddress_Pattern);
	}
	
	public boolean validate(final String ip){
		System.out.println("Inside Validate printing ip"+ip);
		matcher=pattern.matcher(ip);
		return matcher.matches();
	}
	

}
