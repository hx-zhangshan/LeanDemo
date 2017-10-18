package com.zs.mokito;

public interface PersonDao {

	public Person fetchPerson(Integer personID);
	public boolean update(Person person);
}
