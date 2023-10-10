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
@JsonAdapter(QianchuanAudienceListGetV10DataAudiencesListAudienceType.Adapter.class)
public enum QianchuanAudienceListGetV10DataAudiencesListAudienceType {
  
  BASIC("BASIC"),
  
  EXTEND("EXTEND"),
  
  UPLOAD("UPLOAD");

  private String value;

  QianchuanAudienceListGetV10DataAudiencesListAudienceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAudienceListGetV10DataAudiencesListAudienceType fromValue(String value) {
    for (QianchuanAudienceListGetV10DataAudiencesListAudienceType b : QianchuanAudienceListGetV10DataAudiencesListAudienceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAudienceListGetV10DataAudiencesListAudienceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAudienceListGetV10DataAudiencesListAudienceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAudienceListGetV10DataAudiencesListAudienceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAudienceListGetV10DataAudiencesListAudienceType.fromValue(value);
    }
  }
}
