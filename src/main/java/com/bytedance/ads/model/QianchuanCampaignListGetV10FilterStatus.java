/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(QianchuanCampaignListGetV10FilterStatus.Adapter.class)
public enum QianchuanCampaignListGetV10FilterStatus {
  
  ALL("ALL"),
  
  DELETE("DELETE"),
  
  DISABLE("DISABLE"),
  
  ENABLE("ENABLE");

  private String value;

  QianchuanCampaignListGetV10FilterStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCampaignListGetV10FilterStatus fromValue(String value) {
    for (QianchuanCampaignListGetV10FilterStatus b : QianchuanCampaignListGetV10FilterStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanCampaignListGetV10FilterStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCampaignListGetV10FilterStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCampaignListGetV10FilterStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanCampaignListGetV10FilterStatus.fromValue(value);
    }
  }
}

