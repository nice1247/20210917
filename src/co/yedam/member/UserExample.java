package co.yedam.member;

public class UserExample {
	public static void main(String[] args) {
		User user1 = null;
		user1 = new User("user1","1234");
		user1.setUserAge(20);
		user1.setUserName("사용자");
		user1.setUserGrade(Grade.GUEST);
		
		user1.getUserId();
		user1.getUserAge();
		
		User user2 = new User("user2", "5555", "사용자2", Grade.MID, 30);
		String name = user2.getUserName();
		int age = user2.getUserAge();
		Grade grade = user2.getUserGrade();
		
		if(name.equals("사용자2")) {					// String 타입은 equals, int 타입은 부등호로 비교
			user2.setUserGrade(Grade.SUPER);
		}
		if(age >= 20) {
			user2.setUserGrade(Grade.SPECIAL);
		}
		if(grade == Grade.MID) {
			user2.setUserGrade(Grade.GUEST);
		}
		
		System.out.println(user2.toString());
		user2.showInfo();
		
		User user3 = new SpecialUser ("user3", "1234", "사용자3", Grade.SPECIAL, 30, 500);
		user3.showInfo();
		

	}

}
