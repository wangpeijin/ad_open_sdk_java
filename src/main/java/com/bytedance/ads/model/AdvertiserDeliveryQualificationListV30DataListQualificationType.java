/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(AdvertiserDeliveryQualificationListV30DataListQualificationType.Adapter.class)
public enum AdvertiserDeliveryQualificationListV30DataListQualificationType {
  
  AGENT_ARRANGEMENT("AGENT_ARRANGEMENT"),
  
  AUTHORIZATION_CONTRACT("AUTHORIZATION_CONTRACT"),
  
  DISTRIBUTION_AUTHORIZATION("DISTRIBUTION_AUTHORIZATION"),
  
  ICP_RECORD_AUTHORIZATION("ICP_RECORD_AUTHORIZATION"),
  
  OTHER_CERTIFICATION("OTHER_CERTIFICATION"),
  
  PATENT_CERTIFICATE("PATENT_CERTIFICATE"),
  
  PORTRAIT_AUTHORIZATION("PORTRAIT_AUTHORIZATION"),
  
  QUALITY_REPORT("QUALITY_REPORT"),
  
  SOFTWARE_COPYRIGHT_REGISTRATION_CERTIFICATE("SOFTWARE_COPYRIGHT_REGISTRATION_CERTIFICATE"),
  
  TRADEMARK_REGISTRATION_CERTIFICATE("TRADEMARK_REGISTRATION_CERTIFICATE"),
  
  VIDEO_MATERIAL_PRODUCTION_IP_AUTHORIZATION("VIDEO_MATERIAL_PRODUCTION_IP_AUTHORIZATION");

  private String value;

  AdvertiserDeliveryQualificationListV30DataListQualificationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserDeliveryQualificationListV30DataListQualificationType fromValue(String value) {
    for (AdvertiserDeliveryQualificationListV30DataListQualificationType b : AdvertiserDeliveryQualificationListV30DataListQualificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserDeliveryQualificationListV30DataListQualificationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserDeliveryQualificationListV30DataListQualificationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserDeliveryQualificationListV30DataListQualificationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserDeliveryQualificationListV30DataListQualificationType.fromValue(value);
    }
  }
}

