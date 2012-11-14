package cmu.edu.jinguanz.crackingcode.chapter8;

public enum Suit {
  Clud (0), Diamond (1), Heart (2),Spade (3);
  private int value;
  private Suit(int value){
	  this.value=value;
  }
  public static Suit getSuitFromValue(int value){
	  Suit s = new Suit(value);
	  return s;
  }
  
}
