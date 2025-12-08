static double totalTime(List <Double> lapTimes) {
	lapTimes.remove(0);
	double sum = 0;
	for (double x: lapTimes) {
	sum += x;
	}
	return sum;
}
static double avgTime(List <Double> lapTimes) {
//lapTimes.remove(0);
	double time = 63.3;//F1.totalTime(lapTimes);
	int laps = lapTimes.size();
	return time/laps;
		
}
