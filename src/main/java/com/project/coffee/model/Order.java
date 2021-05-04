package com.project.coffee.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    @JoinColumn(name = "order_id")
    private Set<Item> items;

    @Column(name = "total")
    private Double total;

    @Column(name = "dateTime")
    private LocalDateTime dateTime;

    public Order(){
        total = 0.0;
        dateTime = LocalDateTime.now().plusHours(6);
    }

    //Getter
    public Long getId() {
        return id;
    }

    public Set<Item> getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    //Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
