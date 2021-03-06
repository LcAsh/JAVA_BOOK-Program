package BOOK_07;

public class Name implements Cloneable{
    private String first;
    private String last;

    public Name(){

    }//end default constructor

    public Name(String firstName, String lastName){
        first=firstName;
        last=lastName;
    }//end constructor

    public void setName(String firstName, String lastName){
        setFirst(firstName);
        setLast(lastName);
    }//end setName

    public String getName(){
        return toString();
    }//end getName

    public void setFirst(String firstNmae) {
        first = firstNmae;
    }
    public String getFirst(){
        return first;
    }//end getFirst

    public void setLast(String lastName){
        last = lastName;
    }//end getLast

    public String getLast() {
        return last;
    }//end getLast

    public void giveLastNameTO(Name aName){
        aName.setLast(last);
    }//end giveLastNameTo

    public String toString(){
        return first +""+last;
    }//end toString
}//end Name
