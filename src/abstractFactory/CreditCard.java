package abstractFactory;

public abstract class CreditCard {
	
	protected int rip;
	protected long numberCard;
	protected String owner;
	
	//GETTERS ANS SETTERS
	public int getRip() {
		return rip;
	}
	public long getNumberCard() {
		return numberCard;
	}
	public String getOwner() {
		return owner;
	}
	public void setRip(int rip) {
		this.rip = rip;
	}
	public void setNumberCard(long numberCard) {
		this.numberCard = numberCard;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
