package recipes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Recipe {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    private LocalDateTime date = LocalDateTime.now();
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private String category;

    @ElementCollection
    @CollectionTable(name = "ingredients", joinColumns = @JoinColumn(name = "id"))
    @EqualsAndHashCode.Exclude
    @Size(min = 1)
    @NotNull
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private List<@NotBlank String> ingredients;

    @ElementCollection
    @CollectionTable(name = "directions", joinColumns = @JoinColumn(name = "id"))
    @EqualsAndHashCode.Exclude
    @Size(min = 1)
    @NotNull
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private List<@NotBlank String> directions;

    public Recipe(String name, String description, List<String> ingredients,
                  List<String> directions, String category) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.directions = directions;
        this.category = category;
    }
}
