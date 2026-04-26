public class List{
  private Element first;
  private Element last;
  private Element current;
  
  public List(){
    first = null;
    last = null;
    current = null;
    }
  public boolean isEmpty(){
    return first == null;
    }
  public boolean hasAccess(){
    return current != null;
    }
  public void next(){
    if (!isEmpty() && hasAccess() && current != last) {
      current = current.getNext();
    } // end of if
    else {
      current = null;
    } // end of if-else
    }
  public void toFirst(){
    current = first;
    }
  public void toLast(){
    current =last;
    }
  public Object getObject(){
    if (hasAccess()) {
      return current.getValue();
    } // end of if
    else {
      return null;
    } // end of if-else
    }
  public void setObject(Object pObject){
    if (hasAccess() && pObject != null) {
      current.setValue(pObject);
    } // end of if
    }
  public void append(Object pObject){
    if (pObject != null) {
      Element neu = new Element(pObject,null,last);
      if (!isEmpty()) {
        last.setNext(neu);
      } // end of if
      else {
        first = neu;
      } // end of if-else
      last = neu;
      } // end of if
    }
  public void insert(Object pObject){
    if (pObject != null) {
      if (hasAccess()) {
        Element element = new Element(pObject,current,current.getPrevious());
        if (first == current) {
          current.setPrevious(element);
          first = element;
        } else {
          current.getPrevious().setNext(element);
          current.setPrevious(element);
        } // end of if-else
      } else {
        if (isEmpty()) {
          first = new Element(pObject,null,null);
          last = first;
        }  // end of if-else
      } // end of if-else                       
    }
    }
  public void concat(List pList){
    if (pList != null) {
      pList.toFirst();
      while (!pList.isEmpty()) { 
        append(pList.getObject());
        pList.remove();
      } // end of while
    } // end of if
    }
  public void remove(){
    if (!isEmpty() && hasAccess()) {
      if (last == first) {
        first = last = current = null;
      } // end of if
      else if (current == last) {
        current.getPrevious().setNext(null);
        last = current.getPrevious();
        current = null;
      } // end of if
      else if (current == first) {
        current.getNext().setPrevious(null);
        first = current.getNext();
        current = first;
      } // end of if
      else {
        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        next();
      } // end of if-else
    } // end of if
    }
  }