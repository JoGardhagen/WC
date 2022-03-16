package com.gardhagen.joakim.wc.dataBaseClasses;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "addressName")
    private String adress;

    @Column(name = "houseNumber")
    private int houseNumber;

    @Column(name = "postalNumber")
    private int postalNumber;

    @Column(name = "district")
    private String district;

    public Address(int id, String adress, int houseNumber, int postalNumber, String district){
        this.id = id;
        this.adress = adress;
        this.houseNumber = houseNumber;
        this.postalNumber = postalNumber;
        this.district = district;
    }

    public Address() {

    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getAdress() {return adress;}
    public void setAdress(String adress) {this.adress = adress;}
    public int getHouseNumber() {return houseNumber;}
    public void setHouseNumber(int houseNumber) {this.houseNumber = houseNumber;}
    public int getPostalNumber() {return postalNumber;}
    public void setPostalNumber(int postalNumber) {this.postalNumber = postalNumber;}
    public String getDistrict() {return district;}
    public void setDistrict(String district) {this.district = district;}

}
