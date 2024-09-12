/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType.Adapter.class)
public enum StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType {
  
  CUSTOM_PACKAGE("CUSTOM_PACKAGE"),
  
  CUSTOM_TAG("CUSTOM_TAG"),
  
  NONE("NONE");

  private String value;

  StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType fromValue(String value) {
    for (StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType b : StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasGetBoostGroupListV2DataBoostGroupInfosBoostType.fromValue(value);
    }
  }
}

