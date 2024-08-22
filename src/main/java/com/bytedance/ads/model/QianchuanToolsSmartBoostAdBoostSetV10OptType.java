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
@JsonAdapter(QianchuanToolsSmartBoostAdBoostSetV10OptType.Adapter.class)
public enum QianchuanToolsSmartBoostAdBoostSetV10OptType {
  
  CANCEL_SUBSCRIBE("CANCEL_SUBSCRIBE"),
  
  START_RAISE("START_RAISE"),
  
  STOP_RAISE("STOP_RAISE"),
  
  SUBSCRIBE_RAISE("SUBSCRIBE_RAISE");

  private String value;

  QianchuanToolsSmartBoostAdBoostSetV10OptType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanToolsSmartBoostAdBoostSetV10OptType fromValue(String value) {
    for (QianchuanToolsSmartBoostAdBoostSetV10OptType b : QianchuanToolsSmartBoostAdBoostSetV10OptType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanToolsSmartBoostAdBoostSetV10OptType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanToolsSmartBoostAdBoostSetV10OptType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanToolsSmartBoostAdBoostSetV10OptType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanToolsSmartBoostAdBoostSetV10OptType.fromValue(value);
    }
  }
}

