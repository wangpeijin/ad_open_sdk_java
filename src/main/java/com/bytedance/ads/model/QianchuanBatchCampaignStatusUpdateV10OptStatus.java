/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(QianchuanBatchCampaignStatusUpdateV10OptStatus.Adapter.class)
public enum QianchuanBatchCampaignStatusUpdateV10OptStatus {
  
  DELETE("DELETE"),
  
  DISABLE("DISABLE"),
  
  ENABLE("ENABLE");

  private String value;

  QianchuanBatchCampaignStatusUpdateV10OptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanBatchCampaignStatusUpdateV10OptStatus fromValue(String value) {
    for (QianchuanBatchCampaignStatusUpdateV10OptStatus b : QianchuanBatchCampaignStatusUpdateV10OptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanBatchCampaignStatusUpdateV10OptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanBatchCampaignStatusUpdateV10OptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanBatchCampaignStatusUpdateV10OptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanBatchCampaignStatusUpdateV10OptStatus.fromValue(value);
    }
  }
}

