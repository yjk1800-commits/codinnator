public class EmptyTest {
    public static void main(String[] args) {
        String operator = "";
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        boolean validOperation = true;

        switch (operator) {
        case '+':
            result =
            break;
        case '-':
            result =
            break;
        case '*':
            result =
            break;
        case '/':  // 나누기 연산
            if (num2 != 0) { // 0으로 나눌 수 없음
                result =
            } else {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                validOperation = false;
            }
            break;
    }
}