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
@JsonAdapter(CreativeStrategyListV2StrategyTypes.Adapter.class)
public enum CreativeStrategyListV2StrategyTypes {
  
  HORIZONTAL2HORIZONTAL("Horizontal2Horizontal"),
  
  HORIZONTAL2VERTICAL("Horizontal2Vertical"),
  
  VERTICAL2HORIZONTAL("Vertical2Horizontal"),
  
  VERTICAL2VERTICAL("Vertical2Vertical");

  private String value;

  CreativeStrategyListV2StrategyTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeStrategyListV2StrategyTypes fromValue(String value) {
    for (CreativeStrategyListV2StrategyTypes b : CreativeStrategyListV2StrategyTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeStrategyListV2StrategyTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeStrategyListV2StrategyTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeStrategyListV2StrategyTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeStrategyListV2StrategyTypes.fromValue(value);
    }
  }
}

