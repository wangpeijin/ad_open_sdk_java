/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(AdvertiserQualificationGetV30DataIndustriesOthersStatus.Adapter.class)
public enum AdvertiserQualificationGetV30DataIndustriesOthersStatus {
  
  CONFIRM("STATUS_CONFIRM"),
  
  CONFIRM_FAIL("STATUS_CONFIRM_FAIL"),
  
  NOT_SUBMIT("STATUS_NOT_SUBMIT"),
  
  PENDING_CONFIRM("STATUS_PENDING_CONFIRM"),
  
  WAIT_CONFIRM("STATUS_WAIT_CONFIRM");

  private String value;

  AdvertiserQualificationGetV30DataIndustriesOthersStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserQualificationGetV30DataIndustriesOthersStatus fromValue(String value) {
    for (AdvertiserQualificationGetV30DataIndustriesOthersStatus b : AdvertiserQualificationGetV30DataIndustriesOthersStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserQualificationGetV30DataIndustriesOthersStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserQualificationGetV30DataIndustriesOthersStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserQualificationGetV30DataIndustriesOthersStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserQualificationGetV30DataIndustriesOthersStatus.fromValue(value);
    }
  }
}

