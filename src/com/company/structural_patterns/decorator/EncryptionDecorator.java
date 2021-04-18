package com.company.structural_patterns.decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Encrypting data...");
        super.writeData("test data");
    }

    @Override
    public String readData() {
        System.out.println("Decrypting data...");
        return super.readData();
    }
}
