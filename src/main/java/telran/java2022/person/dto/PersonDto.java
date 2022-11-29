package telran.java2022.person.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
//import org.hibernate.annotations.Type;

import java.time.LocalDate;

@Getter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
			include = JsonTypeInfo.As.PROPERTY,
			property = "type")
@JsonSubTypes({
		@Type(name = "child", value = ChildDto.class),
		@Type(name = "employee", value = EmployeeDto.class),
		@Type(name = "person", value = PersonDto.class)
})

public class PersonDto {
	 Integer id;
	 String name;
	 LocalDate birthDate;
	 AddressDto address;
}
