class Gen<T> {
	//Обьявление переменной обощенного типа
	T ob;
	//Определение конструктора в качестве параметра указываем обьект обощенного типа
	Gen(T o) {
		ob = o;
	}
	//Метод возвращающий обьект
	T getOb() {
		return ob;
	}
	//Метод получающий информациюж об имени типа
	void showType() {
		System.out.println("Тип Т: " + ob.getClass().getName());
	}
}
class ii001 {
	public static void main(String[] args) {
		//Создаем обьект типа integer
		Gen<Integer> iOb;
		//Присваиваем ссылку на новый обьект
		iOb = new Gen<Integer>(88);
		//Выводим инфо о типе обьекта
		iOb.showType();
		//прсиваиваем целой переменной значение, хранящееся в обььекте
		int V = iOb.getOb();
		System.out.println("Значение: " + V);

		System.out.println();
		//Создание обьекта
		Gen<String> strOb = new Gen<String>("Строка обощенного класса");
		//вывод
		strOb.showType();
		String str = strOb.getOb();
		System.out.println("Значение в переменнй str " + str);
	}
}
