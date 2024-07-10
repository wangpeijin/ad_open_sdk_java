/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(QianchuanAdCompensateStatusGetV10DataListStatus.Adapter.class)
public enum QianchuanAdCompensateStatusGetV10DataListStatus {
  
  SUCCESS("SUCCESS"),
  
  FAILED("FAILED");

  private String value;

  QianchuanAdCompensateStatusGetV10DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCompensateStatusGetV10DataListStatus fromValue(String value) {
    for (QianchuanAdCompensateStatusGetV10DataListStatus b : QianchuanAdCompensateStatusGetV10DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCompensateStatusGetV10DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCompensateStatusGetV10DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCompensateStatusGetV10DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCompensateStatusGetV10DataListStatus.fromValue(value);
    }
  }
}

