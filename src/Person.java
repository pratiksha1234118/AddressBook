


import java.util.*;

class Person {

private String name,address,state,city;
private int zipCode;
private long phoneNumber;

Person(String name,long phoneNumber, String address
, String city, String state, int zipCode ){

this.name=name;
this.phoneNumber=phoneNumber;
this.address=address;
this.city=city;
this.state=state;
this.zipCode=zipCode;
}

public static Comparator<Person> personzipCode = new Comparator<Person>()
{
public int compare(Person person1, Person person2)
{
  return person1.getZipCode()-person2.getZipCode();
}
};

public static Comparator<Person> personName = new Comparator<Person>()
{
public int compare(Person person1, Person person2)
{
  return person1.getName().toUpperCase().compareTo(person2.getName().toUpperCase());
}
};

public void setName(String name){
this.name=name;
}
public void setAddress(String address){
this.address=address;
}
public void setState(String state){
this.state=state;
}
public void setCity(String city){
this.city=city;
}
public void setPhoneNumber(long phoneNumber){
this.phoneNumber=phoneNumber;
}
public void setZipCode(int zipCode){
this.zipCode=zipCode;
}
public int getZipCode(){
return zipCode;
}
public long getPhoneNumber(){
return phoneNumber;
}
public String getName(){
return name;
}
public String getState(){
return state;
}
public String getCity(){
return city;
}
public String getAddress(){
return address;
}
public String toString()
{
return "\t\tName: "+name+"\n\t\tAddress: "+address+"\n\t\tCity: "+city+"\n\t\tState: "+state+"\n\t\tZipCode: "+zipCode+"\n\t\tMobile No: "+phoneNumber ;
}

}


