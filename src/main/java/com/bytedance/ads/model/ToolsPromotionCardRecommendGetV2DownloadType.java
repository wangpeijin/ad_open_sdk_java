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
@JsonAdapter(ToolsPromotionCardRecommendGetV2DownloadType.Adapter.class)
public enum ToolsPromotionCardRecommendGetV2DownloadType {
  
  QUICK_APP_URL("QUICK_APP_URL"),
  
  DOWNLOAD_URL("DOWNLOAD_URL"),
  
  EXTERNAL_URL("EXTERNAL_URL");

  private String value;

  ToolsPromotionCardRecommendGetV2DownloadType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionCardRecommendGetV2DownloadType fromValue(String value) {
    for (ToolsPromotionCardRecommendGetV2DownloadType b : ToolsPromotionCardRecommendGetV2DownloadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionCardRecommendGetV2DownloadType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionCardRecommendGetV2DownloadType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionCardRecommendGetV2DownloadType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionCardRecommendGetV2DownloadType.fromValue(value);
    }
  }
}

