package com.sevensevengsi.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;


    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "storeManager_id")
    private StoreManager storeManager;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public StoreManager getStoreManager() {
        return storeManager;
    }

    public void setStoreManager(StoreManager storeManager) {
        this.storeManager = storeManager;
    }

    public Store(int id, String name, Owner owner, StoreManager storeManager){
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.storeManager = storeManager;
    }
    @Override
    public String toString() {

        return "Store [id=" + id + ", name=" +
                name + ", owner=" + owner + " , " +
                "storeManager=" + storeManager + "]";
    }
}
