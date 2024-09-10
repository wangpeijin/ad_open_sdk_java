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
@JsonAdapter(StarStarAdUniteTaskItemListV2DataStatInfoItemStatus.Adapter.class)
public enum StarStarAdUniteTaskItemListV2DataStatInfoItemStatus {
  
  AUDIT_PASS("AUDIT_PASS"),
  
  CREATED("CREATED"),
  
  PRIVATE_AREA("PRIVATE_AREA"),
  
  USER_DELETED("USER_DELETED");

  private String value;

  StarStarAdUniteTaskItemListV2DataStatInfoItemStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarStarAdUniteTaskItemListV2DataStatInfoItemStatus fromValue(String value) {
    for (StarStarAdUniteTaskItemListV2DataStatInfoItemStatus b : StarStarAdUniteTaskItemListV2DataStatInfoItemStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarStarAdUniteTaskItemListV2DataStatInfoItemStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarStarAdUniteTaskItemListV2DataStatInfoItemStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarStarAdUniteTaskItemListV2DataStatInfoItemStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarStarAdUniteTaskItemListV2DataStatInfoItemStatus.fromValue(value);
    }
  }
}

