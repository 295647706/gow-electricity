package com.example.gowelectricity.util;

import java.io.*;
import java.math.BigDecimal;
import java.net.*;

;

/**
 * @ClassName HttpUtil
 * @Author lzn
 * @DATE 2019/11/7 11:27
 */
public class HttpUtil {

    public static String doPost(String path,String sendValue){
        try {
            if(null == path || path.equals("")) {
                path = "http://bufpay.com/api/pay/95134";
            }
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //添加请求属性
            connection.addRequestProperty("Content-type", "application/x-www-form-urlencoded");
            //允许输入
            connection.setDoInput(true);
            //允许输出
            connection.setDoOutput(true);
            //POST请求要在获取输入输出流之前设置否则报错
            connection.setRequestMethod("POST");

            //输出
            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(sendValue);
            bw.flush();

            //输入
            InputStream in = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(in,"UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            StringBuilder sb = new StringBuilder();
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
            bw.close();
            osw.close();
            os.close();
            br.close();
            isr.close();
            in.close();

            return sb.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String doGet(String path){
        try {
            URL url = new URL(path);
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(in,"utf-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            StringBuilder sb = new StringBuilder();
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            isr.close();
            in.close();

            return sb.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void testPost(){
        //参数处理
        String goodsNames = "正品抢购";
        String payType = "wechat";
        double priceValue = new BigDecimal(0.01).doubleValue();
        String orderId = "2019082613101112340987";
        String orderUid = "1002";
        String notifyUrl = "http://gow.hdongx.com";
        String returnUrl = "http://gow.hdongx.com/12";
        String appSecret = "967e0dc6b34e46c082af6997253fde6c";
        int expire = 24*60*60*1000;
        String format = "json";
        String paramData=goodsNames+payType+priceValue+orderId+orderUid+notifyUrl+returnUrl+appSecret;
        String sign = MD5.md5(paramData);
        String sendString="name="+goodsNames+"&pay_type="+payType+"&price="+priceValue+"&order_id="+orderId
                +"&order_uid="+orderUid+"&notify_url="+notifyUrl+"&return_url="+returnUrl
                +"&sign="+sign+"&expire="+expire;
        String path = "http://bufpay.com/api/pay/95134";
        System.err.println(doPost(path,sendString));
    }


    private static void testGet(){
        String aoid = "fe705289858c42c1832585ea79c15e47";
        String path = "http://bufpay.com/api/query/"+aoid;
        System.err.println(doGet(path));
    }

    public static void main(String[] args) {
        //post 测试
        testPost();

        //get 测试
        //testGet();
    }
}
