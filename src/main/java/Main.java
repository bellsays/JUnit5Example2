public class Main {
    public static void main(String[] args) {
        //เรียกใช้คลาสเมน
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(10, 5);
        int resultSubtract = calculator.subtract(10, 5);

        System.out.println("ผลลัพธ์การบวก 10 + 5 = " + resultAdd);
        System.out.println("ผลลัพธ์การลบ 10 - 5 = " + resultSubtract);
    }
}
