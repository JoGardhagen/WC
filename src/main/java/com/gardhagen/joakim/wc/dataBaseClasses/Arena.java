package com.gardhagen.joakim.wc.dataBaseClasses;

import javax.persistence.*;

@Entity
@Table(name = "Arena")
public class Arena {
    public Arena() {

    }


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "arenaName")
    private String arenaName;
    @Column(name = "adress")
    private String adress;
    @Column(name = "enviroment_IndoorOutDoor")
    boolean enviorment_IndoorOutDoor;

    public Arena(int id, String arenaName, String adress, boolean enviorment_IndoorOutDoor) {
        this.id = id;
        this.arenaName = arenaName;
        this.adress = adress;
        this.enviorment_IndoorOutDoor = enviorment_IndoorOutDoor;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getArenaName() {return arenaName;}
    public void setArenaName(String arenaName) {this.arenaName = arenaName;}
    public String getAdress() {return adress;}
    public void setAdress(String adress) {this.adress = adress;}
    public boolean isEnviorment_IndoorOutDoor() {return enviorment_IndoorOutDoor;}
    public void setEnviorment_IndoorOutDoor(boolean enviorment_IndoorOutDoor) {this.enviorment_IndoorOutDoor = enviorment_IndoorOutDoor;}

}
