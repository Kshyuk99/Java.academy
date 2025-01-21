package com.company.day009;

interface Vehicle{
	public void run();
}
class MotorCycle implements Vehicle{
	@Override public void run() { System.out.println("오토바이가 달립니다");  }	
}
class Car implements Vehicle{
	@Override public void run() { System.out.println("자동차가 달립니다");  }	
}
class Driver{
	void drive(Vehicle v) {v.run();} // @run 자식의 각각의 run 호출	

}
public class Interface003 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Car car = new Car();
		MotorCycle mo = new MotorCycle();
		
		driver.drive(car);  // 리턴값 메서드명(재료)
		driver.drive(mo);   // void drive(car/mo 둘다담는 자료형 = Vehicle)

	}
}
