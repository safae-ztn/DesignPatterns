package abstractFactory;

public class VisaFactory extends CreditCardFactory{
	
	@Override
	public CreditCard getCreditCard(CardType type) {
		switch(type) {
			case BUSNISS:
				return new VisaBusinessCreditCard();
			case PERSONAL :
				return new VisaPersonalCreditCard();
			default:
				break;
		}
		return null;
	}
	
	@Override
	public Validator getValidator(CardType type) {
		switch(type) {
			case BUSNISS:
				return new VisaBusinessValidator();
			case PERSONAL :
				return new VisaPersonalValidator();
			default:
				break;
		}
		return null;
	}
	

}
