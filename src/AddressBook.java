import java.util.*;
public class AddressBook {

static Scanner inp = new Scanner(System.in);

static void showMenu(){

System.out.println("\n\t1. Add a Person\n\t2. Edit a person\n\t3. Delete a Person\n\t4. View a Person\n\t5. View Complete Address Book\n\t6. View sorted by Zip\n\t7. View sorted by Name\n\t8. Exit\n\n");
}

static Person searchPerson(ArrayList<Person> adrsbook)
{

System.out.println("Enter phoneNumber of the person to whom you want to view\t");
long number=Long.parseLong(inp.nextLine());

for(Person person : adrsbook)
{
if(person.getPhoneNumber()==number)
return person;
}

return null;
}

static int getChoice(){
System.out.println("Enter a choice \t");
int choice=Integer.parseInt(inp.nextLine());
return choice;
}

static Person AddPerson()
{
String name,address,state,city;
int zipCode;
long phoneNumber;

System.out.println("Enter Name:\t");
name=inp.nextLine();

System.out.println("Enter Phone Number:\t");
phoneNumber=Long.parseLong(inp.nextLine());

System.out.println("Enter Address:\t");
address=inp.nextLine();

System.out.println("Enter City:\t");
city=inp.nextLine();

System.out.println("Enter State:\t");
state=inp.nextLine();

System.out.println("Enter ZipCode:\t");
zipCode=Integer.parseInt(inp.nextLine());

return new Person(name,phoneNumber,address,city,state,zipCode);
}

static void editPerson(ArrayList<Person> adrsbook)
{
String name,address,state,city;
int zipCode;
long phoneNumber;

Person person = searchPerson(adrsbook);
if(person!=null)
{
System.out.println("Enter Name:\t");
name=inp.nextLine();

System.out.println("Enter Phone Number:\t");
phoneNumber=Long.parseLong(inp.nextLine());

System.out.println("Enter Address:\t");
address=inp.nextLine();

System.out.println("Enter City:\t");
city=inp.nextLine();

System.out.println("Enter State:\t");
state=inp.nextLine();

System.out.println("Enter ZipCode:\t");
zipCode=Integer.parseInt(inp.nextLine());

person.setName(name);
person.setPhoneNumber(phoneNumber);
person.setAddress(address);
person.setCity(city);
person.setState(state);
person.setZipCode(zipCode);

System.out.println("\n\t---------Edited Successfully---------\n");
}
else
System.out.println("\n\t---------No such entry exist---------\n");

}

static void deletePerson(ArrayList<Person> adrsbook)
{
boolean flag=false;
System.out.println("Enter phoneNumber of the person to whom you want to delete\t");
long number=Long.parseLong(inp.nextLine());
Iterator itr = adrsbook.iterator();
while (itr.hasNext())
{
Person obj = (Person)itr.next();
if (obj.getPhoneNumber() == number)
{
itr.remove();
flag=true;
break;
}
}
if(flag)
System.out.println("\n\t---------Deleted Successfully---------\n");
else
System.out.println("\n\t---------No such entry exist---------\n");
}
static void viewPerson(ArrayList<Person> adrsbook)
{
Person searched = searchPerson(adrsbook);
if(searched!=null)
System.out.println(searched);
else
System.out.println("\n\t---------No such entry exist---------\n");

}
static void viewAll(ArrayList<Person> adrsbook)
{
if(adrsbook.size()==0)
{
System.out.println("\n\t---------Empty address book---------");
return ;
}
for(Person person : adrsbook)
{
System.out.println("\n"+person+"\n");
}
}

public static void main(String[] args) {



ArrayList<Person> addressBook = new ArrayList<>();

while(true){

System.out.println("\n\n\t==========================================");
System.out.println("\t\tWelcome to Address Book");
System.out.println("\t==========================================\n");
showMenu();
int choice=getChoice();

switch(choice){
case 1: addressBook.add(AddPerson());
break;
case 2: editPerson(addressBook);
break;
case 3: deletePerson(addressBook);
break;
case 4: viewPerson(addressBook);
break;
case 5: viewAll(addressBook);
break;
case 6: Collections.sort(addressBook, Person.personzipCode);
viewAll(addressBook);
break;
case 7: Collections.sort(addressBook, Person.personName);
viewAll(addressBook);
break;
case 8: System.exit(0);
break;
default: System.out.println("Invalid Choice!!");
break;

}
}

}
}