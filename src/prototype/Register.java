package prototype;

import java.util.HashMap;
import java.util.Map;

public class Register {
	
	private Map<String, Item> maps = new HashMap<String, Item>();
	
	public Register() {
		loadItems();
	}
	
	public Item createItem(String type) throws CloneNotSupportedException {
		Item item = null;
		try {
			item = (Item)(maps.get(type)).clone();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return item;
	}
	
	private void loadItems() {
		Book book = new Book();
		book.setTitre("Design Patterns");
		book.setNbrePages("215 pages");
		book.setAuthor("Jhon Andrew");
		maps.put("Book",book);
		
		Dress dress = new Dress();
		dress.setColor("red");
		dress.setSize("M");
		maps.put("Dress", dress);
	}

}
