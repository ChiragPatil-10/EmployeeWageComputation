public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        final int IS_PRESENT = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        int workingHours = 0;
        int attendance = (int) (Math.random() * 3);
        switch (attendance)
        {
            case IS_PRESENT:
                System.out.println("Employee is Present Full Time ");
                workingHours = 8;
                break;
            case PART_TIME:
                System.out.println("Employee is Present Part Time");
                workingHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int dailyWage = WAGE_PER_HOUR * workingHours;
        System.out.println("Daily Employee Wage : " + dailyWage);
        

    }
}
