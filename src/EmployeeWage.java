public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        final int IS_PRESENT = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        final int WORKING_DAYS = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;


        int totalWage = 0;
        int workingHours = 0;
        int totalWorkingHrs = 0;
        System.out.printf("%5s    %5s    %5s    %5s\n", "Day", "WorkingHrs", "Wage", "Total working hrs");
        for (int day = 1; day <= MAX_WORKING_DAYS && totalWorkingHrs < MAX_WORKING_HOURS; day++,totalWorkingHrs += workingHours)
        {
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
                    workingHours=0;
            }

            int wage = WAGE_PER_HOUR * workingHours;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHrs + workingHours);

        }
        System.out.println("Total Wage of Employee for a month is: " + totalWage);
    }
}
