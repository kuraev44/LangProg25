class ExcTest {
	//Генерауия искл
	static void geException() {
		int nums[] = new int[4];
		System.out.println("До искл ситуации");
		nums[8] = 10;
		System.out.println("Строка после искл");
	}
}
//получение информации
class pr007 {
	public static void main(String args[]) {
		int nums[] = new int[4];
		int number[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};
		for (int i=0; i<number.length; i++) {
			try { 
				System.out.println(number[1] + " / " + denom[i] + " = ");
			}
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("Искл");				
				System.out.println(exc);
				System.out.println("трассирвока стека");
				exc.printStackTrace();
				System.out.println("Информация об исключении, представляемая методом toString");
				System.out.println(exc.toString());
			}
			catch (Throwable exc) {
				System.out.println("Исключениу");
			}
		}
	}
}
