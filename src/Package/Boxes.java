package Package;
import java.util.Scanner;
 class Boxes{
	int boxnow;
	private int descination; 
	void boxescount(Wages a) {
	Scanner sc=new Scanner(System.in);
	System.out.print("������ �� ���� ��������� �����: ");
	if (sc.hasNextInt()){
		a.boxnow=sc.nextInt();
	}
		if (descination>boxnow) {
			
			System.out.println("��� ���������� ��������� "+(descination-a.boxnow));
			descination-=boxnow;
		}else if(descination<boxnow) {
			System.out.println("�� ������������ ����");
		}else {System.out.println("�� ������� ���");}
		
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

