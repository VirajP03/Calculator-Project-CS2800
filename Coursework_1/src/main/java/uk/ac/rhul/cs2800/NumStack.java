package uk.ac.rhul.cs2800;

public class NumStack {

  private Stack numStack = new Stack();

  public void push(float f) {
    Entry numEntry = new Entry(f);
    numStack.push(numEntry);
  }
  

}
