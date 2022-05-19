package Package;
public class Plans{

	public Plans() {
		
	}
	int boxForYear(Boxes boxes ) {
		int d=boxes.getDescination()*365;
		return d;
	}
	int test(int c) {
		PlanForWeek planWeek =new PlanForWeek();
		 return planWeek.boxescount(c);
	}
	
	class PlanForWeek{
		int boxForweek=0;
		int boxescount(int box) {
			 boxForweek=box*7;
			return boxForweek;
		}
	}
	
}
