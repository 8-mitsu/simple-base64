package tk.mitsu8.simplebase64;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StringPair {
	
	private final StringProperty plain = new SimpleStringProperty(this, "plain", "");
	private final StringProperty encoded = new SimpleStringProperty(this, "encoded", "");
	
	private final Base64StringConverter encodedToPlainConverter = new Base64StringConverter();
	
	public StringPair() {
		Bindings.bindBidirectional(plain, encoded, encodedToPlainConverter);
	}
	
	public final StringProperty plainProperty() {
		return plain;
	}
	
	public final String getPlain() {
		return plainProperty().get();
	}
	
	public final void setPlain(String plain) {
		plainProperty().set(plain);
	}
	
	public final StringProperty encodedProperty() {
		return encoded;
	}
	
	public final String getEncoded() {
		return encodedProperty().get();
	}
	
	public final void setEncoded(String encoded) {
		encodedProperty().set(encoded);
	}
	
}
