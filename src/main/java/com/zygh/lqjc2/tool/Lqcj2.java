package com.zygh.lqjc2.tool;

import com.zygh.lqjc2.model.Lgims;
import com.zygh.lqjc2.model.Wdz;
import com.zygh.lqjc2.model.Zygh_ql;
import org.json.JSONObject;

import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.*;

public class Lqcj2 {
    private static InputStream inputStream;

   public static Wdz get4data(Zygh_ql cang){
       List<Lgims> lgimslists = null;
       Wdz wdz = null;
       try{
           Socket client = new Socket("192.0.0.95", 3000);
           client.setSoTimeout(0);//表示长连接，不中断
           BufferedReader br = new BufferedReader(new InputStreamReader(
                   client.getInputStream(), "UTF-8"));//获取服务端返回的数据
           PrintWriter pw = new PrintWriter(client.getOutputStream(), true);//将客户端的数据输入到服务端
           byte[] bytes = new byte[3548];
           Map map = new HashMap();
           System.out.println(cang);
//           map.put("Httpaddr", "");
//           map.put("Columns", 10);
//           map.put("Rows", 5);
//           map.put("Layers", 4);
//           map.put("Machineaddr", 3119);
//           map.put("Pcaddr", 2);
//           map.put("Houseno", 17);
//           map.put("Jqno", "0");
//           map.put("sendtype", 49);
//           JSONObject jsonobj = new JSONObject(cang);//org.json.JSONObject, 包下的map转json
//           String jsonStr = jsonobj.toString();//json转字符串
//           System.out.println(jsonStr);
         //  pw.println(cang.getData()); // 2、向服务器发送"获取粮情的josn"字符串
           JSONObject jsonobj = new JSONObject(cang.getData());
           System.out.println(jsonobj);
           pw.println(jsonobj);
           inputStream = client.getInputStream();
           inputStream.read(bytes);// 3、接收服务器响应数据
           pw.flush();
           int len = 0;
           String a = "";
           int cea=0;
           lgimslists = new ArrayList<Lgims>();
           inputStream.read(bytes);
           String InTempString=null;
           String InHumdString=null;
           while ((len = inputStream.read(bytes)) != -2) {
               System.out.println("1");
               a = new String(bytes);
               int[] lenchang = new int[3];
               lenchang[cea] = len;
               cea++;
               if (len == lenchang[1]) {
                   JSONObject jsonObject = new JSONObject(a);
                   Object aqwe = jsonObject.get("temperature_str");
                   Object InTemp = jsonObject.get("InTemp");
                   Object InHumd = jsonObject.get("InHumd");
                   String liangqing = aqwe.toString();
                   InTempString = InTemp.toString();//内温
                   InHumdString = InHumd.toString();//内湿
                   String liangqing1 = liangqing.substring(2, liangqing.length() - 2);
                   String[] arr = liangqing1.split("],\\["); // 用,分割
                   String[] arr1 = new String[4];// 7层每一层的数据
                   int[] d = new int[arr1.length];// 把7层数据转换为int方便计算
                   int[] pingjunzhi = new int[arr.length];// 求最大值最小值 平均值
                   for (int i = 0; i < arr.length; i++) {// 7层每一层的数据
                       String yiceng = arr[i].toString();// 7层每一层的数据 转为String
                       arr1 = yiceng.split(",");// 7层每一层的数据 再用逗号分割
                       Lgims lgims=lgimsduixiang(Integer.parseInt(arr1[2]),Integer.parseInt(arr1[1]),Integer.parseInt(arr1[0]),Integer.parseInt(arr1[3]) / 10.00 + "",cang.getCang(),cang.getHousecode());//arr1[2]=x,arr1[1]=y,arr1[0]=g,arr1[3]=值
                       lgimslists.add(lgims);
                       pingjunzhi[i] = Integer.parseInt(arr1[3]);// 取出温度
                       for (int c = 0; c < arr1.length; c++) {// 把7层数据转换为int方便计算
                           d[c] = Integer.parseInt(arr1[c]);// 把7层数据转换为int方便计算
                       }
                   }
                   int[] c = GetMaxMinSumAvg(pingjunzhi);
                   System.out.println(c[0]);
                   System.out.println(c[1]);
                   System.out.println(c[3]);
                   System.out.println(InTempString);
                   wdz = new Wdz();
                   wdz.setLgimsList(lgimslists);
                   wdz.setHight(c[0]/10.00+"");
                   wdz.setLowt(c[1]/10.00+"");
                   wdz.setAvgt(c[3]/10.00+"");
                   wdz.setInnert(Integer.parseInt(InTempString)/10.00+"");
                   wdz.setInh(Integer.parseInt(InHumdString)/10.00+"");
                   break;
               }
           }
       }catch (IOException e){
       }
       return wdz;
   }
    // / <summary>
    // / 求数组中的最大值，最小值，总和以及平均值。
    // / </summary>
    // / <param name="nums">输入一个数组</param>
    // / <returns>返回一个新的数组（max,min,sum,avg）</returns>
    public static int[] GetMaxMinSumAvg(int[] nums) {
       
        int[] arr = new int[4];
        // 假定arr[0]为数组的最大值，arr[1]为数组的最小值，arr[2]为数组的总和,arr[3]为数组的平均值。
        arr[0] = nums[0];// max
        arr[1] = nums[0];// min
        arr[2] = 0;// sum
        for (int i = 0; i < nums.length; i++) {
            if (arr[0] < nums[i]) {
                arr[0] = nums[i];
            }
            if (arr[1] > nums[i]) {
                arr[1] = nums[i];
            }
            arr[2] += nums[i];
        }
        arr[3] = arr[2] / nums.length;
        return arr;
    }


    public static Lgims lgimsduixiang(int x ,int y,int g,String data,String cang,String housecode){
        Lgims lgims = new Lgims();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String shijian = df.format(new Date());
        lgims.setHousecode(housecode);
        lgims.setHousename(cang+"号仓");
        lgims.setArchivesno("0");
        lgims.setChecktime(shijian);
        lgims.setCheckkind("2");
        lgims.setXaxis(x);
        lgims.setYaxis(y);
        lgims.setStorey(g);
        lgims.setData(data);
        lgims.setReportno("0");
        lgims.setResultcode("001");
        lgims.setResultname("成功");
        lgims.setStatuscode("001");
        lgims.setStatusname("正常");
        lgims.setDtstate(1);
        lgims.setCrtime(shijian);
        lgims.setUptime(shijian);
       return lgims;
    }


}
