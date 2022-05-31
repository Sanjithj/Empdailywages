package employeeUC1;

public class Empdailywages {
	
		public static void main(String[]args) {
			int IS_FULL_TIME = 1;
			int Emp_rate_per_hrs = 20;
			int emphrs = 0;
			int empwage = 0;
			double empCheck = Math.floor(Math.random()*10)%2;
			if(empCheck == IS_FULL_TIME)
				emphrs = 8;
			else
				emphrs = 0;
			empwage = emphrs * Emp_rate_per_hrs;
			System.out.println("Emp wage: "  + empwage);
		}
	}