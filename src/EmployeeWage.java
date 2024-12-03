
public class EmployeeWage {

    public static void computeEmployeeWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
         int totalWage = 0;
         int totalWorkingHrs = 0;

        System.out.printf("Company: %s\n", companyName);
        System.out.printf("%5s    %5s    %5s    %5s\n", "Day", "WorkingHrs", "Wage", "Total working hrs");

        for (int day =1; day<= maxWorkingDays && totalWorkingHrs < maxWorkingHours; day++) {
            int attendance = (int) (Math.random() * 3);
            int workingHours = 0;

            switch (attendance) {
                case 1:
                    workingHours = 8;
                    break;
                case 2:
                    workingHours = 4;
                    break;
                default:
                    workingHours = 0;
            }

            int wage = wagePerHour * workingHours;
            totalWorkingHrs += workingHours;

            if (totalWorkingHrs > maxWorkingHours) {
                workingHours -= totalWorkingHrs - maxWorkingHours;
                totalWorkingHrs = maxWorkingHours;
                wage = wagePerHour * workingHours;
            }

            totalWage += wage;

            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHrs);

        }
        System.out.println("Total Wage of Employee for " + companyName + " is: " + totalWage);

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        computeEmployeeWage("TCS", 20,23,120);
        System.out.println();
        computeEmployeeWage("HCL Tech" , 22,20,110);
        System.out.println();
        computeEmployeeWage("Amazon",50,20,110);

    }
}
