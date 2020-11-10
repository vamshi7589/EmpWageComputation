public class EmployeeWageComputation
{
	final int isFullTime=1;
	final int isPartTime=2;
	final int partTimeHours=4;
	final int fullTimeHours=8;
	final int empRatePerHour=20;
	final int maxHours=100;
        final int maxDays=20;
public int empAttendance() {
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		return empCheck;
	}
	public void welcomeMessage() {
		System.out.println("Welcome to Employee Wage Computation Program");
	}
	public void checkAttendence(){
		switch (empAttendance()) {
		case isFullTime:
			System.out.println("Employee is full time");
			break;
		case isPartTime:
			System.out.println("Employee is part time");
			break;
		default:
			System.out.println("Employee is absent");
		}
	}
public int daliyWage(int n) {
		int empWage=0;
		switch (n) {
		case isFullTime:
			empWage = (empRatePerHour*fullTimeHours);
			break;
		case isPartTime:
			empWage= (empRatePerHour*partTimeHours);
			break;
		default:
			break;
		}
		return empWage;
	}
