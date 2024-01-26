package in.mohammadasif.calender;

/**
 *
 * @author mohammad asif
 * @Email: mohammadasif2808@gmail.com
 * @Date: Jan 26, 2024
 * @Time: 5:47:18 PM
 */
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
    
    public void nextDay() {
        int dayCount = daysInMonth(this.month, this.year);
        this.day++;
        if (this.day > dayCount) {
            this.day = 1;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    private int daysInMonth(int month, int year) {
        int rv;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                rv = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    rv = 29;
                } else {
                    rv = 28;
                }
                break;
            default:
                rv = 31;
                break;
        }
        return rv;
    }

    private boolean isLeapYear(int year) {
        return (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
    }
}
