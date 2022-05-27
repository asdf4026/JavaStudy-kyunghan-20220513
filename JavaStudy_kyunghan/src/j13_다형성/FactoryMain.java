package j13_다형성;

public class FactoryMain {

	public static void main(String[] args) {
		int i = 10;
		double d = i;
		Factory[] factorys = new Factory[5];
		//업캐스팅
		Factory  smartPhoneFactory = new SmartPhoneFactory();
		Factory  computerFactory = new ComputerFactory();
		
		computerFactory.start();
		smartPhoneFactory.start();
	}

}
