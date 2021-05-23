package com.rameshn.solid;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");
        Task t = new Task();
        t.downloadFile("myfile.txt");
        t.parseTheFile("myfile.txt");
        t.persistTheData("somedata");

        System.out.println("After SRP ....");
        // A better approach - each class to have single responsibility
        DataPersistor dp = new DataPersistor();
        dp.persistTheData("somedata");

        FileDownLoader fd = new FileDownLoader();
        fd.downloadFile("myfile.txt");

        FileParser fp = new FileParser();
        fp.parseTheFile("myfile.txt");

    }
}
