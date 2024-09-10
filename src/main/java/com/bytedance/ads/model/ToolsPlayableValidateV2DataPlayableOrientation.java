/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(ToolsPlayableValidateV2DataPlayableOrientation.Adapter.class)
public enum ToolsPlayableValidateV2DataPlayableOrientation {
  
  BOTH("BOTH"),
  
  LANDSCAPE("LANDSCAPE"),
  
  PORTRAIT("PORTRAIT");

  private String value;

  ToolsPlayableValidateV2DataPlayableOrientation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableValidateV2DataPlayableOrientation fromValue(String value) {
    for (ToolsPlayableValidateV2DataPlayableOrientation b : ToolsPlayableValidateV2DataPlayableOrientation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableValidateV2DataPlayableOrientation> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableValidateV2DataPlayableOrientation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableValidateV2DataPlayableOrientation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableValidateV2DataPlayableOrientation.fromValue(value);
    }
  }
}

