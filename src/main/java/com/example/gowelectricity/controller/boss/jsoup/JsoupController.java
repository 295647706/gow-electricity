package com.example.gowelectricity.controller.boss.jsoup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName JsoupController
 * @Author lzn
 * @DATE 2019/10/15 11:26
 */
@Controller
@RequestMapping("/boss/jsoup")
public class JsoupController {


    /**
     * 下载完整的html
     * */
    @GetMapping("/downloadHtml")
    @ResponseBody
    public String downloadHtml(String path,String content){
        try{
            //创建连接
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            //设置连接方式
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            //使用输出流发送参数
            if(null != content && !content.equals("")) {
                OutputStream outputStream = connection.getOutputStream();
                outputStream.write(content.getBytes());
            }
            //输入流接收数据
            InputStream inputStream = connection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len = 0;
            while (true){
                len = inputStream.read(bytes);
                if(len == -1){
                    break;
                }
                byteArrayOutputStream.write(bytes,0,len);
            }
            System.err.println(byteArrayOutputStream.toString());
            return byteArrayOutputStream.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
