package ch12exception;

public class ExceptionCatchDemo {
    public static void main(String[] args) {
        // catch 순서: 자식 ----> 부모
        try {
            Car car = null;
            System.out.println(car.name);
        } catch (NullPointerException e) {
            // 1. e.getMessage(): 예외 메세지만 출력
            System.out.println("e.getMessage()");
            System.out.println(e.getMessage());
            System.out.println();

            // 2. e.toString(): exception 타입 + 예외 메세지
            System.out.println("e.toString()");
            System.out.println(e);
            System.out.println();

            // 3. e.printStackTrace(): exception 타입 + 예외 메세지 + 위치
            System.out.println("e.printStackTrace()");
            e.printStackTrace();
        } catch (NegativeArraySizeException e) {
            System.out.println("배열의 크기는 음수이면 안됩니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 크기를 벗어났습니다.");
        } catch (RuntimeException e) {
            System.out.println("여기서 잡았음");
        } catch (Exception e) {
            System.out.println("Exception catch");
        }
    }
}
