package com.company.structural_patterns.decorator;

public class FileDataSource implements DataSource {

    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to " + filename);
    }

    @Override
    public String readData() {
        System.out.println("Reading data from  " + filename);
        return filename;
    }
}
