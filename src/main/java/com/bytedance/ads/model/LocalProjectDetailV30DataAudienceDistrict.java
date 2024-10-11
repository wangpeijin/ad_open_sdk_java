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
@JsonAdapter(LocalProjectDetailV30DataAudienceDistrict.Adapter.class)
public enum LocalProjectDetailV30DataAudienceDistrict {
  
  ALL("ALL"),
  
  LOCAL("LOCAL"),
  
  POI("POI"),
  
  REGION("REGION");

  private String value;

  LocalProjectDetailV30DataAudienceDistrict(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectDetailV30DataAudienceDistrict fromValue(String value) {
    for (LocalProjectDetailV30DataAudienceDistrict b : LocalProjectDetailV30DataAudienceDistrict.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectDetailV30DataAudienceDistrict> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectDetailV30DataAudienceDistrict enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectDetailV30DataAudienceDistrict read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectDetailV30DataAudienceDistrict.fromValue(value);
    }
  }
}

