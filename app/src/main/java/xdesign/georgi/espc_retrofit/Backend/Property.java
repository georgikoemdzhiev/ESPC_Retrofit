package xdesign.georgi.espc_retrofit.Backend;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by georgi on 14/06/16.
 */
public class Property implements Serializable{

    private int id;
    private int userID;
    private String address;
    private String price;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }
}
