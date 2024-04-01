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
@JsonAdapter(BrandAwemeListV30DataAwemeUserInfoListAuthType.Adapter.class)
public enum BrandAwemeListV30DataAwemeUserInfoListAuthType {
  
  ACCOUNT("ACCOUNT"),
  
  ITEM("ITEM"),
  
  ITEM_AND_LIVE("ITEM_AND_LIVE"),
  
  LIVE("LIVE");

  private String value;

  BrandAwemeListV30DataAwemeUserInfoListAuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAwemeListV30DataAwemeUserInfoListAuthType fromValue(String value) {
    for (BrandAwemeListV30DataAwemeUserInfoListAuthType b : BrandAwemeListV30DataAwemeUserInfoListAuthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandAwemeListV30DataAwemeUserInfoListAuthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAwemeListV30DataAwemeUserInfoListAuthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAwemeListV30DataAwemeUserInfoListAuthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandAwemeListV30DataAwemeUserInfoListAuthType.fromValue(value);
    }
  }
}

