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
@JsonAdapter(AdvertiserInfoV2DataRole.Adapter.class)
public enum AdvertiserInfoV2DataRole {
  
  DOUDIAN_ADVERTISER("ROLE_DOUDIAN_ADVERTISER"),
  
  LOCAL_LIFE_VIRTUAL_ADVERTISER("ROLE_LOCAL_LIFE_VIRTUAL_ADVERTISER"),
  
  AGENT_ABSTRACT("ROLE_AGENT_ABSTRACT"),
  
  ECP_INTERNAL_ADVERTISER("ROLE_ECP_INTERNAL_ADVERTISER"),
  
  ECP_ADVERTISER("ROLE_ECP_ADVERTISER"),
  
  ADVERTISER("ROLE_ADVERTISER"),
  
  ECP_CHILD_ADVERTISER("ROLE_ECP_CHILD_ADVERTISER"),
  
  HOTSOON_PROMOTION_ADVERTISER("ROLE_HOTSOON_PROMOTION_ADVERTISER"),
  
  LITE_ADVERTISER("ROLE_LITE_ADVERTISER"),
  
  LOCAL_LIFE_ADVERTISER("ROLE_LOCAL_LIFE_ADVERTISER"),
  
  AGENT("ROLE_AGENT"),
  
  PGC_ADVERTISER("ROLE_PGC_ADVERTISER"),
  
  AGENT_SYSTEM_ACCOUNT("ROLE_AGENT_SYSTEM_ACCOUNT"),
  
  ADVERTISER_ABSTRACT("ROLE_ADVERTISER_ABSTRACT"),
  
  ADMIN("ROLE_ADMIN"),
  
  ADVERTISER_SYSTEM_ACCOUNT("ROLE_ADVERTISER_SYSTEM_ACCOUNT"),
  
  AWEME_PROMOTION_ADVERTISER("ROLE_AWEME_PROMOTION_ADVERTISER"),
  
  LOCAL_LIFE_INTERNAL_ADVERTISER("ROLE_LOCAL_LIFE_INTERNAL_ADVERTISER"),
  
  HOTSOON_ADVERTISER("ROLE_HOTSOON_ADVERTISER"),
  
  INTERNAL_ADV("ROLE_INTERNAL_ADV"),
  
  DSP_ADVERTISER("ROLE_DSP_ADVERTISER"),
  
  CHILD_ADVERTISER("ROLE_CHILD_ADVERTISER"),
  
  MAJORDOMO("ROLE_MAJORDOMO"),
  
  CHILD_AGENT("ROLE_CHILD_AGENT");

  private String value;

  AdvertiserInfoV2DataRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserInfoV2DataRole fromValue(String value) {
    for (AdvertiserInfoV2DataRole b : AdvertiserInfoV2DataRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserInfoV2DataRole> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserInfoV2DataRole enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserInfoV2DataRole read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserInfoV2DataRole.fromValue(value);
    }
  }
}

