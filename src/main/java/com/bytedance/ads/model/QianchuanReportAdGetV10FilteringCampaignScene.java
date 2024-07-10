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
@JsonAdapter(QianchuanReportAdGetV10FilteringCampaignScene.Adapter.class)
public enum QianchuanReportAdGetV10FilteringCampaignScene {
  
  DAILY_SALE("DAILY_SALE"),
  
  LIVE_HEAT("LIVE_HEAT"),
  
  NEW_CUSTOMER_TRANSFORMATION("NEW_CUSTOMER_TRANSFORMATION"),
  
  NEW_PRODUCT_BOOST("NEW_PRODUCT_BOOST"),
  
  PLANT_GRASS("PLANT_GRASS"),
  
  PRODUCT_HEAT("PRODUCT_HEAT");

  private String value;

  QianchuanReportAdGetV10FilteringCampaignScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportAdGetV10FilteringCampaignScene fromValue(String value) {
    for (QianchuanReportAdGetV10FilteringCampaignScene b : QianchuanReportAdGetV10FilteringCampaignScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportAdGetV10FilteringCampaignScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportAdGetV10FilteringCampaignScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportAdGetV10FilteringCampaignScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportAdGetV10FilteringCampaignScene.fromValue(value);
    }
  }
}

