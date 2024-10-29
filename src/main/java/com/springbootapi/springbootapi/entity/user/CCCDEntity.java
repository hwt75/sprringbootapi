package com.springbootapi.springbootapi.entity.user;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "cccd_001")
@Data
public class CCCDEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numberCCCD;


}
