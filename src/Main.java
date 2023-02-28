public class Main {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 3;
        int totalMinute = hour * 60 + minute;
        int numToBinary = 0b1100;
        int numToOctal = 014;
        int num = 12;

        int numToHexadecimal = 0x0C;

        float var = 3.15f;

        System.out.println(hour + "h" + minute + "m");
        System.out.println(hour * 60 + minute + "m");
        System.out.println(totalMinute);
        System.out.println(numToBinary);
        System.out.println(numToOctal);
        System.out.println(num);
        System.out.println(numToHexadecimal);
    }
}