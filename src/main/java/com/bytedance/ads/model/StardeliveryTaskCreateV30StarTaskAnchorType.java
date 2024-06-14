/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(StardeliveryTaskCreateV30StarTaskAnchorType.Adapter.class)
public enum StardeliveryTaskCreateV30StarTaskAnchorType {
  
  GAME("APP_GAME"),
  
  INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  SHOP("APP_SHOP");

  private String value;

  StardeliveryTaskCreateV30StarTaskAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskCreateV30StarTaskAnchorType fromValue(String value) {
    for (StardeliveryTaskCreateV30StarTaskAnchorType b : StardeliveryTaskCreateV30StarTaskAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskCreateV30StarTaskAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskCreateV30StarTaskAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskCreateV30StarTaskAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskCreateV30StarTaskAnchorType.fromValue(value);
    }
  }
}

