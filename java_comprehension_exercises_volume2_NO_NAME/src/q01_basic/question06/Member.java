package q01_basic.question06;

public class Member extends AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return passwordString
	 */
	public String getPasswordString() {
		return password;
	}

	/**
	 * @param passwordString セットする passwordString
	 */
	public void setPasswordString(String passwordString) {
		this.password = passwordString;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member() {

	}

	/**
	 * @param id
	 * @param passwordString
	 * @param age
	 * @param rank
	 */
	public Member(int id, String passwordString, String name, int age, int rank) {
		this.id = id;
		this.password = passwordString;
		this.age = age;
		this.name = name;
		this.rank = rank;
	}

	@Override
	public void buyItem() {

		System.out.println(name + "が商品を購入しました。");
	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}
}