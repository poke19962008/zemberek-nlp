// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language_id.proto

package zemberek.proto;

public interface LanguageIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zemberek.langid.LanguageIdRequest)
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
   * <code>int32 maxSampleCount = 2;</code>
   * @return The maxSampleCount.
   */
  int getMaxSampleCount();

  /**
   * <code>bool trGroup = 3;</code>
   * @return The trGroup.
   */
  boolean getTrGroup();

  /**
   * <code>bool includeScores = 4;</code>
   * @return The includeScores.
   */
  boolean getIncludeScores();
}