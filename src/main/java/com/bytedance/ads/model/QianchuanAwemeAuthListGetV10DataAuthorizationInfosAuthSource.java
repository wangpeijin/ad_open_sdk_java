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
@JsonAdapter(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource.Adapter.class)
public enum QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource {
  
  AWEME("AWEME"),
  
  QIANCHUAN("QIANCHUAN"),
  
  STAR("STAR");

  private String value;

  QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource fromValue(String value) {
    for (QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource b : QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource.fromValue(value);
    }
  }
}

