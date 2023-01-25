class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxmarks() {
        return maxMarks;
    }

    public int getMarksobtain() {
        return marksObtain;
    }

    public void setMaxmarks(int max) {
        if (max >= 0) {
            maxMarks = max;
        }
    }

    public void setMarksobtain(int obtain) {
        if (obtain >= 0) {
            marksObtain = obtain;
        }
    }

    // constructors
    public Subject(String id, String n, int max, int obtain) {
        subID = id;
        name = n;
        setMaxmarks(max);
        setMarksobtain(obtain);
    }

    boolean isQualified() {
        return marksObtain >= maxMarks / 10 * 4;
    }

    public String toString() {
        return "\nSubject ID: " + subID + "\nName: " + name + "\nMarks obtained: " + marksObtain;
    }
}