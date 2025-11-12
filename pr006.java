//Повторная генерация исключений
class Rethrow {
	public static void genException() {
		int number[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};

		for (int i=0; i<number.length; i++) {
			try { 
				System.out.println(number[i] + " / " + denom[i] + " равно " + number[i]);
			}
			catch (ArithmeticException exc) {
				//перерхват искл 1
				System.out.println("недопустимая арифметическая операция");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				//Перехват искл 2
				System.out.println("Сообщение из метода genException");
				throw exc; //повторная генерация искл
		
			}
		}
	}
}

class pr006 {
	public static void main(String args[]) {
		try{
			Rethrow.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			//повтораный перехват искл
			System.out.println("сообщение из метода main(): Выход за границы массива");
			System.out.println("Аварийное завершение программы");
		}
	}
}
