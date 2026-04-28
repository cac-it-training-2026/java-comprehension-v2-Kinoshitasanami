package q01_basic.question05;

/**
 * 会員、非会員の基盤クラス
 * Memberクラス、NonMemberクラスに継承する
 * 
 */
abstract class AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	AbstMember() {

	}

	/**
	 * @param id
	 * @param password
	 * @param age
	 * @param rank
	 * @param name
	 */
	public AbstMember(int id, String password, int age, int rank, String name) {
		this.id = id;
		this.password = password;
		this.age = age;
		this.rank = rank;
		this.name = name;
	}

	/**
	 * name protected access
	 */
	protected String name;

	/**
	 * 商品を購入する（メッセージ出力）
	 * 抽象メソッド
	 */
	public abstract void buyItem();

	/**
	 * メンバー情報を表示する（メッセージ出力）
	 * 抽象メソッド
	 * 
	 */
	public abstract void showMember();

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

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
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
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

}
