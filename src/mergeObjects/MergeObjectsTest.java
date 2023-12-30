package mergeObjects;

import mergeObjects.SampleObjectA;
import mergeObjects.SampleObjectB;
import mergeObjects.SampleObjectRoot;

public class MergeObjectsTest {
  private SampleObjectA sampleObjectA1 = new SampleObjectA();
  private SampleObjectB sampleObjectB1 = new SampleObjectB();
  private SampleObjectA sampleObjectA2 = new SampleObjectA();
  private SampleObjectB sampleObjectB2 = new SampleObjectB();
  private MergeObjects mergeObjects = new MergeObjects();

  public static void main(String[] args) {
    MergeObjectsTest mergeObjectsTest = new MergeObjectsTest();
    mergeObjectsTest.testMergeObjects_sameType_typeRoot();
    mergeObjectsTest.testMergeObjects_sameType_typeA();
    mergeObjectsTest.testMergeObjects_sameType_typeB();
    mergeObjectsTest.testMergeObjects_differentType_noNulls();
    mergeObjectsTest.testMergeObjects_differentType_aNull();
    mergeObjectsTest.testMergeObjects_differentType_bNull();
  }


  public void populateSampleObjectA1() {
    sampleObjectA1.setName("name1");
    sampleObjectA1.setNumber(1);
    sampleObjectA1.setTrue(true);
    sampleObjectA1.setStringArray(new String[] { "string1", "string2" });
    sampleObjectA1.setAExtendedProperty("aExtendedProperty1");
  }

  public void populateSampleObjectB1() {
    sampleObjectB1.setName("name1");
    sampleObjectB1.setNumber(1);
    sampleObjectB1.setTrue(true);
    sampleObjectB1.setStringArray(new String[] { "string1", "string2" });
    sampleObjectB1.setBExtendedProperty("bExtendedProperty1");
  }

  public void populateSampleObjectA2() {
    sampleObjectA2.setName("name2");
    sampleObjectA2.setNumber(2);
    sampleObjectA2.setTrue(false);
    sampleObjectA2.setStringArray(new String[] { "string3", "string4" });
    sampleObjectA2.setAExtendedProperty("aExtendedProperty2");
  }

  public void populateSampleObjectB2() {
    sampleObjectB2.setName("name2");
    sampleObjectB2.setNumber(2);
    sampleObjectB2.setTrue(false);
    sampleObjectB2.setStringArray(new String[] { "string3", "string4" });
    sampleObjectB2.setBExtendedProperty("bExtendedProperty2");
  }

  public void testMergeObjects_sameType_typeRoot() {
    populateSampleObjectA1();
    populateSampleObjectA2();
    sampleObjectA2.setNumber(22);
    final SampleObjectRoot results = mergeObjects.mergeObjects((SampleObjectRoot) sampleObjectA1,
        (SampleObjectRoot) sampleObjectA2);
    System.out.println("Test: is instance of A: Expected: True, Actual: " + (results instanceof SampleObjectA));
    System.out.println("Test: is instance of B: Expected: False, Actual: " + (results instanceof SampleObjectB));
    System.out.println("Test: name: Expected: name2, Actual: " + results.getName());
    System.out.println("Test: number: Expected: 22, Actual: " + results.getNumber());
    System.out.println("Test: isTrue: Expected: false, Actual: " + results.isTrue());
    System.out.println("Test: stringArray: Expected: string3, string4, Actual: "
        + String.join(", ", results.getStringArray()));
    System.out.println("Test: aExtendedProperty: Expected: " + sampleObjectA2.getAExtendedProperty() + ", Actual: "
        + ((SampleObjectA) results).getAExtendedProperty());
  }

  public void testMergeObjects_sameType_typeA() {
    populateSampleObjectA1();
    populateSampleObjectA2();
    sampleObjectA2.setNumber(22);
    final SampleObjectRoot results = mergeObjects.mergeObjects(sampleObjectA1, sampleObjectA2);
    System.out.println("Test: is instance of A: Expected: True, Actual: " + (results instanceof SampleObjectA));
    System.out.println("Test: is instance of B: Expected: False, Actual: " + (results instanceof SampleObjectB));
    System.out.println("Test: name: Expected: name2, Actual: " + results.getName());
    System.out.println("Test: number: Expected: 22, Actual: " + results.getNumber());
    System.out.println("Test: isTrue: Expected: false, Actual: " + results.isTrue());
    System.out.println("Test: stringArray: Expected: string3, string4, Actual: "
        + String.join(", ", results.getStringArray()));
    System.out.println("Test: aExtendedProperty: Expected: " + sampleObjectA2.getAExtendedProperty() + ", Actual: "
        + ((SampleObjectA) results).getAExtendedProperty());
  }

  public void testMergeObjects_sameType_typeB() {
    populateSampleObjectB1();
    populateSampleObjectB2();
    sampleObjectB2.setNumber(22);
    final SampleObjectRoot results = mergeObjects.mergeObjects(sampleObjectB1, sampleObjectB2);
    System.out.println("Test: is instance of A: Expected: False, Actual: " + (results instanceof SampleObjectA));
    System.out.println("Test: is instance of B: Expected: True, Actual: " + (results instanceof SampleObjectB));
    System.out.println("Test: name: Expected: name2, Actual: " + results.getName());
    System.out.println("Test: number: Expected: 22, Actual: " + results.getNumber());
    System.out.println("Test: isTrue: Expected: false, Actual: " + results.isTrue());
    System.out.println("Test: stringArray: Expected: string3, string4, Actual: "
        + String.join(", ", results.getStringArray()));
    System.out.println("Test: bExtendedProperty: Expected: " + sampleObjectB2.getBExtendedProperty() + ", Actual: "
        + ((SampleObjectB) results).getBExtendedProperty());
  }

  public void testMergeObjects_differentType_noNulls() {
    String results = "";
    try {
      populateSampleObjectA1();
      populateSampleObjectB1();
      mergeObjects.mergeObjects(sampleObjectA1, sampleObjectB2);
    } catch (Exception e) {
      results = e.getMessage();
    }
    System.out.println("Test: Expected: Cannot merge these objects without data loss, Actual: " + results);
  }

  public void testMergeObjects_differentType_aNull() {
    populateSampleObjectA1();
    populateSampleObjectB1();
    sampleObjectA1.setAExtendedProperty(null);
    ;
    final SampleObjectRoot results = mergeObjects.mergeObjects(sampleObjectB1, sampleObjectB2);
    System.out.println("Test: is instance of A: Expected: False, Actual: " + (results instanceof SampleObjectA));
    System.out.println("Test: is instance of B: Expected: True, Actual: " + (results instanceof SampleObjectB));
    System.out.println("Test: name: Expected: name2, Actual: " + results.getName());
    System.out.println("Test: number: Expected: 22, Actual: " + results.getNumber());
    System.out.println("Test: isTrue: Expected: false, Actual: " + results.isTrue());
    System.out.println("Test: stringArray: Expected: string3, string4, Actual: "
        + String.join(", ", results.getStringArray()));
    System.out.println("Test: bExtendedProperty: Expected: " + sampleObjectB1.getBExtendedProperty() + ", Actual: "
        + ((SampleObjectB) results).getBExtendedProperty());
  }

  public void testMergeObjects_differentType_bNull() {
    populateSampleObjectA1();
    populateSampleObjectB2();
    sampleObjectB1.setBExtendedProperty(null);
    ;
    final SampleObjectRoot results = mergeObjects.mergeObjects(sampleObjectB1, sampleObjectB2);
    System.out.println("Test: is instance of A: Expected: False, Actual: " + (results instanceof SampleObjectA));
    System.out.println("Test: is instance of B: Expected: True, Actual: " + (results instanceof SampleObjectB));
    System.out.println("Test: name: Expected: name2, Actual: " + results.getName());
    System.out.println("Test: number: Expected: 2, Actual: " + results.getNumber());
    System.out.println("Test: isTrue: Expected: false, Actual: " + results.isTrue());
    System.out.println("Test: stringArray: Expected: string3, string4, Actual: "
        + String.join(", ", results.getStringArray()));
    System.out.println("Test: aExtendedProperty: Expected: " + sampleObjectA1.getAExtendedProperty() + ", Actual: "
        + ((SampleObjectA) results).getAExtendedProperty());
  }

}