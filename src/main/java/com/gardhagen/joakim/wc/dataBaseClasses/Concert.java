package com.gardhagen.joakim.wc.dataBaseClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Concert")
public class Concert {


    @Id
    @Column(name = "Ticket_Id")
    private int ticketId;
    @Column(name = "preformer")
    private String preformer;
    @Column(name = "preformDate")
    private Date prefromDate;
    @Column(name = "ticketPrice")
    private float ticketprice;
    @Column(name = "arenaName")
    private String arenaName;

    public Concert(int ticketId, String preformer, Date prefromDate, float ticketprice, String arenaName) {
        this.ticketId = ticketId;
        this.preformer = preformer;
        this.prefromDate = prefromDate;
        this.ticketprice = ticketprice;
        this.arenaName = arenaName;
    }

    public Concert() {

    }

    public int getTicketId() {return ticketId;}
    public void setTicketId(int ticketId) {this.ticketId = ticketId;}
    public String getPreformer() {return preformer;}
    public void setPreformer(String preformer) {this.preformer = preformer;}
    public Date getPrefromDate() {return prefromDate;}
    public void setPrefromDate(Date prefromDate) {this.prefromDate = prefromDate;}
    public float getTicketprice() {return ticketprice;}
    public void setTicketprice(float ticketprice) {this.ticketprice = ticketprice;}
    public String getArenaName() {return arenaName;}
    public void setArenaName(String arenaName) {this.arenaName = arenaName;}

}
