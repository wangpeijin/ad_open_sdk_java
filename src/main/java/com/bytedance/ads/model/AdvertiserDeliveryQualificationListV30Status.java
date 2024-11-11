/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(AdvertiserDeliveryQualificationListV30Status.Adapter.class)
public enum AdvertiserDeliveryQualificationListV30Status {
  
  CONFIRM("STATUS_CONFIRM"),
  
  CONFIRM_FAIL("STATUS_CONFIRM_FAIL"),
  
  NOT_SUBMIT("STATUS_NOT_SUBMIT"),
  
  PENDING_CONFIRM("STATUS_PENDING_CONFIRM"),
  
  WAIT_CONFIRM("STATUS_WAIT_CONFIRM");

  private String value;

  AdvertiserDeliveryQualificationListV30Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserDeliveryQualificationListV30Status fromValue(String value) {
    for (AdvertiserDeliveryQualificationListV30Status b : AdvertiserDeliveryQualificationListV30Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserDeliveryQualificationListV30Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserDeliveryQualificationListV30Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserDeliveryQualificationListV30Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserDeliveryQualificationListV30Status.fromValue(value);
    }
  }
}

