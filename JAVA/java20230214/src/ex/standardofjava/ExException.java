package ex.standardofjava;

public class ExException {
	public static void main(String[] args) {

		try {
			Exception e = new Exception("예외발생");
			throw e;
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상종료됨");
	}
}
