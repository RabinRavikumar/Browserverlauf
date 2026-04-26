/**
 * Verwaltet den Browserverlauf.
 * Nutzt eine verkettete Liste, um besuchte Webseiten zu speichern
 * und die Navigation durch den Verlauf zu ermöglichen.
**/
public class Browserverlauf{
  private List verlauf;
  private List sitzungsverlauf;
  
  public Browserverlauf(){
    verlauf = new List();
    sitzungsverlauf = new List();
    }
  public void vorwaerts(){
    verlauf.next();
    }
  /*public void zurueck(){
    
    }*/
  public void neueWebsite(String adresse){
    verlauf.insert(new Website(adresse));
    verlauf.toLast(); 
    Website test = (Website) (verlauf.getObject());
    test.gibAus();
    }
  public void zeigerVerlauf(){
    verlauf.toFirst();
    Website test;
    while (verlauf.getObject() != null) { 
      test = (Website) (verlauf.getObject());
      test.gibAus();
      vorwaerts();
    } // end of while
    verlauf.toLast();
    }
  public void loescheEintrag(){ 
    if (verlauf.hasAccess()) {
      Website test = (Website) (verlauf.getObject());
      test.gibAus();
      verlauf.remove();
    } // end of if
    else {
      System.out.println("Es wurde keine Aktuelle Adresse gefunden.");
    } // end of if-else
    }
  public void weiterleiten(){
    if (verlauf.hasAccess()) {
      Website hinweisSeite = new Website("Webseite wird weitergeleitet!");
      verlauf.insert(hinweisSeite);
      hinweisSeite.gibAus();
    } // end of if
    else {
      System.out.println("Kein current!");
    } // end of if-else
    }
  public void fensterSchließen(){
    sitzungsverlauf.concat(verlauf);
    }
  }
