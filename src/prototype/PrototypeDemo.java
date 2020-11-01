package prototype;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Register register = new Register();
		Book b = (Book) register.createItem("Book");
		b.setTitre("Design Patters in java");
		
		System.out.println(b);
		System.out.println(b.getAuthor() + " " + b.getTitre() + " " + b.getNbrePages());
		
		Dress d  = (Dress) register.createItem("Dress");
		d.setSize("L");
		
		System.out.println(d);
		System.out.println(d.getColor() + ", "+ d.getSize());

	}
}
