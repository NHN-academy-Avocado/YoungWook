import java.util.ArrayList;

public class Apartment {
    public int getSize() {
        return size;
    }

    private int size;
    private ArrayList<String> residents; //Array list 생성 없이 만들어보기
    private String address;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.residents = new ArrayList<>();
    }

    public Apartment(String address) {
        this.address = address;
    }

    public int getResidentsNum() {
        return residents.size();
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
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apartment Info:\n");
        sb.append("Size: ").append(size).append(" \n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Residents:\n");
        for (int i = 0; i < residents.size(); i++) {
            sb.append(i + 1).append(": ").append(residents.get(i)).append("\n");
        }
        return sb.toString();

    }
}
