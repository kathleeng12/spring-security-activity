package com.sevensevengsi.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(name = "laundry_request")
public class LaundryRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "machine_id")
    private Machine machine;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "requestStatus_id")
    private RequestStatus requestStatus;

    private String date;

    private int amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {

        return "LaundryRequest [id=" + id + ", machine=" +
                machine + ", customer=" + customer + " , " +
                "requestStatus=" + requestStatus + ", " +
                "date=" + date + ", amount=" +
                amount + " ]";
    }
}
