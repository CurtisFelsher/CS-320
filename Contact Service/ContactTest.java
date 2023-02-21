//Curtis Felsher
package Contact;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Test for Contact.java
public class ContactTest {
    //Creates the object with class identity for all methods to access
	Contact contact = new Contact("1111", "curtis", "felsher", "2285674445", "7204 King William Dr"); 

    @Test
    public void getContactID() {
        assertEquals("1111", contact.getContactID());
    }

    @Test
    public void getFirstName() {
        assertEquals("curtis", contact.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("felsher", contact.getLastName());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals("2285674445", contact.getPhoneNumber());
    }

    @Test
    public void getAddress() {
        assertEquals("7204 King William Dr", contact.getAddress());
    }

}