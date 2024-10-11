/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ToolsAwemeAuthListV2DataListVideoInfoImageMode.Adapter.class)
public enum ToolsAwemeAuthListV2DataListVideoInfoImageMode {
  
  AWEME_PHOTO("AWEME_PHOTO"),
  
  CREATIVE_IMAGE_MODE_AWEME_LIVE("CREATIVE_IMAGE_MODE_AWEME_LIVE"),
  
  CREATIVE_IMAGE_MODE_DISPLAY_WINDOW("CREATIVE_IMAGE_MODE_DISPLAY_WINDOW"),
  
  CREATIVE_IMAGE_MODE_GIF("CREATIVE_IMAGE_MODE_GIF"),
  
  CREATIVE_IMAGE_MODE_GROUP("CREATIVE_IMAGE_MODE_GROUP"),
  
  CREATIVE_IMAGE_MODE_LARGE("CREATIVE_IMAGE_MODE_LARGE"),
  
  CREATIVE_IMAGE_MODE_LARGE_VERTICAL("CREATIVE_IMAGE_MODE_LARGE_VERTICAL"),
  
  CREATIVE_IMAGE_MODE_PLAYABLE_HORIZONTAL("CREATIVE_IMAGE_MODE_PLAYABLE_HORIZONTAL"),
  
  CREATIVE_IMAGE_MODE_PLAYABLE_VERTICAL("CREATIVE_IMAGE_MODE_PLAYABLE_VERTICAL"),
  
  CREATIVE_IMAGE_MODE_SMALL("CREATIVE_IMAGE_MODE_SMALL"),
  
  CREATIVE_IMAGE_MODE_UNION_SPLASH("CREATIVE_IMAGE_MODE_UNION_SPLASH"),
  
  CREATIVE_IMAGE_MODE_UNION_SPLASH_VIDEO("CREATIVE_IMAGE_MODE_UNION_SPLASH_VIDEO"),
  
  CREATIVE_IMAGE_MODE_VIDEO("CREATIVE_IMAGE_MODE_VIDEO"),
  
  CREATIVE_IMAGE_MODE_VIDEO_VERTICAL("CREATIVE_IMAGE_MODE_VIDEO_VERTICAL"),
  
  SEARCH_AD_SMALL_IMAGE("SEARCH_AD_SMALL_IMAGE"),
  
  TOUTIAO_SEARCH_AD_IMAGE("TOUTIAO_SEARCH_AD_IMAGE");

  private String value;

  ToolsAwemeAuthListV2DataListVideoInfoImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeAuthListV2DataListVideoInfoImageMode fromValue(String value) {
    for (ToolsAwemeAuthListV2DataListVideoInfoImageMode b : ToolsAwemeAuthListV2DataListVideoInfoImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeAuthListV2DataListVideoInfoImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeAuthListV2DataListVideoInfoImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeAuthListV2DataListVideoInfoImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeAuthListV2DataListVideoInfoImageMode.fromValue(value);
    }
  }
}

