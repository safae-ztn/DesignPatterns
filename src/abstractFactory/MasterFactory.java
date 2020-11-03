package abstractFactory;

public class MasterFactory extends CreditCardFactory{
	
	@Override
	public CreditCard getCreditCard(CardType type) {
		switch(type) {
			case BUSNISS: {
				return new MasterBusinessCreditCard();
			}
			case PERSONAL:{
				return new MasterPersonalCreditCard();
			}
			default:{
				
			}
		}
		return null;
	}
	
	@Override
	public Validator getValidator(CardType type) {
		switch(type) {
			case BUSNISS:
				return new MasterBusinessValidator();
			case PERSONAL :
				return new MasterPersonalValidator();
			default:
				break;
		}
		return null;
	}

}
