
public class FlowEx33 {

	public static void main(String[] args) {

		// for문에 Loop1이라는 이름을 붙였다.
		
		Loop1:
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
					break Loop1;
				}
//				break;
//				continue Loop1;
//				continue;
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			} // end of for i
		}
		System.out.println();
	} 

}