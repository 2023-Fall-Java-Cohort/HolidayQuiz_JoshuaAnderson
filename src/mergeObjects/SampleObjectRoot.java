package mergeObjects;

public class SampleObjectRoot {
    private String name;
    private int number;
    private boolean isTrue;
    private String[] stringArray;

    public SampleObjectRoot() {
    }

    public SampleObjectRoot(String name, int number, boolean isTrue, String[] stringArray) {
      this.name = name;
      this.number = number;
      this.isTrue = isTrue;
      this.stringArray = stringArray;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setNumber(int number) {
      this.number = number;
    }

    public void setTrue(boolean isTrue) {
      this.isTrue = isTrue;
    }

    public void setStringArray(String[] stringArray) {
      this.stringArray = stringArray;
    }

    public String getName() {
      return name;
    }

    public int getNumber() {
      return number;
    }

    public boolean isTrue() {
      return isTrue;
    }

    public String[] getStringArray() {
      return stringArray;
    }

  }
