package lib;

public class EmployeeJoined extends Employee{
    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;

    public EmployeeJoined(int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear) {
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = monthWorkingInYear;
    }
}
