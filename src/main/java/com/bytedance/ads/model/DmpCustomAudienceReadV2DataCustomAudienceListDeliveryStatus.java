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
@JsonAdapter(DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus.Adapter.class)
public enum DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus {
  
  AVAILABLE("CUSTOM_AUDIENCE_DELIVERY_STATUS_AVAILABLE"),
  
  NEED_PUBLISH("CUSTOM_AUDIENCE_DELIVERY_STATUS_NEED_PUBLISH"),
  
  NEED_PUSH("CUSTOM_AUDIENCE_DELIVERY_STATUS_NEED_PUSH"),
  
  UNAVAILABLE("CUSTOM_AUDIENCE_DELIVERY_STATUS_UNAVAILABLE");

  private String value;

  DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus fromValue(String value) {
    for (DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus b : DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus.fromValue(value);
    }
  }
}

