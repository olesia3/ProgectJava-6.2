package Package;
import java.util.Scanner;
 class Boxes{
	int boxnow;
	private int descination; 
	void boxescount(Wages a) {
	Scanner sc=new Scanner(System.in);
	System.out.print("—к≥льки за день назбирали €щик≥в: ");
	if (sc.hasNextInt()){
		a.boxnow=sc.nextInt();
	}
		if (descination>boxnow) {
			
			System.out.println("¬ам залишилос€ назбирати "+(descination-a.boxnow));
			descination-=boxnow;
		}else if(descination<boxnow) {
			System.out.println("¬и перевиконали план");
		}else {System.out.println("¬и дос€гли ц≥л≥");}
		
	}
	

	public int getDescination() {
		return descination;
	}
	public void setDescination(int descination) {
		this.descination = descination;
	}
	public Boxes(int descination) {
		this.descination=descination;
	}
}

