/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(ToolsCreativeWordSelectV2DataCreativeWordContentType.Adapter.class)
public enum ToolsCreativeWordSelectV2DataCreativeWordContentType {
  
  AGE("AGE"),
  
  CARRIER("CARRIER"),
  
  DATE("DATE"),
  
  DEVICE("DEVICE"),
  
  KEYWORD("KEYWORD"),
  
  NETWORK("NETWORK"),
  
  PROVINCE("PROVINCE"),
  
  REGION("REGION"),
  
  RICE("RICE"),
  
  WEEK("WEEK");

  private String value;

  ToolsCreativeWordSelectV2DataCreativeWordContentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCreativeWordSelectV2DataCreativeWordContentType fromValue(String value) {
    for (ToolsCreativeWordSelectV2DataCreativeWordContentType b : ToolsCreativeWordSelectV2DataCreativeWordContentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsCreativeWordSelectV2DataCreativeWordContentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCreativeWordSelectV2DataCreativeWordContentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCreativeWordSelectV2DataCreativeWordContentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCreativeWordSelectV2DataCreativeWordContentType.fromValue(value);
    }
  }
}

