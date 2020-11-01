package factory;

public class Shopping extends WebSite{

	@Override
	public void createWebSite() {
		pages.add(new SearchPage());
		pages.add(new ItemPage());
		pages.add(new WishPage());
		pages.add(new CommentPage());
	}

}
