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
@JsonAdapter(StarInfoV2DataInfoListStatus.Adapter.class)
public enum StarInfoV2DataInfoListStatus {
  
  DELETED("DELETED"),
  
  ENABLE("ENABLE"),
  
  FROZEN("FROZEN"),
  
  NEW_PROTOCOL("NEW_PROTOCOL"),
  
  PUNISH("PUNISH"),
  
  QUALIFICATION_VERIFICATION("QUALIFICATION_VERIFICATION"),
  
  UN_PROTOCOL("UN_PROTOCOL");

  private String value;

  StarInfoV2DataInfoListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarInfoV2DataInfoListStatus fromValue(String value) {
    for (StarInfoV2DataInfoListStatus b : StarInfoV2DataInfoListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarInfoV2DataInfoListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarInfoV2DataInfoListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarInfoV2DataInfoListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarInfoV2DataInfoListStatus.fromValue(value);
    }
  }
}

