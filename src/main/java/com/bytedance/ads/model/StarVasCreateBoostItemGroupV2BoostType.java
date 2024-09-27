/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(StarVasCreateBoostItemGroupV2BoostType.Adapter.class)
public enum StarVasCreateBoostItemGroupV2BoostType {
  
  CUSTOM_PACKAGE("CUSTOM_PACKAGE"),
  
  CUSTOM_TAG("CUSTOM_TAG"),
  
  NONE("NONE");

  private String value;

  StarVasCreateBoostItemGroupV2BoostType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasCreateBoostItemGroupV2BoostType fromValue(String value) {
    for (StarVasCreateBoostItemGroupV2BoostType b : StarVasCreateBoostItemGroupV2BoostType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarVasCreateBoostItemGroupV2BoostType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasCreateBoostItemGroupV2BoostType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasCreateBoostItemGroupV2BoostType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasCreateBoostItemGroupV2BoostType.fromValue(value);
    }
  }
}

