package org.example;

import java.io.*;


//        D:\project\java\python_test.py
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        excJava();
    }
    public static void excPython() throws IOException, InterruptedException {
        String Script_Path = "..\\DemoProcess\\python_test.py";
        ProcessBuilder Process_Builder = new
                ProcessBuilder("python",Script_Path)
                .inheritIO();

        Process Demo_Process = Process_Builder.start();
        Demo_Process.waitFor();

        BufferedReader Buffered_Reader = new BufferedReader(
                new InputStreamReader(
                        Demo_Process.getInputStream()
                ));
        String Output_line = "";

        while ((Output_line = Buffered_Reader.readLine()) != null) {
            System.out.println(Output_line);
        }
    }
    public static void excJava() throws IOException, InterruptedException {
        String Script_Path = "..\\DemoProcess\\java_test.java";
        ProcessBuilder Process_Builder = new
                ProcessBuilder("java",Script_Path)
                .inheritIO();

        Process Demo_Process = Process_Builder.start();
        Demo_Process.waitFor();

        BufferedReader Buffered_Reader = new BufferedReader(
                new InputStreamReader(
                        Demo_Process.getInputStream()
                ));
        String Output_line = "";

        while ((Output_line = Buffered_Reader.readLine()) != null) {
            System.out.println(Output_line);
        }
    }
}