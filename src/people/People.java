package people;

public class People {
    private String citizen1;
    private String citizen2;

    public People(String citizen1, String citizen2) {
        this.citizen1 = citizen1;
        this.citizen2 = citizen2;
    }


    public String getCitizen1() {
        return citizen1;
    }

    public String getCitizen2() {
        return citizen2;
    }

    public void setCitizen1(String citizen1) {
        this.citizen1 = citizen1;
    }

    public void setCitizen2(String citizen2) {
        this.citizen2 = citizen2;
    }

    @Override
    public String toString() {
        return "People{" +
                "citizen1='" + citizen1 + '\'' +
                ", citizen2='" + citizen2 + '\'' +
                '}';
    }
}
