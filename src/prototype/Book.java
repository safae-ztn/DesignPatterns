package prototype;

public class Book extends Item{
	
	private String titre;
	private String author;
	private String nbrePages;
	
	public Book() {
		super();
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNbrePages() {
		return nbrePages;
	}
	public void setNbrePages(String nbrePages) {
		this.nbrePages = nbrePages;
	}
}
