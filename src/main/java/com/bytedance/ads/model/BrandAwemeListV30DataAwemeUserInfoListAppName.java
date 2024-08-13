/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(BrandAwemeListV30DataAwemeUserInfoListAppName.Adapter.class)
public enum BrandAwemeListV30DataAwemeUserInfoListAppName {
  
  AWEME("AWEME"),
  
  WATERMELON("WATERMELON");

  private String value;

  BrandAwemeListV30DataAwemeUserInfoListAppName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAwemeListV30DataAwemeUserInfoListAppName fromValue(String value) {
    for (BrandAwemeListV30DataAwemeUserInfoListAppName b : BrandAwemeListV30DataAwemeUserInfoListAppName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandAwemeListV30DataAwemeUserInfoListAppName> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAwemeListV30DataAwemeUserInfoListAppName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAwemeListV30DataAwemeUserInfoListAppName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandAwemeListV30DataAwemeUserInfoListAppName.fromValue(value);
    }
  }
}

