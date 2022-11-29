package telran.java2022.person.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "persons")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person {
	@Id
	Integer id;
	@Setter
	String name;
	LocalDate birthDate;
	@Setter
//	@Embedded
	Address address;

}
