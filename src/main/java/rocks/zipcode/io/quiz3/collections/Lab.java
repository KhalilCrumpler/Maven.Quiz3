package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labName;
    public Lab() {
        this.labName = "";
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {

        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
    }

    public LabStatus getStatus() {
        return null;
    }
}
