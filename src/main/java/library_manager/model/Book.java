package library_manager.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int quantity;
}
