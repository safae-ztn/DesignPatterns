package builder;

public class LunchOrderDemo {

	public static void main(String[] args) {

		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.drink("water").bread("bread").salad("rice salad");
		LunchOrder lunch = builder.build();
		System.out.println(lunch.getSalad() +", "+lunch.getDrink());
	}

}
