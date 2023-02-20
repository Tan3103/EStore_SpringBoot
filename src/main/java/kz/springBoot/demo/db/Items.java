package kz.springBoot.demo.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name = "items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

//    @Column(name = "name", length = 200)
    private String name;

//    @Column(name = "price")
    private int price;

//    @Column(name = "amount")
//    private int amount;
}
