package org.reil.example;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class PersonFieldSetMapper implements FieldSetMapper<Person> {

	@Override
	public Person mapFieldSet(FieldSet fs) throws BindException {
		Person person = new Person();
		person.setFirstName(fs.readString(0));
		person.setLastName(fs.readString(1));
		person.setPhoneNumber(fs.readString(2));
		
		return person;
	}

}
