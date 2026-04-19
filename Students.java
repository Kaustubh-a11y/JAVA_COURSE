public class Students {

    private int rollNo;
    private String studName;
    private String studBranch;

    // DEFAULT CONSTRUCTOR
    public Students() {
        rollNo = -1;
        studName = "NA";
        studBranch = "NA";
    }

    // PARAMETERIZED CONSTRUCTOR
    public Students(int rollNo, String studName, String studBranch) {
        System.out.println("Inside Parameterized Constructor");
        this.rollNo = rollNo;
        this.studName = studName;
        this.studBranch = studBranch;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudBranch() {
        return studBranch;
    }

    public void setStudBranch(String studBranch) {
        this.studBranch = studBranch;
    }
}
