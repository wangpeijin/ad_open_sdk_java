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
@JsonAdapter(QianchuanAdRegionUpdateV10District.Adapter.class)
public enum QianchuanAdRegionUpdateV10District {
  
  CITY("CITY"),
  
  COUNTY("COUNTY"),
  
  NONE("NONE");

  private String value;

  QianchuanAdRegionUpdateV10District(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdRegionUpdateV10District fromValue(String value) {
    for (QianchuanAdRegionUpdateV10District b : QianchuanAdRegionUpdateV10District.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdRegionUpdateV10District> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdRegionUpdateV10District enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdRegionUpdateV10District read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdRegionUpdateV10District.fromValue(value);
    }
  }
}

