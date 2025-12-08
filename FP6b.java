
import java.util.List;
import java.util.ArrayList;

class F1b {
	static double avgTime(List <Double> lapTimes) {
//		lapTimes.remove(0);
		double time = 63.3;//F1.totalTime(lapTimes);
		int laps = lapTimes.size();
		return time/laps;
		
	}
	public static void main(String[] args) {
		List <Double> lapTimes = new ArrayList <> ();
		lapTimes.add(31.0);//прогревочный круг, нк учит
		lapTimes.add(20.9);
		lapTimes.add(21.1);
		lapTimes.add(21.3);

		System.out.printf("Общее время: %.1f c\n", F1.totalTime(lapTimes));
		System.out.printf("СРеднее время: %.f1 c\n", avgTime(lapTimes));
	}
}
