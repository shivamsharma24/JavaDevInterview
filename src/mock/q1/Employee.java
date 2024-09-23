package mock.q1;

public class Employee {
    int id;
    String name;
    int depId;
    int codeCommitCount;

    public Employee(int id, String name, int depId, int codeCommitCount) {
        this.id = id;
        this.name = name;
        this.depId = depId;
        this.codeCommitCount = codeCommitCount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", depId=" + depId +
                ", codeCommitCount=" + codeCommitCount +
                '}';
    }
}
