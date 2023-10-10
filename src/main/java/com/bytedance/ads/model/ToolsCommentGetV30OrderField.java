/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(ToolsCommentGetV30OrderField.Adapter.class)
public enum ToolsCommentGetV30OrderField {
  
  CREATE_TIME("CREATE_TIME"),
  
  LIKE_COUNT("LIKE_COUNT"),
  
  REPLY_COUNT("REPLY_COUNT");

  private String value;

  ToolsCommentGetV30OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCommentGetV30OrderField fromValue(String value) {
    for (ToolsCommentGetV30OrderField b : ToolsCommentGetV30OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsCommentGetV30OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCommentGetV30OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCommentGetV30OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCommentGetV30OrderField.fromValue(value);
    }
  }
}

