package com.sevensevengsi.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(name = "storeManager")
public class StoreManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;

    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {

        return "StoreManager [id=" + id + ", fullName=" +
                fullName + ", status=" + status + "]";
    }
}
