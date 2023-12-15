package javaexp.z02_homework.a00_yhs.vo;

public class Trip {
    private String destination;
    // Date
    private int startDate;
    private int endDate;
    // new Trip("제주도",20230901, 20230905)
    public Trip(String destination, int startDate, int endDate) {
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int calculateDays() {
        // 주의: 실제 날짜 계산을 위해서는 java.time.LocalDate 클래스를 사용해야 합니다.
        // 아래는 단순한 예제입니다.
        return endDate-startDate;
    }

    public void displayInfo() {
        System.out.println("Destination: " + destination + ", Start Date: " + startDate + ", End Date: " + endDate);
    }
}
