/**
 * Repräsentiert eine einzelne Webseite im Browserverlauf.
 * Enthält Informationen wie URL der Webseite.
**/
public class Website{
  private String adresse;
  
  public Website(String adresse){
    this.adresse = adresse;
    }
  public void gibAus(){
    System.out.println("Website: " + adresse);
    }
  }
