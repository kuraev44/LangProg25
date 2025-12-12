class MyClass {
	static int myMeth() {
		return 100;
	}	
}
interface MyInterface {
	int MyMeth();
	String MyMeth2();

}
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
interface MyFuncInterface {
	int MyMeth();
}
MyFuncInterface var1 = () -> 100;
System.out.println("вызов лямбда функции для перменной var1" + var1.MyMeth());
System.out.println("вызов лямбда функции для var2" + var2.MyMeth());
interface FuncInterface2 {
	double MyMeth(int n);
}
FuncInterface2 reciprocal = (n)->(double)1/n;
System.out.println("Результат вызова метода с одним параметром метода интерфейса FuncInterface2 с одним параметром (обратное значение): " + reciprocal.MyMeth(10));
interface MyFuncInterface3 {
	double MyMeth(int n, int m);
}
MyFuncInterface3 var3 = (n, m) -> (double) n/m;
System.out.println("Отношение 10/5 = " + var3.MyMeth(10, 5));
System.out.println("Отношение 7/2 = " + var3.MyMeth(7, 2));
int a = 1500;
int b = 300;
var3.MyMeth(a, b);
double x;
MyFuncInterface3 del = (n,m)-> Math.random()*n /(Math.random()*m);
interface Funcinterface4 {
    doolean MyMeth(int m, int n);
}
interface MyValue {
    double getValue();
}
interface MyParamValue {
    double getValue(double v);
}
MyValue myVal;
interface FuncInterface5 {
    int MyMeth2 (String a, String b);
}
FuncInterface5 comTICase = (a,b) -> a.compareToIgnoreCase(b);
String a1="10";
String b1="1";
comTICase.MyMeth2(a1,b1)
interface NumericFunc {
    int func(int n);
}
smallestF.func(12)
smallestF.func(9)
smallestF.func(25)
NumericFunc smallestF = (n) -> {
    int result = 1;
    n = n < 0 ? -n : n;
    for(int i=2; i <= n/i; i++)
    if((n%i) == 1) {System.out.println("Параметр - простое число");
        result = i;
        break;
   }
    return result;
};