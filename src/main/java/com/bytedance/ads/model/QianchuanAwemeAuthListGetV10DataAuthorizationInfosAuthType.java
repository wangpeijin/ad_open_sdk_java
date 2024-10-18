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
@JsonAdapter(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType.Adapter.class)
public enum QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType {
  
  ALL("ALL"),
  
  AWEME_COOPERATOR("AWEME_COOPERATOR"),
  
  OFFICIAL("OFFICIAL"),
  
  SELF("SELF");

  private String value;

  QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType fromValue(String value) {
    for (QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType b : QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType.fromValue(value);
    }
  }
}

