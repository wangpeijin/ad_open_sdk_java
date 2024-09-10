/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays.Adapter.class)
public enum QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays {
  
  Enum_15("DAYS_15"),
  
  Enum_30("DAYS_30"),
  
  Enum_60("DAYS_60");

  private String value;

  QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays fromValue(String value) {
    for (QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays b : QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays.fromValue(value);
    }
  }
}

