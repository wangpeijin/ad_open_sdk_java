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
@JsonAdapter(QianchuanAccountBudgetGetV10DataBudgetMode.Adapter.class)
public enum QianchuanAccountBudgetGetV10DataBudgetMode {
  
  INFINITE("INFINITE"),
  
  SPECIFIED("SPECIFIED");

  private String value;

  QianchuanAccountBudgetGetV10DataBudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAccountBudgetGetV10DataBudgetMode fromValue(String value) {
    for (QianchuanAccountBudgetGetV10DataBudgetMode b : QianchuanAccountBudgetGetV10DataBudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAccountBudgetGetV10DataBudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAccountBudgetGetV10DataBudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAccountBudgetGetV10DataBudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAccountBudgetGetV10DataBudgetMode.fromValue(value);
    }
  }
}

