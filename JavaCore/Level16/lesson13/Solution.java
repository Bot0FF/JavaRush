package com.javarush.task.task16.task1630;

/* 
Последовательный вывод файлов
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = br.readLine();
            secondFileName = br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;
        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileName;
        String fileContext;

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public void run(){
            String line;
            try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
                while ((line = br.readLine()) != null) {
                    fileContext += line + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String getFileContent() {
            return fileContext;
        }
    }
}
