package date;

/**
 * day = [ 1, 31]
 * month = [1, 12]
 * year = [1900, 9999
 */

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){

    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        if (day >= 1 && day <= 31){
            return day;

        }else {
            System.out.println("Kun 1 menen 31 din aralygynda gana bolo alat!");
        }
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String strDay = "";
        String strMonth = "";
        String result = null;
        if (day >= 1 && day <= 31){
            if (month >= 1 && month <= 12){
                if (year >= 1900 && year <= 9999){
                    if (this.day <= 9){
                        strDay = "0";
                    }
                    if (this.month <= 9){
                        strMonth = "0";
                    }
                    result = strDay + day + "/"+ strMonth + month + "/" + year;
                }else {
                    result = "Invalid year number : "+year;
                }
            }else {
                result = "Invalid month number: "+month ;
            }

        }else {
            result = "Invalid day number: "+day;
        }

        return result;
    }


}
