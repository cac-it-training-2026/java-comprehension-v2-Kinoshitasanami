package q01_basic.question04;

class MemberManager {

	MemberManager() {
	}

	public static void showAllMembers(Member[] members) {
		for (Member member : members) {
			member.showMember();
		}
	}
}
