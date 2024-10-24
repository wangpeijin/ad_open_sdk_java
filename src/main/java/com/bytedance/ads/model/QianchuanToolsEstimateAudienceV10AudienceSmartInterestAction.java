/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction.Adapter.class)
public enum QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction {
  
  CUSTOM("CUSTOM"),
  
  RECOMMEND("RECOMMEND");

  private String value;

  QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction fromValue(String value) {
    for (QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction b : QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction.fromValue(value);
    }
  }
}

