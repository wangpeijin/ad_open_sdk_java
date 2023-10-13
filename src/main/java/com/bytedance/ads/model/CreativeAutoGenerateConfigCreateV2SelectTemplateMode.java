/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(CreativeAutoGenerateConfigCreateV2SelectTemplateMode.Adapter.class)
public enum CreativeAutoGenerateConfigCreateV2SelectTemplateMode {
  
  CUSTOM_SELECT_TEMPLATE("CUSTOM_SELECT_TEMPLATE"),
  
  SYSTEM_SELECT_TEMPLATE("SYSTEM_SELECT_TEMPLATE");

  private String value;

  CreativeAutoGenerateConfigCreateV2SelectTemplateMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeAutoGenerateConfigCreateV2SelectTemplateMode fromValue(String value) {
    for (CreativeAutoGenerateConfigCreateV2SelectTemplateMode b : CreativeAutoGenerateConfigCreateV2SelectTemplateMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeAutoGenerateConfigCreateV2SelectTemplateMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeAutoGenerateConfigCreateV2SelectTemplateMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeAutoGenerateConfigCreateV2SelectTemplateMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeAutoGenerateConfigCreateV2SelectTemplateMode.fromValue(value);
    }
  }
}

