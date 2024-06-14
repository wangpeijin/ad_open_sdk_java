/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(ToolsEstimateAudienceV2ArticleCategory.Adapter.class)
public enum ToolsEstimateAudienceV2ArticleCategory {
  
  SPORTS("SPORTS"),
  
  FINANCE("FINANCE"),
  
  WORKPLACE("WORKPLACE"),
  
  DIGITAL("DIGITAL"),
  
  HISTORY("HISTORY"),
  
  LOCAL("LOCAL"),
  
  AMUSEMENT("AMUSEMENT"),
  
  SCIENCE("SCIENCE"),
  
  HOME("HOME"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  CONSTELLATION("CONSTELLATION"),
  
  MILITARY("MILITARY"),
  
  FASHION("FASHION"),
  
  SOCIETY("SOCIETY"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  FREAK("FREAK"),
  
  DESIGN("DESIGN"),
  
  EMOTION("EMOTION"),
  
  COMICS("COMICS"),
  
  PARENTING("PARENTING"),
  
  GOVERNMENT("GOVERNMENT"),
  
  MOVIE("MOVIE"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  STORIES("STORIES"),
  
  ANIMATION("ANIMATION"),
  
  EDUCATION("EDUCATION"),
  
  PETS("PETS"),
  
  ESSAY("ESSAY"),
  
  REGIMEN("REGIMEN"),
  
  COLLECTION("COLLECTION"),
  
  ESTATE("ESTATE"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  EXPLORE("EXPLORE"),
  
  TIPS("TIPS"),
  
  LAWS("LAWS"),
  
  CARS("CARS"),
  
  BUSINESS("BUSINESS"),
  
  GOURMET("GOURMET"),
  
  HEALTH("HEALTH"),
  
  GRADUATES("GRADUATES"),
  
  GAMES("GAMES"),
  
  CULTURE("CULTURE"),
  
  TRAVEL("TRAVEL"),
  
  PHOTOGRAPHY("PHOTOGRAPHY");

  private String value;

  ToolsEstimateAudienceV2ArticleCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2ArticleCategory fromValue(String value) {
    for (ToolsEstimateAudienceV2ArticleCategory b : ToolsEstimateAudienceV2ArticleCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2ArticleCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2ArticleCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2ArticleCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2ArticleCategory.fromValue(value);
    }
  }
}

