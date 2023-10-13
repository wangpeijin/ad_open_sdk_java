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
@JsonAdapter(ClueWechatInstanceListV2DataItemsSubType.Adapter.class)
public enum ClueWechatInstanceListV2DataItemsSubType {
  
  NORMAL("NORMAL"),
  
  SINGLE("SINGLE"),
  
  ENTERPRISE_DEFAULT("ENTERPRISE_DEFAULT"),
  
  ENTERPRISE_CODE("ENTERPRISE_CODE");

  private String value;

  ClueWechatInstanceListV2DataItemsSubType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueWechatInstanceListV2DataItemsSubType fromValue(String value) {
    for (ClueWechatInstanceListV2DataItemsSubType b : ClueWechatInstanceListV2DataItemsSubType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClueWechatInstanceListV2DataItemsSubType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueWechatInstanceListV2DataItemsSubType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueWechatInstanceListV2DataItemsSubType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueWechatInstanceListV2DataItemsSubType.fromValue(value);
    }
  }
}

