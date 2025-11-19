class GenQueueDemo {
	public static void main(String[] args) {
		//создаем очередь int
		Integer[] iArray = new Integer[4];
		GenQueue<Integer> q = new GenQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("Операции с очередью Integer");
		try {
			for(int i=0; i < 5; i++) {
					System.out.println("Добавляем " + i + " элемент в очереди q");
					q.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Извлечени элемента int");
				iVal = q.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		//Создаем очередь
		String[] sArray = new String[10];
		GenQueue<String> q1 = new GenQueue<String>(sArray);
		String sVal;
		System.out.println("Операции с очередью из String");
		try {
			for(int i=0; i < 5; i++) {
				System.out.println("Добавляе строку " + i + " в очередь q1");
				q1.put("строка " + i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i=0; i<5; i++) {
				System.out.println("Извечение строки из q1");
				sVal = q1.get();
				System.out.println(sVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
		
		//создаем очередь int
		Integer[] iArray1 = new Integer[4];
		GenQueue<Integer> q2 = new GenQueue<Integer>(iArray);
		System.out.println("Операции с очередью Integer");
		try {
			for(int i=0; i < 3; i++) {
					System.out.println("Добавляем " + i + " элемент в очереди q2");
					q2.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i=0; i < 3; i++) {
				System.out.println("Извлечени элемента int");
				iVal = q2.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		try {
			for (int i=0; i < 7; i++) {
				System.out.println("повторно добавляем");
				q2.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
	}
}
