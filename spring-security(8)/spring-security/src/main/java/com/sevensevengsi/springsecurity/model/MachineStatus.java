package com.sevensevengsi.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(name = "machine_status")
public class MachineStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String machineDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachineDescription() {
        return machineDescription;
    }

    public void setMachineDescription(String machineDescription) {
        this.machineDescription = machineDescription;
    }

    @Override
    public String toString() {

        return "MachineStatus [id=" + id + ", machineDescription=" +
                machineDescription + "]";
    }
}
