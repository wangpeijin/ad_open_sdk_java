/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(QianchuanToolsAwemeAuthV10AuthType.Adapter.class)
public enum QianchuanToolsAwemeAuthV10AuthType {
  
  SELF("SELF"),
  
  AWEME_COOPERATOR("AWEME_COOPERATOR");

  private String value;

  QianchuanToolsAwemeAuthV10AuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanToolsAwemeAuthV10AuthType fromValue(String value) {
    for (QianchuanToolsAwemeAuthV10AuthType b : QianchuanToolsAwemeAuthV10AuthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanToolsAwemeAuthV10AuthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanToolsAwemeAuthV10AuthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanToolsAwemeAuthV10AuthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanToolsAwemeAuthV10AuthType.fromValue(value);
    }
  }
}

