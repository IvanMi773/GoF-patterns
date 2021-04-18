package com.company.structural_patterns.decorator;

public class DataSourceDecorator implements DataSource {

    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData("test data");
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }

//    public DataSource getDataSource() {
//        return dataSource;
//    }
//
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
}
