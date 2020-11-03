package abstractFactory;

//Abstract factory
public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int scoreCard) {
		if(scoreCard > 1000 ) {
			return new VisaFactory();
		}else {
			return new MasterFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType type);
	
	public abstract Validator getValidator(CardType type);
	
}
