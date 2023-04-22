import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<person> client = generateClients();
        Deque<person> At = new LinkedList<>(client);


        while (!At.isEmpty()) {
            person p = At.poll();
            int numberOfTickets = p.getNumberOfTickets();
            numberOfTickets = numberOfTickets - 1;
            System.out.println("Клиент " + p.getName() + " " + p.getSurname() + " прокатился на актракционе, у него осталось " + numberOfTickets + " билетов");
            p.setnumberoftickets(numberOfTickets);
            if (numberOfTickets > 0) At.offer(p);
        }
        System.out.println("Билеты закончились");
    }

    private static List<person> generateClients() {
        List<person> t = new LinkedList<>();
        t.add(new person("Liza", "Simacova", 4));
        t.add(new person("Tanya", "Mozina", 3));
        t.add(new person("Lena", "Petrova", 2));
        t.add(new person("Lida", "Tovina", 2));
        t.add(new person("Mila", "Pazina", 5));
        return t;
    }


}



