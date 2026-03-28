package hw1;
//256559秒幾天幾小時幾分幾秒
public class hw3 {
    public static void main(String[] args) {
        int totalSeconds = 256559;
        int secondsInDay = 24 * 60 * 60;
        int secondsInHour = 60 * 60;
        int secondsInMinute = 60;

        int days = totalSeconds / secondsInDay;
        int remainingSecondsAfterDays = totalSeconds % secondsInDay;

        int hours = remainingSecondsAfterDays / secondsInHour;
        int remainingSecondsAfterHours = remainingSecondsAfterDays % secondsInHour;

        int minutes = remainingSecondsAfterHours / secondsInMinute;
        int seconds = remainingSecondsAfterHours % secondsInMinute;

        System.out.println(totalSeconds + "秒等於" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
    }
}
