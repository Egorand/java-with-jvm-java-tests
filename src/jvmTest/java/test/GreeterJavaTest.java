package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterJavaTest {
  @Test public void testHi() {
    assertEquals("hi", new Greeter().sayHi());
  }
}
