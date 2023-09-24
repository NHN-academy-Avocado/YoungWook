package Course8.Exersize.Ex8;

import java.util.Arrays;

public class Apartment {
    public int getSize() {
        return size;
    }

    private int size;

    public String getAddress() {
        return address;
    }

    private String address;

    private String[] resident;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.resident = new String[size];
    }

    public Apartment(String address) {
        this.address = address;
    }


    public void addResident(String name) {
        for (String s : resident) {
            if (s == null && s != name) {
                int a = Arrays.asList(resident).indexOf(s);
                resident[a] = name;
                break;
            }
        }
    }

    public String getResidentName(int number) {

    }

    public void removeResident(int number) {


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apartment Info:\n");
        sb.append("Size: ").append(size).append(" \n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Residents:\n");
        for (String s : resident) {
            if (s != null) {
                sb.append((int) Arrays.asList(resident).indexOf(s) + 1 + "\t" + s + "\n");
            }
        }


        return sb.toString();

    }
}
