package Package;
 class PersonPicked {
	String name;
	 private int wageone;
	public PersonPicked(String name) {
		this.name=name;
		if (this.name.equalsIgnoreCase("������")) {
			this.wageone=6;
		}else if(this.name.equalsIgnoreCase("�����")) {
			this.wageone=9;
		} else if(this.name.equalsIgnoreCase("�����")) {
			this.wageone=10;
		}
	}
	public int getWageone() {
		return wageone;
	}
	public void setWageone(int wageone) {
		this.wageone = wageone;
	}	
}
