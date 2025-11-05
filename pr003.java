class ExcTest {
	//Генерация исключительной ситуации
	static void genException() {
		int nums[] = new int[4];
		System.out.println("До исключительной ситуации");
		nums[8] = 10;
		System.out.println("Строка после исключительной ситуации внутри блока try");
		
	}
}
class pr003 {
	public static void main(String args[]) {
		int nums[] = new int[4];
			//исключительная ситуация
			
		int number[] = {4, 8, 16, 32 , 64, 128};
		int denom[] = {2, 0 , 4, 4, 0, 8};
		for(int i=0; i<number.length; i++) {
			try {
				/*
				System.out.println("До исключительной ситуации");
				nums[8] = 10;
				System.out.println("Строка после исключительной ситуации внутри блока try");
				*/
				//Генерация при вызове статтического метода
				//ExcTest.genExceprion();
				System.out.println(number[i] + " / " + denom[i] + " равно " + number[i]/denom[i]);

			}
			
		//exc-переменная содержащая ссылку
		//ArrayIndexOutOfDoundsException
		//catch блок перехвата
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("Исключительная ситуация: выход за границы массива");
			}
			/*
			catch(ArithmeticException exc2) {
				System.out.println("Исключительная ситуация: неверная арифметическая ситуация");
			}
			System.out.println("После оператора catch");
		
		*/
		//использование класса
			catch (Throwable exc) {
				System.out.println("Исключение, для которого не написан специфический обработчик");
			}
		}
	}

}
