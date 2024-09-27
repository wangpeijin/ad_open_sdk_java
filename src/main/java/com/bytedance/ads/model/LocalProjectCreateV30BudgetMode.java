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
@JsonAdapter(LocalProjectCreateV30BudgetMode.Adapter.class)
public enum LocalProjectCreateV30BudgetMode {
  
  ALL("ALL"),
  
  BUDGET_MODE_DAY("BUDGET_MODE_DAY"),
  
  BUDGET_MODE_TOTAL("BUDGET_MODE_TOTAL");

  private String value;

  LocalProjectCreateV30BudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectCreateV30BudgetMode fromValue(String value) {
    for (LocalProjectCreateV30BudgetMode b : LocalProjectCreateV30BudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectCreateV30BudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectCreateV30BudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectCreateV30BudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectCreateV30BudgetMode.fromValue(value);
    }
  }
}

