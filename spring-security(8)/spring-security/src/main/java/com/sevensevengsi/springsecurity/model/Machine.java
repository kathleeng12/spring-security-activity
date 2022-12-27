package com.sevensevengsi.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(name = "machine")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @ManyToOne
    @JoinColumn(name = "machineStatus_id")
    private Machine machineStatus;

    private String machineDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Machine getMachineStatus() {
        return machineStatus;
    }

    public void setMachineStatus(Machine machineStatus) {
        this.machineStatus = machineStatus;
    }

    public String getMachineDescription() {
        return machineDescription;
    }

    public void setMachineDescription(String machineDescription) {
        this.machineDescription = machineDescription;
    }


    @Override
    public String toString() {

        return "Machine [id=" + id + ", store=" +
                store + ", machineStatus=" + machineStatus + " , " +
                "machineDescription=" + machineDescription + "]";
    }
}
