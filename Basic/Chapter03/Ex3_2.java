
public class Ex3_2 {
	public static void main(String[] args) {
		
		int i = 5;
		int j = 0;
		
		j = i++;
		System.out.println("j = i++; 실행 후 , i =" + i + ", j = " + j);
		
		j = ++i;
		System.out.println("j = ++i; 실행 후 , i =" + i + ", j = " + j);
		
	}
}
