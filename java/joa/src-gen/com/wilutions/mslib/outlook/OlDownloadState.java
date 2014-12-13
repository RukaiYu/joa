/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDownloadState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlDownloadState implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlDownloadState olHeaderOnly = new OlDownloadState(0);
  public final static OlDownloadState olFullItem = new OlDownloadState(1);

  // Integer constants for bitsets and switch statements
  public final static int _olHeaderOnly = 0;
  public final static int _olFullItem = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlDownloadState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlDownloadState valueOf(int value) {
    switch(value) {
    case 0: return olHeaderOnly;
    case 1: return olFullItem;
    default: return new OlDownloadState(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olHeaderOnly";
    case 1: return "olFullItem";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olHeaderOnly");
      if ((value & 1) != 0) sbuf.append("|olFullItem");
      return sbuf.toString();
      }
    }
  }
}
