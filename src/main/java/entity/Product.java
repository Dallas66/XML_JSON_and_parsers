package entity;

import adapter.LocalDateXmlAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    @XmlAttribute(name = "id")
    private int id;
    @XmlElement
    private String manufacturer;
    @XmlElement
    private String model;
    @XmlJavaTypeAdapter(value = LocalDateXmlAdapter.class)
    private LocalDate date;
    @XmlElement
    private String color;
    @XmlElement
    private double price;
    @XmlElement
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "entity.Product{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", date='" + date + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
