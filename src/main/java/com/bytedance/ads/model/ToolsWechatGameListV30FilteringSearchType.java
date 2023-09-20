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
@JsonAdapter(ToolsWechatGameListV30FilteringSearchType.Adapter.class)
public enum ToolsWechatGameListV30FilteringSearchType {
  
  CREATE_ONLY("CREATE_ONLY"),
  
  SHARE_ONLY("SHARE_ONLY");

  private String value;

  ToolsWechatGameListV30FilteringSearchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatGameListV30FilteringSearchType fromValue(String value) {
    for (ToolsWechatGameListV30FilteringSearchType b : ToolsWechatGameListV30FilteringSearchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatGameListV30FilteringSearchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatGameListV30FilteringSearchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatGameListV30FilteringSearchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatGameListV30FilteringSearchType.fromValue(value);
    }
  }
}

