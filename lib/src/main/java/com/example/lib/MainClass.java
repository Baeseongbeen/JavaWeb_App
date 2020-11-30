package com.example.lib;
// 데이터 타입 ( 8개 기본데이터 타입 + 참조데이터타입 ) 제어문
// 연산자 ( 나머지, 논리, 비트 연산자 정도만 조금 차이 있다 )
// 제어문 ( 조건문, 반복문 )
// 메소드 ( 함수 )
// ---------- 초급 ------------
// 객체지향 ( 추상화, 캡슐화, 상속, 다형성 ) ->  리팩토링 + 디자인패턴  공부하면 도움 된다.
// 쓰레드, IO, 네트워크 ( 라이브러리 )
// swing, JavaFX(Windows), Spring(Web), Android(mobile) // swing, JavaFx 거의 안씀


public class MainClass {
    public static void main(String[] args){
        Exam02();

    }

    private static void Exam02() {
        // 논리형
        boolean b1 = true; // 1byte = 8bit
        boolean b2 = false; // 1byte
        System.out.println(b1);

        // 문자형
        char c = 'A';

        // 정수형
        byte num1 = 127; // 1byte
        short num2 = 20; // 2byte
        int num3 = 30; // 4byte
        long num4 = 50; // 8byte

        // 실수형
        float num5 = (float) 49.1; // 4byte
        float num6 =  49.1f; // 4byte
        double num7 = 10.3; // 8byte
    }

    private static void Exam01() {
        System.out.println("Hello World!");
    }
}