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

        String result = is369(33);
        System.out.println(result);
    }

    private static void game369() {
        for (int cnt = 0 ; cnt < 100;  cnt ++){
            int i = cnt / 10;
            int j = cnt % 10;

            if (((i == 3) || (i == 6) || (i == 9))  && ((j == 3) || (j == 6) || (j == 9))){
                System.out.print("*");
            }else if ((i == 3) || (i == 6) || (i == 9)){
                System.out.print("$");
            }else if ((j == 3) || (j == 6) || (j == 9)){
                System.out.print("#");
            }else{
                System.out.print(cnt);
            }
        }
    }

    private static String is369(int cnt){
        int a = cnt / 10;
        int b = cnt % 10;

        if(a==0){
            if (b % 3 == 0 && b != 0){
                return "*";
            }else {
                return "";
            }
        }
        if (b%3 == 0 && b != 0){
            return "*" + is369(a);
        }else {
            return is369(a);
        }

    }
    private static void checkYear() {
        int year = 2400;

        if ( (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))
            System.out.println("윤년입니다 1");
            else
                System.out.println("윤년이 아닙니다.0");
    }

    private static void Exam4() {
        // 어디에서 오버플로가 나올지 생각하는게 중요

        int num_a = 120;
        byte num_b = (byte)num_a;
        System.out.println(num_b);

        short num_c = 130;
        int num_d = num_c;
        System.out.println(num_d);

        int num_e = 10;
        float num_f = num_e;
        System.out.println(num_f);

        float num_g = 10.5f;
        int num_h = (int)num_g;
        System.out.println(num_h);
    }

    private static void Exam3() {
        short a = 200;  // 1100 1000
        byte b = (byte)a;
        System.out.println(b);
        // -> 오버플로
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