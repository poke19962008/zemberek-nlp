// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: preprocess.proto

package zemberek.proto;

public interface TokenizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zemberek.preprocessor.TokenizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string input = 1;</code>
   * @return The input.
   */
  java.lang.String getInput();
  /**
   * <code>string input = 1;</code>
   * @return The bytes for input.
   */
  com.google.protobuf.ByteString
      getInputBytes();

  /**
   * <code>bool includeTokenBoundaries = 2;</code>
   * @return The includeTokenBoundaries.
   */
  boolean getIncludeTokenBoundaries();

  /**
   * <pre>
   * TODO: Add options (ignore etc.)
   * </pre>
   *
   * <code>bool ignoreDoubleQuotes = 3;</code>
   * @return The ignoreDoubleQuotes.
   */
  boolean getIgnoreDoubleQuotes();
}
