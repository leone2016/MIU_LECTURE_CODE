package FPP.lectureCode.lesson4.equals.sameclass;

class PersonWithJob {
	private double salary;
	private Person p;
	
	PersonWithJob(String n, double s) {
		p = new Person(n);
		salary = s;
	}
	public String getName() {
		return this.p.getName();
	}
	public double getSalary() {
		return this.salary;
	}
	
	@Override
	public boolean equals(Object withJob) {
		if (withJob == null)
			return false;
//		System.out.println(withJob.getClass());
//		System.out.println(this.getClass());
		if (withJob.getClass() != this.getClass())
			return false;
		PersonWithJob pp = (PersonWithJob) withJob;
		boolean isEqual = this.p.equals(pp.p) 
				&& Math.abs(this.salary-pp.getSalary())<0.0001;
		return isEqual;
	}

}
