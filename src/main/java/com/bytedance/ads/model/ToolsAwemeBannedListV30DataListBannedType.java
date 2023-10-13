/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(ToolsAwemeBannedListV30DataListBannedType.Adapter.class)
public enum ToolsAwemeBannedListV30DataListBannedType {
  
  AWEME_TYPE("AWEME_TYPE"),
  
  CUSTOM_TYPE("CUSTOM_TYPE");

  private String value;

  ToolsAwemeBannedListV30DataListBannedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeBannedListV30DataListBannedType fromValue(String value) {
    for (ToolsAwemeBannedListV30DataListBannedType b : ToolsAwemeBannedListV30DataListBannedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeBannedListV30DataListBannedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeBannedListV30DataListBannedType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeBannedListV30DataListBannedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeBannedListV30DataListBannedType.fromValue(value);
    }
  }
}

