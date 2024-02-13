public class SumExample {
    public static int sumNumbers(int start, int end) {
        int sum = 0; // 변수 선언과 초기화
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sumNumbers(1, 10); // 메소드 호출
        System.out.println("Sum: " + result);
    }
}
