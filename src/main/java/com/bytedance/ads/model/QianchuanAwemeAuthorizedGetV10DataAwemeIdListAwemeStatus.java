/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus.Adapter.class)
public enum QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus {
  
  ANCHOR_FORBID("ANCHOR_FORBID"),
  
  ANCHOR_REACH_UPPER_LIMIT_TODAY("ANCHOR_REACH_UPPER_LIMIT_TODAY"),
  
  NORMAL("NORMAL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus fromValue(String value) {
    for (QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus b : QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus.fromValue(value);
    }
  }
}

