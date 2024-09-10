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
@JsonAdapter(ToolsClueContactLogListV2DataListCallDirection.Adapter.class)
public enum ToolsClueContactLogListV2DataListCallDirection {
  
  IN("CALL_IN"),
  
  OUT("CALL_OUT");

  private String value;

  ToolsClueContactLogListV2DataListCallDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueContactLogListV2DataListCallDirection fromValue(String value) {
    for (ToolsClueContactLogListV2DataListCallDirection b : ToolsClueContactLogListV2DataListCallDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueContactLogListV2DataListCallDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueContactLogListV2DataListCallDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueContactLogListV2DataListCallDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueContactLogListV2DataListCallDirection.fromValue(value);
    }
  }
}

