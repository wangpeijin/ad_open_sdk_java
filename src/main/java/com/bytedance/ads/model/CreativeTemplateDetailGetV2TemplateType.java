/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(CreativeTemplateDetailGetV2TemplateType.Adapter.class)
public enum CreativeTemplateDetailGetV2TemplateType {
  
  HORIZONTAL_TO_VERTICAL_DYNAMIC_BACK_VIDEO("HORIZONTAL_TO_VERTICAL_DYNAMIC_BACK_VIDEO"),
  
  VERTICAL_TO_HORIZONTAL_DYNAMIC_BACK_VIDEO("VERTICAL_TO_HORIZONTAL_DYNAMIC_BACK_VIDEO"),
  
  VERTICAL_TO_HORIZONTAL_STATIC_BACK_VIDEO("VERTICAL_TO_HORIZONTAL_STATIC_BACK_VIDEO");

  private String value;

  CreativeTemplateDetailGetV2TemplateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeTemplateDetailGetV2TemplateType fromValue(String value) {
    for (CreativeTemplateDetailGetV2TemplateType b : CreativeTemplateDetailGetV2TemplateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeTemplateDetailGetV2TemplateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeTemplateDetailGetV2TemplateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeTemplateDetailGetV2TemplateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeTemplateDetailGetV2TemplateType.fromValue(value);
    }
  }
}

