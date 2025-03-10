package homeWork.HW9.HW91;

public final class Month {
    private String monthName;
    private int monthDays;
    private int workDays;

    public String getMonthName() {
        return monthName;
    }

    public int getMonthDays() {
        return monthDays;
    }

    public int getWorkDays() {
        return workDays;
    }

    public Month(String monthName, int monthDays, int workDays) {
        this.monthName = monthName;
        this.monthDays = monthDays;
        this.workDays = workDays;
    }



}

