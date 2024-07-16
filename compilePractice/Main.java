// FQN: Fully Qualified Name
// import seoul.sesac.util.libs.*;
import kr.seoul.sesac.util.libs.Finance;
import kr.seoul.sesac.util.libs.HumanResource;

public class Main {
	public static void main(String[] args) {
		Finance finance = new Finance();
		HumanResource resource = new HumanResource();
		System.out.println("Success!");
		System.out.println(finance.money);
		System.out.println(resource.salary);
	}
}
