package com.example.myjavaweb;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest {
    @Test
    public void testSlowCopy() throws Exception{
        InputStream in = new FileInputStream("C:\\Apps\\test.txt");
        OutputStream out = new FileOutputStream("C:\\Apps\\copytest2.txt");
        int copyByte = 0;
        int bData;

        while(true){
            bData = in.read();
            if(bData == -1) break;
            out.write(bData);
            copyByte++;
        }
        in.close();
        out.close();
        System.out.println("복사된 바이트 크기" + copyByte);
    }
    @Test
    public void testFastCopy() throws Exception{
        InputStream in = new FileInputStream("C:\\Apps\\test.txt");
        OutputStream out = new FileOutputStream("C:\\Apps\\copytest.txt");
        BufferedInputStream bin = new BufferedInputStream(in);
        BufferedOutputStream bout = new BufferedOutputStream(out);
        int copyByte = 0;
        int bData;

        while(true){
            bData = bin.read();
            if(bData == -1) break;
            bout.write(bData);
            copyByte++;
        }
        in.close();
        out.close();
        System.out.println("복사된 바이트 크기" + copyByte);
    }
    @Test
    public void testTextFile() throws IOException{
        BufferedWriter out =
                new BufferedWriter(new FileWriter("C:\\Apps\\str.txt"));
        out.write("써볼게요");
        out.newLine();
        out.newLine();
        out.write("잘되나요");
        out.close();
    }
    @Test
    public void testLoadTextFile() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Apps\\str.txt"));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while (true) {
            str = in.readLine();
            if (str == null) break;
            sb.append(str);
        }
        in.close();
        System.out.println(sb.toString());
    }

}
