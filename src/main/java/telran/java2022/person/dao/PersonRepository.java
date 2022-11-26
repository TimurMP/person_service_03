package telran.java2022.person.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import telran.java2022.person.dto.CityPopulationDto;
import telran.java2022.person.model.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	Stream<Person> findByName(String name);

	Stream<Person> findByAddressCity(String city);

	Stream<Person> findByBirthDateBetween(LocalDate from, LocalDate to);


	@Query("select new telran.java2022.person.dto.CityPopulationDto(p.address.city, count (p)) from Person p group by p.address.city order by count (p) desc")
	List<CityPopulationDto> getCitiesPopulation();

}
