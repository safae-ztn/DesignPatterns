package factory;

public class WebSiteFactory {
	
	public static WebSite getWebsite(WebSiteType type) {
		switch(type) {
			case BLOG :{
				return new Blog();
			}
			case SHOP :{
				return new Shopping();
			}
			case PORTFOLIO :{
				return new Portfolio();
			}
			default : {
				return null;
			}
		}
	}

}
