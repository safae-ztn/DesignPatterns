package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class WebSite {
	
	protected List<Page> pages = new ArrayList<>();
	
	public WebSite() {
		this.createWebSite();
	}
	
	public abstract void createWebSite();

	public List<Page> getPages() {
		return pages;
	}
}
