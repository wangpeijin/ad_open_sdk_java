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
@JsonAdapter(QianchuanAdCreateV10AudienceLivePlatformTags.Adapter.class)
public enum QianchuanAdCreateV10AudienceLivePlatformTags {
  
  ABNORMAL_ACTIVE("ABNORMAL_ACTIVE"),
  
  AWEME_FANS("AWEME_FANS"),
  
  LARGE_FANSCOUNT("LARGE_FANSCOUNT");

  private String value;

  QianchuanAdCreateV10AudienceLivePlatformTags(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCreateV10AudienceLivePlatformTags fromValue(String value) {
    for (QianchuanAdCreateV10AudienceLivePlatformTags b : QianchuanAdCreateV10AudienceLivePlatformTags.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCreateV10AudienceLivePlatformTags> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCreateV10AudienceLivePlatformTags enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCreateV10AudienceLivePlatformTags read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCreateV10AudienceLivePlatformTags.fromValue(value);
    }
  }
}

