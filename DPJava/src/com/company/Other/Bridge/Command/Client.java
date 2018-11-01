package com.company.Other.Bridge.Command;

public class Client {
    public static void main(String[] args) {
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        executor.executeOperation(new OpenTextFileOperation(new TextFile("file.txt")));
        System.out.println(executor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt"))));
    }
}
