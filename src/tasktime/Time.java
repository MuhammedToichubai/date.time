package tasktime;

/**
 * Time деген класс тузунуз
 * алардын полялары
 * ( hour, minute, second ) болсун
 * Класстын ичинде nextSecond(); жана previousSecond();
 * деген методтору болсун Бул методдорду чакырганынызда
 * саатыныз бир секунда алдыга же бир секунда артка жылышы керек!
 *
 * * INPUT VALIDATION NEEDED
 *  * hour= [ 0,  23]
 *  * minute = [0,  59]
 *  * second= [0,  59]
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public void nextSecond(){

        this.second++;

        if (this.minute > 59){
            this.minute = 0;
            this.hour++;
        }

        if (this.second > 59){
            this.second = 0;
            this.minute++;
        }

        if (this.hour > 23){
            this.hour = 0;
        }

    }

    public void previousSecond(){

        this.second--;

            if (this.minute < 0) {
               this.minute = 59;
                this.hour--;
            }

            if (this.second < 0) {
                this.second = 59;
                this.minute--;
            }

            if (this.hour < 0){
                this.hour = 23;
            }

    }

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
//   *            hour= [ 0,  23]
//            *  * minute = [0,  59]
//            *  * second= [0,  59]
    @Override
    public String toString() {
        String strHour = "";
        String strMinute = "";
        String strSecond = "";
        String result = null;

        if (hour >= 0 && hour <= 23){
            if (minute >= 0 && minute <= 59){
              if (second >= 0 && second <= 59){
                  if (this.hour <= 9){
                      strHour = "0";
                  }
                  if (this.minute <= 9){
                      strMinute = "0";
                  }
                  if (this.second <= 9){
                      strSecond = "0";
                  }
                  result = strHour + hour + ":" + strMinute + minute + ":" + strSecond + second;
              }else {
                  System.out.println("Invalid second number - "+ second);
              }
            }else {
                result = "Invalid minute number - "+ minute;
            }
        }else {
            result = "Invalid hour number - "+ hour;
        }

        return result;
    }

}
