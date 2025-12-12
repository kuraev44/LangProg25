//пример ляьбда-выражеиня:
//() -> 100; возврат значения 100 при вызове лямбда-функции при отсутствии парметров
//(n) -> 1/n; возврат обратного значения параметров(1 параметр)
//(n, m) -> n/m; возврат отношения параметра n к парметру m
// Подоьбные действия в традиционнной записи выглядят так:
class MyClass {
	static int myMeth() {
		return 100;
	}	
}
//Пример интерфейса определяющий абстрактный метод MyMeth(); и абстрактный метод MyMeth2()
interface MyInterface {
	int MyMeth();
	String MyMeth2();

}
//Реализация интерфейса с помощью класса
class MyClass1 implements MyInterface {
	public int MyMeth() {
		return 100;
	}
	public String MyMeth2(){
		//...
		return "Строка";
	}
}
MyInterface var2 = new MyClass1();
//Для вызова реализованного метода MyMeth необходимо создать новый объект класса MyClass1 и вызвать метод для переменной указывающей наэтот объект
//Альтернативное решение с использованием лямбда функции и функционального интерфейс
//Функциональный интерфейс может определять только 1 абстрактный метод
interface MyFuncInterface {
	int MyMeth();
}
//Лямбда - выражение может быть присвоено переменной функционального интерфейса
MyFuncInterface var1 = () -> 100;
System.out.println("вызов лямбда функции для перменной var1" + var1.MyMeth());
System.out.println("вызов лямбда функции для var2" + var2.MyMeth());


//Начинаем использование любого лямбда выражения с опредления подходящего функционального интерфейса
//в функциональном интерфейсе нужно определить метод с нужным типом возвращаемого значения и с нужными типами передаваемых параметров
interface FuncInterface2 {
	double MyMeth(int n);
}
FuncInterface2 reciprocal = (n)->(double)1/n;
System.out.println("Результат вызова метода с одним параметром метода интерфейса FuncInterface2 с одним параметром (обратное значение): " + reciprocal.MyMeth(10));
//3
interface MyFuncInterface3 {
	double MyMeth(int n, int m);
}

MyFuncInterface3 var3 = (n, m) -> (double) n/m;
System.out.println("Отношение 10/5 = " + var3.MyMeth(10, 5));
System.out.println("Отношение 7/2 = " + var3.MyMeth(7, 2));
