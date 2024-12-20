package code.doston.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;

    @Column(name = "category_id")
    private Long categoryId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", updatable = false, insertable = false)
    private Category category;


    private LocalDateTime createdDate;
}
