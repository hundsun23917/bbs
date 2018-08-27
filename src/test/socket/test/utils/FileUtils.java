package socket.test.utils;

import java.io.*;

public class FileUtils {
    public static void main(String[] args) throws IOException {
        System.out.println(FileUtils.getFileStr("d://socket.txt"));
    }
    public static StringBuilder getFileStr(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();//这个等于null，里面的方法没法用，会报空指针异常。
        String tempStr = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        while((tempStr = bufferedReader.readLine())!=null){
            stringBuilder.append(tempStr);
        }
        return stringBuilder;
    }
}
