package com.nedonosko.playground.collections;

public class TestObject {

  private final String id;

  public TestObject(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object obj) {
    return this == obj
        || (this.getClass().isInstance(obj) && this.getClass().cast(obj).getId().equals(id));
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 31 * hash + (id == null ? 0 : id.hashCode());
    return hash;
  }

  @Override
  public String toString() {
    return new StringBuilder(getClass().getSimpleName()).append("{").append(id != null ? id : "null").append("}")
        .toString();
  }

}
