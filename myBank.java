interface myBank {
    void readData();

    void writeData();
}

class SBI_Read implements myBank {
    public void readData() {
        System.out.println("SBI Reads the Data...");
    }

    public void writeData() {
        System.out.println("SBI Writes the Data...");
    }
}