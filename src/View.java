import java.util.Scanner;
public class View {
    public int show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음을 선택하여 입력해주세요.");
        System.out.println("1. 더하기(+)");
        System.out.println("2. 빼기(-)");
        System.out.println("3. 곱하기(*)");
        System.out.println("4. 나누기(/)");
        int s = sc.nextInt();
        return s;
    }

    public int operation(int a) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int result = 0;
        switch (a) {
            case 1:
                System.out.println("덧셈을 선택하셨습니다.");
                System.out.printf("첫번째 수 : ");
                x = sc.nextInt();
                System.out.printf("두번째 수 : ");
                y = sc.nextInt();
                result = x+y;
                break;
            case 2:
                System.out.println("뺄셈을 선택하셨습니다.");
                System.out.printf("첫번째 수 : ");
                x = sc.nextInt();
                System.out.printf("두번째 수 : ");
                y = sc.nextInt();
                result = x-y;
                break;
            case 3:
                System.out.println("곱셈을 선택하셨습니다.");
                System.out.printf("첫번째 수 : ");
                x = sc.nextInt();
                System.out.printf("두번째 수 : ");
                y = sc.nextInt();
                result = x*y;
                break;
            case 4:
                System.out.println("나눗셈을 선택하셨습니다.");
                System.out.printf("첫번째 수 : ");
                x = sc.nextInt();
                while (y == 0) {
                    System.out.printf("두번째 수 : ");
                    y = sc.nextInt();
                }
                result = x/y;
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        return result;
    }
}
