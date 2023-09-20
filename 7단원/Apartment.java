import java.util.ArrayList;

public class Apartment {
    public int getSize() {
        return size;
    }

    private int size;

    public Apartment(String address) {
        this.address = address;
    }

    private String address;

    public int getResidentsNum() {
        return residents.size();
    }

    private ArrayList<String> residents;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.residents = new ArrayList<>();
    }

    public void addResident(String name) {
        if (residents.size() < 10) {
            residents.add(name);
        }
    }

    public String getResidentName(int number) {
        if (number >= 0 && number < residents.size()) {
            return residents.get(number);
        } else {
            return null;
        }
    }

    public void removeResident(int number) {
        if (number >= 0 && number < residents.size()) {
            residents.remove(number);
            for (int i = number; i < residents.size(); i++) {
                residents.set(i, residents.get(i));
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apartment Information:\n");
        sb.append("Size: ").append(size).append(" square meters\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Residents:\n");
        for (int i = 0; i < residents.size(); i++) {
            sb.append(i + 1).append(": ").append(residents.get(i)).append("\n");
        }
        return sb.toString();

    }
}
