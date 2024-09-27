/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(AdGetV2DataAudienceAutoExtendTargets.Adapter.class)
public enum AdGetV2DataAudienceAutoExtendTargets {
  
  GENDER("GENDER"),
  
  AD_TAG("AD_TAG"),
  
  CUSTOM_AUDIENCE("CUSTOM_AUDIENCE"),
  
  REGION("REGION"),
  
  INTEREST_TAG("INTEREST_TAG"),
  
  AGE("AGE");

  private String value;

  AdGetV2DataAudienceAutoExtendTargets(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceAutoExtendTargets fromValue(String value) {
    for (AdGetV2DataAudienceAutoExtendTargets b : AdGetV2DataAudienceAutoExtendTargets.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceAutoExtendTargets> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceAutoExtendTargets enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceAutoExtendTargets read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceAutoExtendTargets.fromValue(value);
    }
  }
}

