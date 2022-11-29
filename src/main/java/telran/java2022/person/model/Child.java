package telran.java2022.person.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Child extends Person implements Serializable {
    String kindergarten ;


    public Child(Integer id, String name, LocalDate birthDate, Address address, String kindergarden) {
        super(id, name, birthDate, address);
        this.kindergarten = kindergarden;
    }


}
