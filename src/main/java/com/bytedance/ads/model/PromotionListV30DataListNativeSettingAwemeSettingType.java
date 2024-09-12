/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(PromotionListV30DataListNativeSettingAwemeSettingType.Adapter.class)
public enum PromotionListV30DataListNativeSettingAwemeSettingType {
  
  ALL("ALL"),
  
  MULTIPLE("MULTIPLE"),
  
  SINGLE("SINGLE");

  private String value;

  PromotionListV30DataListNativeSettingAwemeSettingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListNativeSettingAwemeSettingType fromValue(String value) {
    for (PromotionListV30DataListNativeSettingAwemeSettingType b : PromotionListV30DataListNativeSettingAwemeSettingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListNativeSettingAwemeSettingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListNativeSettingAwemeSettingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListNativeSettingAwemeSettingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListNativeSettingAwemeSettingType.fromValue(value);
    }
  }
}

