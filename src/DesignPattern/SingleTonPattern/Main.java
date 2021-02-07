package DesignPattern.SingleTonPattern;

public class Main {
    public static void main(String[] args) {
        new FirstPage().setAndPrintSettings();
        new SecondPage().printSettings();

        //그결과 FirstPage()에서 수정한 singleton객체와 SecondPage에서 출력한 singleton객체가 동일한 것을 확인할 수 있다.
    }
}
