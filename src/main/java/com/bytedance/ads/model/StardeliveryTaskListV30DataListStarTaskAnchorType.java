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
@JsonAdapter(StardeliveryTaskListV30DataListStarTaskAnchorType.Adapter.class)
public enum StardeliveryTaskListV30DataListStarTaskAnchorType {
  
  APP_GAME("APP_GAME"),
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  APP_SHOP("APP_SHOP"),
  
  INSURANCE("INSURANCE"),
  
  MICRO_APP("MICRO_APP"),
  
  MICRO_GAME("MICRO_GAME"),
  
  ONLINE_SUBSCRIBE("ONLINE_SUBSCRIBE"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  SHOPPING_CART("SHOPPING_CART");

  private String value;

  StardeliveryTaskListV30DataListStarTaskAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskListV30DataListStarTaskAnchorType fromValue(String value) {
    for (StardeliveryTaskListV30DataListStarTaskAnchorType b : StardeliveryTaskListV30DataListStarTaskAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskListV30DataListStarTaskAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskListV30DataListStarTaskAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskListV30DataListStarTaskAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskListV30DataListStarTaskAnchorType.fromValue(value);
    }
  }
}

