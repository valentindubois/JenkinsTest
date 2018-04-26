package ch.hearc.ig;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsTest {

  @Test
  public void testJenkins() {

    Jenkins jenkins = new Jenkins();

    String actual = jenkins.testJenkins();
    String expected = "test Jenkins";

    assertEquals(expected, actual);

  }
}