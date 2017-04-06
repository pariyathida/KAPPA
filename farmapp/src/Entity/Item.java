package Entity;

public interface Item {
	public void use();
	public void discard();
	public String getType();
	public String getName();
	public int getAmount();
	public void setAmount(int i);
}
