package test

import kotlin.test.assertEquals
import org.junit.Test

class GreeterTest {
  @Test fun testHi() {
    assertEquals("hi", Greeter().sayHi())
  }    
}
