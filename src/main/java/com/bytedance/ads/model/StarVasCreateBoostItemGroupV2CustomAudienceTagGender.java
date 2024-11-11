/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(StarVasCreateBoostItemGroupV2CustomAudienceTagGender.Adapter.class)
public enum StarVasCreateBoostItemGroupV2CustomAudienceTagGender {
  
  FEMALE("FEMALE"),
  
  INFINITE("INFINITE"),
  
  MALE("MALE");

  private String value;

  StarVasCreateBoostItemGroupV2CustomAudienceTagGender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasCreateBoostItemGroupV2CustomAudienceTagGender fromValue(String value) {
    for (StarVasCreateBoostItemGroupV2CustomAudienceTagGender b : StarVasCreateBoostItemGroupV2CustomAudienceTagGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarVasCreateBoostItemGroupV2CustomAudienceTagGender> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasCreateBoostItemGroupV2CustomAudienceTagGender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasCreateBoostItemGroupV2CustomAudienceTagGender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasCreateBoostItemGroupV2CustomAudienceTagGender.fromValue(value);
    }
  }
}

