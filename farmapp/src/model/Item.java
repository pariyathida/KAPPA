package model;

public interface Item {
	int amount = 1;
	double price = 0;
	String type = "";
	public void use();
	public void discard();
	public String getType();
	public String getName();
	public int getAmount();
	public void setAmount(int i);
}
