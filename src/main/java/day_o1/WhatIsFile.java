package day_o1;

import java.io.File;
import java.io.IOException;

/**
 * 文件操作
 * Mac无盘符区分,一切路径以/开始
 */
public class WhatIsFile {

    public static void main(String[] args) throws IOException {

        // 1.创建文件
        File file = new File("/Users/maibangmin/app/a.txt");
        // file.createNewFile();


        // 2. 删除文件
        // file.delete();

        // 3 创建文件夹
        File file1 = new File("/Users/maibangmin/app/dir");
        // file1.mkdirs();

        // 4.删除文件夹
        // file1.deleteOnExit();

        // 5.判断该文件是否存在 存在则返回true 不存在则false
        // boolean exists = file1.exists();
        // System.out.println(exists);

        // 6.读取该路径下的所有文件
        File file2 = new File("/Users/maibangmin/app");
        File[] files = file2.listFiles();
        for (File f:files) {
            System.out.println(f.getName());
        }

    }

}
