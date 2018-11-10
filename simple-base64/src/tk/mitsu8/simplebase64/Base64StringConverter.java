package tk.mitsu8.simplebase64;

import java.util.Base64;

import javafx.util.StringConverter;

public class Base64StringConverter extends StringConverter<String> {
	
	@Override
	public String fromString(String plain) {
		return Base64.getEncoder().encodeToString(plain.getBytes());
	}

	@Override
	public String toString(String encoded) {
		String decoded;
		try {
			decoded = new String(Base64.getDecoder().decode(encoded));
		} catch (IllegalArgumentException e) {
			decoded = "not in valid Base64 scheme";
		}
		return decoded;
	}
	
	
}
