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
@JsonAdapter(QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus.Adapter.class)
public enum QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus {
  
  CANNOT_RAISE("CANNOT_RAISE"),
  
  CAN_RAISE("CAN_RAISE"),
  
  FINISH_RAISE("FINISH_RAISE"),
  
  HASPRE_RAISE("HASPRE_RAISE"),
  
  RAISE_FAILED("RAISE_FAILED"),
  
  RAISING("RAISING");

  private String value;

  QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus fromValue(String value) {
    for (QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus b : QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus.fromValue(value);
    }
  }
}

