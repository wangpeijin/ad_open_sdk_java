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
@JsonAdapter(StarDemandOrderListV2FilteringUniversalOrderStatus.Adapter.class)
public enum StarDemandOrderListV2FilteringUniversalOrderStatus {
  
  ALL("ALL"),
  
  CANCELED("CANCELED"),
  
  FINISHED("FINISHED"),
  
  ONGOING("ONGOING"),
  
  RECEIVEING("RECEIVEING"),
  
  WAIT_EVALUATE("WAIT_EVALUATE"),
  
  WAIT_PAYMENT("WAIT_PAYMENT");

  private String value;

  StarDemandOrderListV2FilteringUniversalOrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandOrderListV2FilteringUniversalOrderStatus fromValue(String value) {
    for (StarDemandOrderListV2FilteringUniversalOrderStatus b : StarDemandOrderListV2FilteringUniversalOrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarDemandOrderListV2FilteringUniversalOrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandOrderListV2FilteringUniversalOrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandOrderListV2FilteringUniversalOrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandOrderListV2FilteringUniversalOrderStatus.fromValue(value);
    }
  }
}

