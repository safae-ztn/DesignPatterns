package factory;

public class Portfolio extends WebSite{

	@Override
	public void createWebSite() {
		// TODO Auto-generated method stub
		pages.add(new ExperiencePage());
		pages.add(new EducationPage());
	}

}
