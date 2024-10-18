/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(LocalProjectListV30DataProjectListLocalDeliveryScene.Adapter.class)
public enum LocalProjectListV30DataProjectListLocalDeliveryScene {
  
  CONTENT_HEAT("CONTENT_HEAT"),
  
  EXTERNAL("EXTERNAL"),
  
  POI_RECOMMEND("POI_RECOMMEND"),
  
  PRODUCT_PAY("PRODUCT_PAY");

  private String value;

  LocalProjectListV30DataProjectListLocalDeliveryScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectListV30DataProjectListLocalDeliveryScene fromValue(String value) {
    for (LocalProjectListV30DataProjectListLocalDeliveryScene b : LocalProjectListV30DataProjectListLocalDeliveryScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectListV30DataProjectListLocalDeliveryScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectListV30DataProjectListLocalDeliveryScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectListV30DataProjectListLocalDeliveryScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectListV30DataProjectListLocalDeliveryScene.fromValue(value);
    }
  }
}

