package q01_basic.question05;

abstract class AbstMember {

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void showMember();

	public abstract void buyItem();
}