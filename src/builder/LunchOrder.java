package builder;

public class LunchOrder {
	
	public static class Builder {
		
		private String salad;
		private String bread;
		private String meat;
		private String drink;
		
		public Builder() {
			
		}
		
		public Builder salad(String salad) {
			this.salad = salad;
			return this;
		}
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
		public Builder drink(String drink) {
			this.drink = drink;
			return this;
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
	}
	private final String salad;
	private final String bread;
	private final String meat;
	private final String drink;
	
	private LunchOrder(Builder builder) {
		this.salad = builder.salad;
		this.bread = builder.bread;
		this.meat = builder.meat;
		this.drink = builder.drink;
		
	}
	public String getSalad() {
		return salad;
	}
	public String getBread() {
		return bread;
	}
	public String getMeat() {
		return meat;
	}
	public String getDrink() {
		return drink;
	}
}
