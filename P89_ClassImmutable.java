// WAP to create an immutable class in Java, where the fields cannot be modified after initialization.

package JavaProgramming;
//How to make our class as Immutable in java.
final class Employee {
	private final int empId;
	private final String empName;
	private final double empSal;

	public Employee(int empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	@Override
	public String toString() {
		return getEmpId() + " " + empName + " " + empSal;
	}
}

public class P89_ClassImmutable {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "swapnil", 15000);
		System.out.println(e1);
	}
}
