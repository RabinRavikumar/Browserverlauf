/**
 * Stellt ein Element der verketteten Liste dar.
 * Enthält eine Webseite sowie eine Referenz auf das nächste und vorherige Element.
 */
public class Element {

  private Object value;   
  private Element next;
  private Element previous;   

  public Element(Object pValue, Element pNext,Element pPrevious) {
    value = pValue;
    next = pNext;
    previous = pPrevious;
  }

  public Object getValue() {
    return value;
  }

  public Element getNext() {
    return next;
  }

  public void setValue(Object pValue) {
    value = pValue;
  }

  public void setNext(Element pNext) {
    next = pNext;
  }
  public void setPrevious(Element pPrevious){
    previous = pPrevious;
    }
  public Element getPrevious(){
    return previous;
    }
}
