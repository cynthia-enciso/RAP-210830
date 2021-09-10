package items;

public class Tags{

public String ownerName;

public String falconName;

public Tag(){

}

public Tag(String ownerName){

    this.ownerName = ownerName;
}

public Tag(String ownerName, String falconName){

    this.ownerName = ownerName;
    this.falconName = falconName;
}

System.out.println("This is" + falconName + "belongs to " + ownerName);



}
