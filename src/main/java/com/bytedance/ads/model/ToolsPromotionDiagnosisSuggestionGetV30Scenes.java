/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(ToolsPromotionDiagnosisSuggestionGetV30Scenes.Adapter.class)
public enum ToolsPromotionDiagnosisSuggestionGetV30Scenes {
  
  CLEAN("CLEAN"),
  
  POTENTIAL("POTENTIAL"),
  
  ZOMBIE("ZOMBIE");

  private String value;

  ToolsPromotionDiagnosisSuggestionGetV30Scenes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionDiagnosisSuggestionGetV30Scenes fromValue(String value) {
    for (ToolsPromotionDiagnosisSuggestionGetV30Scenes b : ToolsPromotionDiagnosisSuggestionGetV30Scenes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionDiagnosisSuggestionGetV30Scenes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionDiagnosisSuggestionGetV30Scenes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionDiagnosisSuggestionGetV30Scenes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionDiagnosisSuggestionGetV30Scenes.fromValue(value);
    }
  }
}

