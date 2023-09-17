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

    public boolean isEqual(Date otherDate) {
        return this.day == otherDate.day && this.month == otherDate.month && this.year == otherDate.year;
    }

    public boolean isBefore(Date otherDate) {
        if (this.year < otherDate.year) {
            return true;
        } else if (this.year == otherDate.year) {
            if (this.month < otherDate.month) {
                return true;
            } else if (this.month == otherDate.month) {
                return this.day < otherDate.day;
            }
        }
        return false;
    }

    public boolean isLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public Date getNextDay() {
        int maxDaysInMonth = 31;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDaysInMonth = 30;
                break;
            case 2:
                maxDaysInMonth = isLeapYear() ? 29 : 28;
                break;
        }

        if (day < maxDaysInMonth) {
            return new Date(day + 1, month, year);
        } else {
            if (month < 12) {
                return new Date(1, month + 1, year);
            } else {
                return new Date(1, 1, year + 1);
            }
        }
    }
}



