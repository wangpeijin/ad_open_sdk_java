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
@JsonAdapter(CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType.Adapter.class)
public enum CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType {
  
  DEPRECATED("DPA_VIDEO_TEMPLATE_DEPRECATED"),
  
  SMART("DPA_VIDEO_TEMPLATE_SMART"),
  
  CUSTOM("DPA_VIDEO_TEMPLATE_CUSTOM");

  private String value;

  CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType fromValue(String value) {
    for (CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType b : CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType.fromValue(value);
    }
  }
}

