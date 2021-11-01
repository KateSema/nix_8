package ua.com.alevel.entity;

import java.util.Objects;

// entity класс, описывает объявления на условном сайте по аренде квартир
public class AdtFlat {

    private String id;
    private String name;
    private String city;
    private int room;
    private int price;

    public int getRoom() {
        return room;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdtFlat)) return false;
        AdtFlat adtFlat = (AdtFlat) o;
        return room == adtFlat.room && Objects.equals(id, adtFlat.id) && Objects.equals(name, adtFlat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, room);
    }


    @Override
    public String toString() {
        return "AdtFlat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", room=" + room +
                ", price=" + price +
                '}';
    }

}
