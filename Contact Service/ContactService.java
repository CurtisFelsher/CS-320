//Curtis Felsher
package Contact;

import java.util.ArrayList;

public class ContactService {

//Contains Contact List
private ArrayList<Contact> contacts;

public ContactService()
{
//Calls Array List
contacts = new ArrayList<>();
}

//Add for contacts
public boolean addContact(Contact contact){
boolean contactExists= false;
//Checks all contacts within the list
for (Contact contactList:contacts)
{
//Checks for existing contact
if (contactList.equals(contact))
{
contactExists = true;
}
}
//Adds contact if it does not already exist
if (!contactExists)
{
contacts.add(contact);
return true;
}
else
{
return false;
}
}

//Delete for contacts
public boolean deleteContact(String contactID)
{
//Checks all contacts within the list
for (Contact contactList:contacts)
{
//If contactID matches, delete contact
if (contactList.getContactID().equals(contactID))
{
//Removes contact and returns as true
contacts.remove(contactList);
return true;
}
}
//Else return false
return false;
}

//For updating contact
public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address)
{
//Initiates loop
for (Contact contactList:contacts)
{
//Checks for contact matches and returns if true
if (contactList.getContactID().equals(contactID))
{
if(!firstName.equals("") && !(firstName.length()>10))
{
contactList.setFirstName(firstName);
}
if(!lastName.equals("") && !(lastName.length()>10))
{
contactList.setFirstName(lastName);
}
if(!phoneNumber.equals("") && (phoneNumber.length()==10))
{
contactList.setFirstName(phoneNumber);
}
if(!address.equals("") && !(address.length()>30))
{
contactList.setFirstName(address);
}
return true;
}
}
//Else returns false
return false;
}
}