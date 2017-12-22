package lesson49_International;
/**
 * */
import java.util.Locale;
import java.util.ResourceBundle;

public class InternationaleDemo {
	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("Message",loc);
		String value = rb.getString("info");
		System.out.println("内容为： "+value);
	}

}
