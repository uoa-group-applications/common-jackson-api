package nz.ac.auckland.util;

/**
 * Helper Utility class for Jackson that allows both old and new implementations. This is an awful name but we couldn't
 * this of a better one.
 *
 * This exists because Grails applications which use some of this infrastructure and Modern Applications both need
 * Jackson capability.
 */
public interface JacksonHelperApi {


  /**
   * Serialises a provided Object to JSON.
   *
   * @param dataToSerialize The Object to serialise.
   * @return The provided Object structure as a JSON String.
   * @throws JacksonException
   */
  public String jsonSerialize(Object dataToSerialize) throws JacksonException;

  /**
   * Constructs an Object from JSON String data.
   *
   * @param text The JSON String to parse.
   * @param type The Class of the Object to construct.
   * @param <T>  The type of Object to construct.
   * @return The constructed Object if the JSON String input parses correctly.
   * @throws JacksonException
   */
  public <T> T jsonDeserialize(String text, Class<T> type) throws JacksonException;
}
