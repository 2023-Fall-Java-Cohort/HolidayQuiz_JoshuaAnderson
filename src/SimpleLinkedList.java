import java.util.LinkedList;

public class SimpleLinkedList {
  LinkedList<Object> linkedList = new LinkedList<>();

  // insert parameter at the beginning of the list
  public void insertAtBeginning(Object data) {
    linkedList.addFirst(data);
  }

  // insert parameter at the end of the list
  public void insertAtEnd(Object data) {
    linkedList.add(data);
  }

  // use the parameter to find the node and delete it
  public void deleteNode(int key) {
    linkedList.remove(key);
  }

  // print the list
  public void printList() {
    for (Object listElement : linkedList) {
      System.out.println(listElement);
    }
  }
}

// I know we mentioned linked lists in class, but I believe we didn't go into
// nearly enough detail. This answer required an inordinate amount of research
// and I still don't fully understand it.