package code.doston.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_id")
    private Long categoryId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", updatable = false, insertable = false)
    private Category category;

    @Column(name = "product_id")
    private Long productId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", updatable = false, insertable = false)
    private Product product;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

}
