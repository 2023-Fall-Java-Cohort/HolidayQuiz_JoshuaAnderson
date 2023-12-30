package mergeObjects;

import mergeObjects.SampleObjectA;
import mergeObjects.SampleObjectB;
import mergeObjects.SampleObjectRoot;

public class MergeObjects {
  public SampleObjectRoot mergeObjects(SampleObjectRoot object1, SampleObjectRoot object2)
      throws IllegalArgumentException {
    SampleObjectRoot mergedObject = new SampleObjectRoot(object1.getName(), object1.getNumber(), object1.isTrue(),
        object1.getStringArray());
    if (object1 instanceof SampleObjectA && ((SampleObjectA) object1).getAExtendedProperty() != null
        && object2 instanceof SampleObjectB && ((SampleObjectB) object2).getBExtendedProperty() != null
        || object2 instanceof SampleObjectA && ((SampleObjectA) object2).getAExtendedProperty() != null
            && object1 instanceof SampleObjectB && ((SampleObjectB) object1).getBExtendedProperty() != null) {
      throw new IllegalArgumentException("Cannot merge these objects without data loss.");
    } else if (object1 instanceof SampleObjectA && (!(object2 instanceof SampleObjectB)
        || ((SampleObjectB) object2).getBExtendedProperty() == null)) {
      mergedObject = (SampleObjectA) object1;
      if (object2.getName() != null) {
        mergedObject.setName(object2.getName());
      }
      if (object2.getNumber() != 0) {
        mergedObject.setNumber(object2.getNumber());
      }
      if (object2.isTrue() != mergedObject.isTrue()) {
        mergedObject.setTrue(object2.isTrue());
      }
      if (object2.getStringArray() != null) {
        mergedObject.setStringArray(object2.getStringArray());
      }
      ((SampleObjectA) mergedObject).setAExtendedProperty(((SampleObjectA) object1).getAExtendedProperty());
    } else if (object2 instanceof SampleObjectA && (!(object1 instanceof SampleObjectB)
        || ((SampleObjectB) object1).getBExtendedProperty() == null)) {
      mergedObject = (SampleObjectA) object1;
      if (object2.getName() != null) {
        mergedObject.setName(object2.getName());
      }
      if (object2.getNumber() != 0) {
        mergedObject.setNumber(object2.getNumber());
      }
      if (object2.isTrue() != mergedObject.isTrue()) {
        mergedObject.setTrue(object2.isTrue());
      }
      if (object2.getStringArray() != null) {
        mergedObject.setStringArray(object2.getStringArray());
      }
      if (((SampleObjectA) object2).getAExtendedProperty() != null) {
        ((SampleObjectA) mergedObject).setAExtendedProperty(((SampleObjectA) object2).getAExtendedProperty());
      }
      ((SampleObjectA) mergedObject).setAExtendedProperty(((SampleObjectA) object2).getAExtendedProperty());
      ((SampleObjectA) mergedObject).setAExtendedProperty(((SampleObjectA) object2).getAExtendedProperty());
    } else if (object1 instanceof SampleObjectB && (!(object2 instanceof SampleObjectA)
        || ((SampleObjectA) object2).getAExtendedProperty() == null)) {
      mergedObject = (SampleObjectB) object1;
      if (object2.getName() != null) {
        mergedObject.setName(object2.getName());
      }
      if (object2.getNumber() != 0) {
        mergedObject.setNumber(object2.getNumber());
      }
      if (object2.isTrue() != mergedObject.isTrue()) {
        mergedObject.setTrue(object2.isTrue());
      }
      if (object2.getStringArray() != null) {
        mergedObject.setStringArray(object2.getStringArray());
      }
      ((SampleObjectB) mergedObject).setBExtendedProperty(((SampleObjectB) object1).getBExtendedProperty());
    } else if (object2 instanceof SampleObjectB && (!(object1 instanceof SampleObjectA)
        || ((SampleObjectA) object1).getAExtendedProperty() == null)) {
      mergedObject = (SampleObjectB) object1;
      if (object2.getName() != null) {
        mergedObject.setName(object2.getName());
      }
      if (object2.getNumber() != 0) {
        mergedObject.setNumber(object2.getNumber());
      }
      if (object2.isTrue() != mergedObject.isTrue()) {
        mergedObject.setTrue(object2.isTrue());
      }
      if (object2.getStringArray() != null) {
        mergedObject.setStringArray(object2.getStringArray());
      }
      if (((SampleObjectB) object2).getBExtendedProperty() != null) {
        ((SampleObjectB) mergedObject).setBExtendedProperty(((SampleObjectB) object2).getBExtendedProperty());
      }
      ((SampleObjectB) mergedObject).setBExtendedProperty(((SampleObjectB) object2).getBExtendedProperty());
    } else {
      mergedObject = object1;
      if (object2.getName() != null) {
        mergedObject.setName(object2.getName());
      }
      if (object2.getNumber() != 0) {
        mergedObject.setNumber(object2.getNumber());
      }
      if (object2.isTrue() != mergedObject.isTrue()) {
        mergedObject.setTrue(object2.isTrue());
      }
      if (object2.getStringArray() != null) {
        mergedObject.setStringArray(object2.getStringArray());
      }
    }
    return mergedObject;
  }

  // public Object mergeObjects(Object object1, Object object2) {
  // Object mergedObject = new Object();
  // // I need a way to query the object for its properties and/or methods and use
  // // that to merge the values with setters?
  // return mergedObject;
  // }

}

// We definitely did not cover this in class, and I feel like the request is way
// out of scope for the class. I'm not sure how to do this, and I'm not sure how
// to learn how to do this. Everything I find online is way more complicated
// than what we've done in class. Merging two defined objects would be plausible
// at our skill level (as above), but creating an abstract way to merge objects without
// knowing what we are merging seems an unreasonable ask given our current skill level...