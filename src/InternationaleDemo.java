
/**
 * */
import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;


public class InternationaleDemo {
	public static void main(String[] args) {
//		Locale Loc = Locale.getDefault();
		Locale znLoc = new Locale("zh","CN");
		Locale enLoc = new Locale("en","US");
		Locale frLoc = new Locale("fr","FR");
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",znLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frLoc);
		String value1 = zhrb.getString("info");
		String value2 = enrb.getString("info");
		String value3 = frrb.getString("info");
		System.out.println("中文: "+MessageFormat.format(value1, "水晶宫",10));
		System.out.println("英文: "+MessageFormat.format(value2, "CrystalPalace",20));
		System.out.println("法语: "+MessageFormat.format(value3, "Le Palais de cristal",30));
	}

}
