import java.util.List;
import java.util.ArrayList;
class Kurs {
	static List<String> replan (List <String> plan , String newChapt, String beforeChapt) {
		int newChaptIndex = plan.indexOf(beforeChapt);
		plan.add(newChaptIndex, newChapt);
		return plan;
	}
}
class Kurs2 {
	static List<String> replan (List <String> plan, String newChapt, String beforeChapt) {
		int newChaptIndex = plan.indexOf(beforeChapt);
		List<String> replanned = new ArrayList<>(plan);
		replanned.add(newChaptIndex, newChapt);
		return replanned;
	}
}
/*	planA
	planB = Kurs2.replan(planA, "Создание видеоигр", "Анализ целевой аудитории");
	planA*/

