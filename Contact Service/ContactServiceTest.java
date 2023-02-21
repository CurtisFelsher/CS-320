//Curtis Felsher
package Contact;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContactServiceTest {

//Test for adding, deleting, and updating contacts

//Tests adding contact
@Test
public void testAdd()
{
ContactService cs = new ContactService();
Contact test1 = new Contact("5836940", "Rick", "Dart", "2287654532", "Trackstar Rd");
assertEquals(true, cs.addContact(test1));
}

//Tests deleting contact
@Test
public void testDelete()
{
ContactService cs = new ContactService();

Contact test1 = new Contact("5836940", "Rick", "Dart", "2287654532", "Trackstar Rd");
Contact test2 = new Contact("1234567", "Ron", "Mouse", "2284447321", "Tire Dr");
Contact test3 = new Contact("1987654", "Art", "Stew", "2286684843", "1132 Hwy 90");

cs.addContact(test1);
cs.addContact(test2);
cs.addContact(test3);

assertEquals(true, cs.deleteContact("1234567"));
assertEquals(false, cs.deleteContact("1234568"));
assertEquals(false, cs.deleteContact("1234567"));
}

//Test for updating contact
@Test
public void testUpdate()
{
ContactService cs = new ContactService();

Contact test1 = new Contact("5836940", "Rick", "Dart", "2287654532", "Trackstar Rd");
Contact test2 = new Contact("1234567", "Ron", "Mouse", "2284447321", "Tire Dr");
Contact test3 = new Contact("1987654", "Art", "Stew", "2286684843", "1132 Hwy 90");

cs.addContact(test1);
cs.addContact(test2);
cs.addContact(test3);

assertEquals(true, cs.updateContact("1987654", "ArtFirst", "StewLast", "2286684843", "1132 Hwy 90"));
assertEquals(false, cs.updateContact("1987629", "ArtFirst", "StewLast", "2286684843", "1132 Hwy 90"));
}

}