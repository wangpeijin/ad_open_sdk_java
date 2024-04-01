/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend.Adapter.class)
public enum PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend {
  
  OFF("OFF"),
  
  ON("ON");

  private String value;

  PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend fromValue(String value) {
    for (PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend b : PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListPromotionMaterialsBlueFlowMaterialRecommend.fromValue(value);
    }
  }
}

