package corejava.secao10.domain;

public class Rent {
    private String name;
    private String email;
    private Integer room;

    public Rent(String name, String email, Integer room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public Rent() {
    }

    @Override
    public String toString() {
        return "Rent{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", room=" + room +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}
