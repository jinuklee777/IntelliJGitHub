package accessmodifier_;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("월은 1부터 12까지만 가능합니다.");
            System.out.println("기본값 1 할당.");
            return;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String printDate() {
        return this.year + "년 " + this.month + "월 " + this.day + "일";
    }
}
