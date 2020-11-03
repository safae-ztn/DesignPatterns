package abstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * First step is to get the correct factory depending on card score ( visa or master factory pattern),
		 * then the factory pattern (depending on the card type : business or personal creditcard).
		 */
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(800);
		CreditCard creditcard1 = abstractFactory.getCreditCard(CardType.BUSNISS);
		System.out.println(creditcard1.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(12500);
		CreditCard creditcard2 = abstractFactory.getCreditCard(CardType.BUSNISS);
		System.out.println(creditcard2.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(650);
		CreditCard creditcard3 = abstractFactory.getCreditCard(CardType.PERSONAL);
		System.out.println(creditcard3.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(1300);
		CreditCard creditcard4 = abstractFactory.getCreditCard(CardType.PERSONAL);
		System.out.println(creditcard4.getClass());

	}

}
