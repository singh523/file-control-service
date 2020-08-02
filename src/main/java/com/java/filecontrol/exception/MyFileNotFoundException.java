package com.java.filecontrol.exception;

import java.net.MalformedURLException;

public class MyFileNotFoundException extends RuntimeException {

  public MyFileNotFoundException(String s, MalformedURLException ex) {
    super(s, ex);

  }

  public MyFileNotFoundException(String message) {
    super(message);
  }
}
