package factory;

public class WebsiteFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSite website = WebSiteFactory.getWebsite(WebSiteType.PORTFOLIO);
		System.out.println(website.getPages());
		website = WebSiteFactory.getWebsite(WebSiteType.SHOP);
		System.out.println(website.getPages());
		website = WebSiteFactory.getWebsite(WebSiteType.BLOG);
		System.out.println(website.getPages());

	}

}
