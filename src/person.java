public class person<T> {
    private String name;
    private String surname;
    private int numberOfTickets;

    public person(String name, String surname, int numberOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numberOfTickets = numberOfTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setnumberoftickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
