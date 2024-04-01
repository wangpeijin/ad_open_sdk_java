/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(DouplusOrderListV30DataOrderListOrderLiveScene.Adapter.class)
public enum DouplusOrderListV30DataOrderListOrderLiveScene {
  
  Enum_混合投放("混合投放"),
  
  Enum_直推直播间("直推直播间"),
  
  Enum_视频导流直播间("视频导流直播间");

  private String value;

  DouplusOrderListV30DataOrderListOrderLiveScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderListV30DataOrderListOrderLiveScene fromValue(String value) {
    for (DouplusOrderListV30DataOrderListOrderLiveScene b : DouplusOrderListV30DataOrderListOrderLiveScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DouplusOrderListV30DataOrderListOrderLiveScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderListV30DataOrderListOrderLiveScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderListV30DataOrderListOrderLiveScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderListV30DataOrderListOrderLiveScene.fromValue(value);
    }
  }
}

