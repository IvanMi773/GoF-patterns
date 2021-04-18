package com.company.structural_patterns.decorator;

public class Main {

    public static void main(String[] args) {
        DataSourceDecorator source = new EncryptionDecorator(new FileDataSource("test_file.txt"));
        source.writeData("test data");
        source = new EncryptionDecorator(source);
        source.writeData("data");
    }
}
