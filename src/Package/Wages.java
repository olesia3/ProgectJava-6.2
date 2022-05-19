package Package;
class Wages extends Boxes{
	int wage;
	public Wages(int boxnow) {
		super(boxnow);
	}

	void wagesForday(PersonPicked personPicked) {
		 wage=boxnow*personPicked.getWageone();
		System.out.println("Ви за день отримали "+wage);
		 
	}	 
		
	}		 


