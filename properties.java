class Student {
    // read only property

    private int roll;

    public int getRollNumber() {
        return roll;
    }

}

class producer {
    // write only property

    private int sharedData;

    public void setData(int d) {
        sharedData = d;
    }
}
