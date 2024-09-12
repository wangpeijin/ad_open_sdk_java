/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(QianchuanCampaignListGetV10DataListMarketingGoal.Adapter.class)
public enum QianchuanCampaignListGetV10DataListMarketingGoal {
  
  ALL("ALL"),
  
  LIVE_PROM_GOODS("LIVE_PROM_GOODS"),
  
  VIDEO_PROM_GOODS("VIDEO_PROM_GOODS");

  private String value;

  QianchuanCampaignListGetV10DataListMarketingGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCampaignListGetV10DataListMarketingGoal fromValue(String value) {
    for (QianchuanCampaignListGetV10DataListMarketingGoal b : QianchuanCampaignListGetV10DataListMarketingGoal.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanCampaignListGetV10DataListMarketingGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCampaignListGetV10DataListMarketingGoal enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCampaignListGetV10DataListMarketingGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanCampaignListGetV10DataListMarketingGoal.fromValue(value);
    }
  }
}

