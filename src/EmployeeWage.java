import com.sun.tools.javac.Main;

public class EmployeeWage {

    public static final int IS_PRESENT = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public int totalWage = 0;
    public int totalWorkingHrs = 0;

    public void computeEmployeeWage() {
        System.out.printf("%5s    %5s    %5s    %5s\n", "Day", "WorkingHrs", "Wage", "Total working hrs");

        for (int day = 1; day <= MAX_WORKING_DAYS && totalWorkingHrs < MAX_WORKING_HOURS; day++) {
            int attendance = (int) (Math.random() * 3);
            int workingHours = 0;

            switch (attendance) {

                case IS_PRESENT:
                    System.out.println("Employee is Present Full Time ");
                    workingHours = FULL_DAY_HOUR;
                    break;
                case PART_TIME:
                    System.out.println("Employee is Present Part Time");
                    workingHours = PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    workingHours = 0;
            }

            int wage = WAGE_PER_HOUR * workingHours;

            totalWorkingHrs += workingHours;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHrs);
        }
        System.out.println("Total Wage of Employee for a month is: " + totalWage);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.computeEmployeeWage();

    }
}
