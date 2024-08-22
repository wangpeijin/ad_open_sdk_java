/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(AgentQueryRiskPromotionListV2DataDataMaterialListType.Adapter.class)
public enum AgentQueryRiskPromotionListV2DataDataMaterialListType {
  
  IMAGE("IMAGE"),
  
  VIDEO("VIDEO"),
  
  SITE("SITE");

  private String value;

  AgentQueryRiskPromotionListV2DataDataMaterialListType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentQueryRiskPromotionListV2DataDataMaterialListType fromValue(String value) {
    for (AgentQueryRiskPromotionListV2DataDataMaterialListType b : AgentQueryRiskPromotionListV2DataDataMaterialListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentQueryRiskPromotionListV2DataDataMaterialListType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentQueryRiskPromotionListV2DataDataMaterialListType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentQueryRiskPromotionListV2DataDataMaterialListType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentQueryRiskPromotionListV2DataDataMaterialListType.fromValue(value);
    }
  }
}

