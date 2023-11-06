package org.launchcode.liftoffgroupproject.models;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image extends AbstractEntity{

    private String name;
    private String type;
    @Column(length = 50000000)
    private byte[] picByte;

    public Image() {};

    public Image(String name, String type, byte[] picByte) {
        this.name = name;
        this.type = type;
        this.picByte = picByte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getPicByte() {
        return picByte;
    }

    public void setPicByte(byte[] picByte) {
        this.picByte = picByte;
    }
}
