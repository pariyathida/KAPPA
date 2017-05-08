package model;

public interface Item {
	int amount = 1;
	double price = 0;
	String type = "";
	public boolean use();
	public String getType();
	public String getName();
	public double getPrice();
	public int getAmount();
	public boolean setAmount(int i);
	public boolean addAmount(int i);
	public boolean deductAmount(int i);
}
