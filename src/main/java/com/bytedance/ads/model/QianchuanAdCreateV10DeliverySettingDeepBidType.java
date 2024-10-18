/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(QianchuanAdCreateV10DeliverySettingDeepBidType.Adapter.class)
public enum QianchuanAdCreateV10DeliverySettingDeepBidType {
  
  COMM_ROI("COMM_ROI"),
  
  MIN("MIN"),
  
  MIN_SECOND_STAGE("MIN_SECOND_STAGE"),
  
  PACING("PACING"),
  
  PAY_ROI("PAY_ROI");

  private String value;

  QianchuanAdCreateV10DeliverySettingDeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCreateV10DeliverySettingDeepBidType fromValue(String value) {
    for (QianchuanAdCreateV10DeliverySettingDeepBidType b : QianchuanAdCreateV10DeliverySettingDeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCreateV10DeliverySettingDeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCreateV10DeliverySettingDeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCreateV10DeliverySettingDeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCreateV10DeliverySettingDeepBidType.fromValue(value);
    }
  }
}

