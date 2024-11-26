public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        final int IS_PRESENT = 1;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        int workingHours = 0;
        int attendance = (int) (Math.random() * 2);
        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Present");
            workingHours = 8;
        } else {
            System.out.println("Employee is Absent");
        }
        int dailyWage = WAGE_PER_HOUR * workingHours;
        System.out.println("Daily Employee Wage : " + dailyWage);
    }
}
