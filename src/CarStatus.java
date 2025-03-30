import java.util.Scanner;

public class CarStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자동차 상태 입력>> ");
        int status = scanner.nextInt();

        // 비트 0~5: 온도 (0~31)
        int temperature = status & 0b00111111;

        // 비트 6: 에어컨 상태
        boolean airconOn = (status & 0b01000000) != 0;

        // 비트 7: 자동차 이동 상태
        boolean isRunning = (status & 0b10000000) != 0;

        // 상태 출력
        String runningStatus = isRunning ? "달리는 상태" : "정지 상태";
        String airconStatus = airconOn ? "켜진 상태" : "꺼진 상태";

        System.out.println("자동차는 " + runningStatus + "이고 에어컨이 " + airconStatus + "이고 온도는 " + temperature + "도이다.");
    }
}