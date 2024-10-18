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
@JsonAdapter(QianchuanAdDetailGetV10DataAudiencePlatform.Adapter.class)
public enum QianchuanAdDetailGetV10DataAudiencePlatform {
  
  ANDROID("ANDROID"),
  
  IOS("IOS"),
  
  IPAD("IPAD"),
  
  NONE("NONE"),
  
  PC("PC"),
  
  WAP("WAP");

  private String value;

  QianchuanAdDetailGetV10DataAudiencePlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataAudiencePlatform fromValue(String value) {
    for (QianchuanAdDetailGetV10DataAudiencePlatform b : QianchuanAdDetailGetV10DataAudiencePlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataAudiencePlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataAudiencePlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataAudiencePlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataAudiencePlatform.fromValue(value);
    }
  }
}

