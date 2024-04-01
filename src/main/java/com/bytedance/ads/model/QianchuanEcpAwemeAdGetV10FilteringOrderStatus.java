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
@JsonAdapter(QianchuanEcpAwemeAdGetV10FilteringOrderStatus.Adapter.class)
public enum QianchuanEcpAwemeAdGetV10FilteringOrderStatus {
  
  AUDITING("AUDITING"),
  
  BOOK("BOOK"),
  
  CREATING("CREATING"),
  
  DELIVERING("DELIVERING"),
  
  FAILED("FAILED"),
  
  FINISHED("FINISHED"),
  
  OVER("OVER"),
  
  REJECT("REJECT"),
  
  UNDELIVERING("UNDELIVERING"),
  
  UNPAID("UNPAID");

  private String value;

  QianchuanEcpAwemeAdGetV10FilteringOrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanEcpAwemeAdGetV10FilteringOrderStatus fromValue(String value) {
    for (QianchuanEcpAwemeAdGetV10FilteringOrderStatus b : QianchuanEcpAwemeAdGetV10FilteringOrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanEcpAwemeAdGetV10FilteringOrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanEcpAwemeAdGetV10FilteringOrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanEcpAwemeAdGetV10FilteringOrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanEcpAwemeAdGetV10FilteringOrderStatus.fromValue(value);
    }
  }
}

