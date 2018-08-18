package miguel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter@Setter
public class Mascota {

    @Id@GeneratedValue
    private long id;


    @NotEmpty
    private String nombre;

    private Raza raza;

}
