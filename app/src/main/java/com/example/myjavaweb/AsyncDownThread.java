package com.example.myjavaweb;

import android.os.Handler;
import android.os.Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AsyncDownThread extends Thread {
    private Handler mHandler;
    private String mAddr;

    public AsyncDownThread(String addr, Handler handler) {
        this.mAddr = addr;
        this.mHandler = handler;
    }

    public void run() {
        String result = DownloadHtml(mAddr);

        Message message = mHandler.obtainMessage();
        message.obj = result;
        mHandler.sendMessage(message);
    }

    private String DownloadHtml(String addr) {
        StringBuilder html = new StringBuilder();
        try {
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            if (conn != null) {
                conn.setConnectTimeout(10000);
                conn.setUseCaches(false);
                if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    BufferedReader br = new BufferedReader( new InputStreamReader(conn.getInputStream()) );
                    while (true) {
                        String line = br.readLine();
                        if (line == null)
                            break;
                        html.append(line + '\n');
                    }
                    br.close();
                }
                conn.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return html.toString();
    }

}
