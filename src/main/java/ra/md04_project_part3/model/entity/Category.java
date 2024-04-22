package ra.md04_project_part3.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String CategoryName;
    private boolean status;
    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Product> books;

}
