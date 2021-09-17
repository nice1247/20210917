package co.yedam.member;

public class Member {
	// user1(아이디), 홍길동(이름), 대구 중구 남일동(주소)
	private String memberId;
	private String name;
	private String address;

	// 생성자 : 필드의 값을 초기화. 아래처럼 지정해놓아도 다른곳에서 new ~ 로 생성하면 초기화 시키고 다시 지정해 줄 수 있음
	public Member() {
		memberId = "user1";
		name = "박지원";
		address = "대구 중구 내일동";
	}
	
	public Member(String mId){
		memberId = mId;
	}
	
	public Member(String mId, String n, String a){
		memberId = mId;
		name = n;
		address = a;
	}
	
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getMemberId() {
		return memberId; // 반환해주는 필드는 id
	}
	
	public String getName() {
		return name; // 반환해주는 필드는 이름
	}
	
	public String getAddress() {
		return address; // 반환해주는 필드는 주소
	}

	// 메소드
	public void showInfo() {
		System.out.println("아이디 : " + memberId + ", 이름 : " + name + ", 주소 : " + address);
	}

	public void showMemberId() {
		System.out.println("아이디 : " + memberId);
	}

	public void showName() {
		System.out.println("이름 : " + name);
	}

	public void showAddress() {
		System.out.println("주소 : " + address);
	}

}
