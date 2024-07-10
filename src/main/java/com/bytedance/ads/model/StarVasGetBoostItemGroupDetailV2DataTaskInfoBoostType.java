/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType.Adapter.class)
public enum StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType {
  
  CUSTOM_PACKAGE("CUSTOM_PACKAGE"),
  
  CUSTOM_TAG("CUSTOM_TAG"),
  
  NONE("NONE");

  private String value;

  StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType fromValue(String value) {
    for (StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType b : StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType.fromValue(value);
    }
  }
}

