package com.zs.mokito;

public class PersonService {

	private final PersonDao personDao;

	public PersonService(PersonDao personDao) {
		super();
		this.personDao = personDao;
	}
	public boolean update(Integer id,String name){
		Person person = personDao.fetchPerson(id);
		if (person!=null) {
			Person person2=new Person(person.getPersonID(), name);
			personDao.update(person2);
			return true;
		}
		return false;
		
	}
}
