/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ReportCustomAsyncTaskCreateV30DataTaskStatus.Adapter.class)
public enum ReportCustomAsyncTaskCreateV30DataTaskStatus {
  
  COMPLETED("ASYNC_TASK_STATUS_COMPLETED"),
  
  CREATED("ASYNC_TASK_STATUS_CREATED"),
  
  EXECUTING("ASYNC_TASK_STATUS_EXECUTING"),
  
  FAILED("ASYNC_TASK_STATUS_FAILED");

  private String value;

  ReportCustomAsyncTaskCreateV30DataTaskStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCustomAsyncTaskCreateV30DataTaskStatus fromValue(String value) {
    for (ReportCustomAsyncTaskCreateV30DataTaskStatus b : ReportCustomAsyncTaskCreateV30DataTaskStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportCustomAsyncTaskCreateV30DataTaskStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCustomAsyncTaskCreateV30DataTaskStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCustomAsyncTaskCreateV30DataTaskStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCustomAsyncTaskCreateV30DataTaskStatus.fromValue(value);
    }
  }
}

