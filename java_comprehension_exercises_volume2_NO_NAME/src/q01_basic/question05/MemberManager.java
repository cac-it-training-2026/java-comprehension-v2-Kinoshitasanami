
package q01_basic.question05;

class MemberManager {

	private MemberManager() {
	}

	public static void showAllMembers(AbstMember[] members) {
		for (AbstMember member : members) {
			member.showMember();
		}
	}

}