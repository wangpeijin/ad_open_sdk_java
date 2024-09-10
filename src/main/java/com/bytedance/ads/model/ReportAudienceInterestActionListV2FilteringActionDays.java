/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(ReportAudienceInterestActionListV2FilteringActionDays.Adapter.class)
public enum ReportAudienceInterestActionListV2FilteringActionDays {
  
  NUMBER_7(7l),
  
  NUMBER_15(15l),
  
  NUMBER_30(30l),
  
  NUMBER_60(60l),
  
  NUMBER_90(90l),
  
  NUMBER_180(180l),
  
  NUMBER_365(365l);

  private Long value;

  ReportAudienceInterestActionListV2FilteringActionDays(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAudienceInterestActionListV2FilteringActionDays fromValue(Long value) {
    for (ReportAudienceInterestActionListV2FilteringActionDays b : ReportAudienceInterestActionListV2FilteringActionDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAudienceInterestActionListV2FilteringActionDays> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAudienceInterestActionListV2FilteringActionDays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAudienceInterestActionListV2FilteringActionDays read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ReportAudienceInterestActionListV2FilteringActionDays.fromValue(value);
    }
  }
}

