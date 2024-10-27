// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: morphology.proto

package zemberek.proto.morphology;

public interface SentenceAnalysisProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zemberek.morphology.SentenceAnalysisProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * input sentence
   * </pre>
   *
   * <code>string input = 1;</code>
   * @return The input.
   */
  java.lang.String getInput();
  /**
   * <pre>
   * input sentence
   * </pre>
   *
   * <code>string input = 1;</code>
   * @return The bytes for input.
   */
  com.google.protobuf.ByteString
      getInputBytes();

  /**
   * <pre>
   * for each token, result best morphological analysis and if requested, all
   * analyses.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.SentenceWordAnalysisProto results = 2;</code>
   */
  java.util.List<zemberek.proto.morphology.SentenceWordAnalysisProto> 
      getResultsList();
  /**
   * <pre>
   * for each token, result best morphological analysis and if requested, all
   * analyses.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.SentenceWordAnalysisProto results = 2;</code>
   */
  zemberek.proto.morphology.SentenceWordAnalysisProto getResults(int index);
  /**
   * <pre>
   * for each token, result best morphological analysis and if requested, all
   * analyses.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.SentenceWordAnalysisProto results = 2;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * for each token, result best morphological analysis and if requested, all
   * analyses.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.SentenceWordAnalysisProto results = 2;</code>
   */
  java.util.List<? extends zemberek.proto.morphology.SentenceWordAnalysisProtoOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * for each token, result best morphological analysis and if requested, all
   * analyses.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.SentenceWordAnalysisProto results = 2;</code>
   */
  zemberek.proto.morphology.SentenceWordAnalysisProtoOrBuilder getResultsOrBuilder(
      int index);
}