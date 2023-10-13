/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(AdvertiserQualificationGetV30DataSubjectQualificationType.Adapter.class)
public enum AdvertiserQualificationGetV30DataSubjectQualificationType {
  
  ASSOCIATION_REGISTER_CODE("ASSOCIATION_REGISTER_CODE"),
  
  COMMERCIAL_REGISTER_NUMBER("COMMERCIAL_REGISTER_NUMBER"),
  
  COMPANY_CREDIT_CODE("COMPANY_CREDIT_CODE"),
  
  COMPANY_REGISTER_CODE("COMPANY_REGISTER_CODE"),
  
  CREDIT_CODE("CREDIT_CODE"),
  
  HK_MACAO_TAIWAN_ID("HK_MACAO_TAIWAN_ID"),
  
  HK_REGISTER_CODE("HK_REGISTER_CODE"),
  
  ID("ID"),
  
  INDIVIDUAL_CREDIT_CODE("INDIVIDUAL_CREDIT_CODE"),
  
  INDIVIDUAL_REGISTER_CODE("INDIVIDUAL_REGISTER_CODE"),
  
  LAWYER_CERTIFICATE_NUMBER("LAWYER_CERTIFICATE_NUMBER"),
  
  LAWYER_PERMIT_CODE("LAWYER_PERMIT_CODE"),
  
  LEGAL_PERSON_CREDIT_CODE("LEGAL_PERSON_CREDIT_CODE"),
  
  ORGANIZATION_REGISTER_CODE("ORGANIZATION_REGISTER_CODE"),
  
  OTHER("OTHER"),
  
  OVERSEA_REGISTER_CODE("OVERSEA_REGISTER_CODE"),
  
  PASSPORT_ID("PASSPORT_ID"),
  
  SCHOOL_PERMIT_CODE("SCHOOL_PERMIT_CODE"),
  
  SOCIAL_REGISTER_CODE("SOCIAL_REGISTER_CODE");

  private String value;

  AdvertiserQualificationGetV30DataSubjectQualificationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserQualificationGetV30DataSubjectQualificationType fromValue(String value) {
    for (AdvertiserQualificationGetV30DataSubjectQualificationType b : AdvertiserQualificationGetV30DataSubjectQualificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserQualificationGetV30DataSubjectQualificationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserQualificationGetV30DataSubjectQualificationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserQualificationGetV30DataSubjectQualificationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserQualificationGetV30DataSubjectQualificationType.fromValue(value);
    }
  }
}

