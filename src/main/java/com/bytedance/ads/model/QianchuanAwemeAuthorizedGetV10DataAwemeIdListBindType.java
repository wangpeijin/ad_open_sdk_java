/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType.Adapter.class)
public enum QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType {
  
  AWEME_COOPERATOR("AWEME_COOPERATOR"),
  
  DOU_SHOP_LIVE_SELF("DOU_SHOP_LIVE_SELF"),
  
  EXPIRED("EXPIRED"),
  
  OFFICIAL("OFFICIAL"),
  
  SELF("SELF"),
  
  TALENT_USER_OWNER("TALENT_USER_OWNER"),
  
  UNAUTHORIZED("UNAUTHORIZED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType fromValue(String value) {
    for (QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType b : QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType.fromValue(value);
    }
  }
}

