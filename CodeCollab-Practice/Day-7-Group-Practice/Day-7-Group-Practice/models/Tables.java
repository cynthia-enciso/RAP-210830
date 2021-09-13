
package models;

// class needs to be lowercase
public class Tables{       

        // needs semi-colon
        private String setting = "Kitchen";
        public float width;


public Tables(){

}

// needs return type, getters don't need parameters
public String getSetting()
{
   return this.setting;

}

// needs return type (should be void)
public void setSetting(String setting){

this.setting = setting;

System.out.println("This is a " + setting "Table");
}





    

}