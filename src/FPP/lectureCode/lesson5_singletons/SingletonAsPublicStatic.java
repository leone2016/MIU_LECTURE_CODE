package FPP.lectureCode.lesson5_singletons;

public class SingletonAsPublicStatic {
	public static final SingletonAsPublicStatic INSTANCE 
		= new SingletonAsPublicStatic();
	
	private SingletonAsPublicStatic() {}
	
	public static void main(String[] args) {
		SingletonAsPublicStatic singleton =
			SingletonAsPublicStatic.INSTANCE;
	}
}
