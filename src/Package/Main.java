package Package;
 class Main {
	public static void main(String[] args) {	
		PersonPicked personpicked=new PersonPicked("сливи");
		Boxes boxes=new Boxes(120);
		Wages wages=new Wages(boxes.boxnow);
		Plans plan=new Plans(boxes.getDescination());
		boxes.boxescount(wages);
		wages.wagesForday(personpicked);
		System.out.println("Кількість ящиків за тиждень "+plan.test(10));
		System.out.println("Кількість яшиків при нормі "+plan.boxForYear(boxes));
	}
}
