package hello.servlet.domain.member;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
	
	public Member() {
		
	}
	public Member(Long id, String username, int age) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
	}
	public Member(String username, int age) {
		 this.username = username;
		 this.age = age;
	}
	private Long id;
	private String username;
	private int age;
}
