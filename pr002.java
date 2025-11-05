//Пример обобщенного интерфейса
interface Contaiment<T> {
	//Проверка содержимого объекта и некоторого класса на наличие указанного элемента
	boolean contains(T o);
}
class NumFns<T extends Number> {
	T num;
	NumFns (T n) {
		num = n;
	}
	//оьбр величина
	double inverse() {
		return 1/num.doubleValue();
	}
	//Получение целой части
	int whole() {
		return num.intValue();
	}
	//Получениена дробной части
	double dr() {
		return num.doubleValue() - num.intValue();
	}
	//Использование шаблонов аргументов
	boolean absEqual (NumFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
	
}
	//При помощи конструкции T, V extends T мщжно выполнить провеку типов совместимости новых объектов
	class A <T, V extends T> {
		T first;
		V second;
		
		A(T a, V b) {
			first = a;
			second = b;
		}
	}
//использование ограниченным шаблонов
class B {
	//родительский класс 
}
class B_A extends B {
}
class B_B extends B {
}
class B_C extends B {
}
class BA {
} 
class Gen1<T> {
	T ob;

	Gen1(T o) {
		ob = o;
	}
}
class Test {
	//Передаваемый обобщеный парметр ограничивается классаом и его потомками
	static void test(Gen1<? extends B> o) {
	}
	//Тут подклассом B_A
	static void test2(Gen1<? super B_A> o) {
	}
}
class GenMeth {
	//Определение метода, поределяющего совпадение содержимого с\двух массивов
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
		//Сравнение длины массивово
		if(x.length != y.length)
			return false;
		
		for(int i=0; i < x.length; i++)
			if(!x[i].equals(y[i]))
				return false;
		return true;

	}
}

class Summation {
	private int sum;
	<T extends Number> Summation(T arg) {
		sum = 0;

		for(int i=0; i<= arg.intValue(); i++)
			sum += i;
	}

	int getSum() {
		return sum;
	}
}

//Реализация
class ClassGenInt<T> implements Contaiment<T> {
//Класс, реализующий обобщенный интерфейс 
	T[] arrayRef;
	ClassGenInt(T[] o) {
		arrayRef = o;
	}
	//Реализация метода contains{}
	public boolean contains(T o) {
		for(T x:arrayRef)
			if (x.equals(o)) return true;
		return false;
	}
	
}
//ограничение типа данных при обобщении
//...
//}

//
//...
//}
class pr002 {
	public static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("Обратная величина iOb -" + iOb.inverse());

		System.out.println("Целая часть Iob - " + iOb.whole());

		System.out.println("Дробная часть iOb - " + iOb.dr());

		NumFns<Double> dOb = new NumFns<Double>(10.14);

		System.out.println("Обратная величина dOb - " + dOb.inverse());

		System.out.println("Целаячасть dOb - " + dOb.whole());
		
		System.out.println("Дробная часть dOb - " + dOb.dr());

		//NumFns<String> strOb = new NumFns<String>("5555");
		//Стринг не класс

		//проверка совместимости типов при создании объектов класса А
		A<Integer, Integer> x = new A<Integer, Integer>(1,2);
		A<Number, Integer> y = new A<Number, Integer>(1.1,2);
		//djksald
		//djksada
		
		//Демонстрация вызова метода вайлдкард
		NumFns<Integer> intOb = new NumFns<Integer>(6);
		NumFns<Double> doubleOb = new NumFns<Double>(-6.0);
		NumFns<Long> longOb = new NumFns<Long>(5L);

		System.out.println();
		System.out.println("Сравнение абсолютных значенией intOb и doubleOb");
		if(intOb.absEqual(doubleOb))
			System.out.println("Абсолютные значения вешличин  совпадают");
		else
			System.out.println("Абсолютные значения величин не совпадают");

		System.out.println("Сравнение абсолютных значенией intOb и doubleOb");

		if(intOb.absEqual(longOb))
			System.out.println("Абсолютные значения вешличин  совпадают");
		else
			System.out.println("Абсолютные значения величин не совпадают");

		//Демонстрация использования ограниченнных шаблонов
		B b1 = new B();
		B_A b2 = new B_A();
		B_B b3 = new B_B();
		B_C b4 = new B_C();
		BA ba1 = new BA();
		Gen1<B> w1 = new Gen1<B>(b1);
		Gen1<B_A> v2 = new Gen1<B_A>(b2);
		Gen1<B_B> v3 = new Gen1<B_B>(b3);
		Gen1<B_C> v4 = new Gen1<B_C>(b4);
		Gen1<BA> v5 = new Gen1<BA>(ba1);

		//Тип параметра вызова
		Test.test(w1);
		Test.test(v2);
		Test.test(v3);
		Test.test(v4);

		//Test.test(v5) не скомпилируется
		

		//Демонстрация использования обобщенного метода arrys
		Integer nums[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1, 2, 3, 4, 5};
		Integer nums3[] = {1, 2, 7, 4, 5};
		Integer nums4[] = {1, 2, 7 ,4, 5, 6};

		if(GenMeth.arraysEqual(nums, nums))
			System.out.println("Массивы nums и nums совпадают");

		if(GenMeth.arraysEqual(nums, nums2))
			System.out.println("Массивы nums и nums2 совпадают");

		if(GenMeth.arraysEqual(nums, nums3))
			System.out.println("Массивы nums и nums3 совпадают");

		if(GenMeth.arraysEqual(nums, nums4))
			System.out.println("Массивы nums и nums4 совпадают");

		String st1[] = {"Первая стркоа", "Вторая строка"};

		String st2[] = {"Первая строка", "Вторая строка"};
		String st3[] = {"Первая строка", "Вторая строка"};
		
		if(GenMeth.arraysEqual(st1, st2))
			System.out.println("Массивы st совпадают");

		if(GenMeth.arraysEqual(st1, st3))
			System.out.println("Массивы st совпадают");

		Double nums5[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		Double nums6[] = {1.1, 2.1, 3.1, 4.1, 5.1};

		if(GenMeth.arraysEqual(nums5, nums6))
			System.out.println("Массив nums5 совпадает с nums");

		if(GenMeth.arraysEqual(nums6, nums5))
			System.out.println("Массив nums5 совпадает с nums");

		System.out.println();
		Summation ob = new Summation(4.2);
		System.out.println("сумма целых чисел от 0 до 4.0 равна " + ob.getSum());

		System.out.println();
		Summation ob2 = new Summation(4);
		System.out.println("Сумма целых чисел от 0 до 4.0 равна " + ob2.getSum());

		//Демонстрация
		System.out.println();
		Integer x10[] = {1,2,3};
		Double y10[] = {1.0, 2.0, 3.0};

		ClassGenInt<Integer> ob3 = new ClassGenInt<Integer>(x10);

		if(ob3.contains(2))
			System.out.println("2 содержится в ob3");
		else
			System.out.println("2 несодержится в ob3");
		
		if(ob3.contains(4))
			System.out.println("4 содержится в ob3");
		else
			System.out.println("4 несодержится в ob3");

		ClassGenInt<Double> ob4 = new ClassGenInt<Double>(y10);
		
		
		if(ob4.contains(2.0))
			System.out.println("2.0 содержится в ob4");
		else
			System.out.println("2.0 несодержится в ob4");
		
		if(ob4.contains(4.0))
			System.out.println("4.0 содержится в ob4");
		else
			System.out.println("4.0 несодержится в ob4");
		

	}
}
