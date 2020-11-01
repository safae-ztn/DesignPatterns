package factory;

public class Blog extends WebSite{
	
	@Override
	public void createWebSite() {
		pages.add(new CommentPage());
		pages.add(new AuthorPage());
	}

}
