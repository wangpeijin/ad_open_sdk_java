/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState.Adapter.class)
public enum ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState {
  
  NEW_CLUE("NEW_CLUE"),
  
  INVALID("INVALID"),
  
  CONFIRM("CONFIRM"),
  
  VX("VX"),
  
  ARRIVAL("ARRIVAL"),
  
  DEAL("DEAL");

  private String value;

  ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState fromValue(String value) {
    for (ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState b : ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState.fromValue(value);
    }
  }
}

