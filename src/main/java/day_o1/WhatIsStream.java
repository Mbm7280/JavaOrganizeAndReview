package day_o1;

import java.io.*;

/**
 * 什么是流?
 *
 * Io分类
 *      字节流
 *          InputSteam
 *
 *          OutPutSteam
 *      字符流
 *          Reader
 *
 *          Writer
 *
 *
 */

class readFile{

    public static void main(String[] args) throws IOException {

        // 1.制定路径
        File file = new File("/Users/maibangmin/app/a.txt");
        // 2.读取数据(每次读取一个字符)
        FileInputStream inputStream = new FileInputStream(file);
        int read = inputStream.read();
        // System.out.println(read);
        // 3.循环读取
        int by = 0;
        while ((by = inputStream.read()) != -1){
            //System.out.println((char)by);
        }
        inputStream.close();

    }


}

class WhatIsStream {

    public static void main(String[] args) throws IOException {
        // 1.制定路径
        File file = new File("/Users/maibangmin/app/a.txt");
        // file.createNewFile();

        // 2.写入数据
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        // 数字类型
        fileOutputStream.write(666);
        // 数组类型
        byte[] bytes = {1,2,3,4};
        fileOutputStream.write(bytes);
        // 字符类型
        fileOutputStream.write("hello".getBytes());
        // 换行
            //  mac \r
            // linux \n
            // windows \r\n
        fileOutputStream.write(("hi" + "\r").getBytes());
        fileOutputStream.close();
    }

}





