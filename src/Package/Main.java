package Package;
 class Main {
	public static void main(String[] args) {	
		PersonPicked personpicked=new PersonPicked("�����");
		Boxes boxes=new Boxes(120);
		Wages wages=new Wages(boxes.boxnow);
		Plans plan=new Plans(boxes.getDescination());
		boxes.boxescount(wages);
		wages.wagesForday(personpicked);
		System.out.println("ʳ������ ����� �� ������� "+plan.test(10));
		System.out.println("ʳ������ ����� ��� ���� "+plan.boxForYear(boxes));
	}
}
