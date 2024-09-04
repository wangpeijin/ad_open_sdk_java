/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ToolsCommentGetV30DataCommentListCommentType.Adapter.class)
public enum ToolsCommentGetV30DataCommentListCommentType {
  
  IMAGE_COMMENT("IMAGE_COMMENT"),
  
  IMAGE_TEXT_COMMENT("IMAGE_TEXT_COMMENT"),
  
  TEXT_COMMENT("TEXT_COMMENT");

  private String value;

  ToolsCommentGetV30DataCommentListCommentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCommentGetV30DataCommentListCommentType fromValue(String value) {
    for (ToolsCommentGetV30DataCommentListCommentType b : ToolsCommentGetV30DataCommentListCommentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsCommentGetV30DataCommentListCommentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCommentGetV30DataCommentListCommentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCommentGetV30DataCommentListCommentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCommentGetV30DataCommentListCommentType.fromValue(value);
    }
  }
}

