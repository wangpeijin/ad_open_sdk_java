/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(ToolsBidSuggestV2ArticleCategory.Adapter.class)
public enum ToolsBidSuggestV2ArticleCategory {
  
  HEALTH("HEALTH"),
  
  CARS("CARS"),
  
  DIGITAL("DIGITAL"),
  
  GAMES("GAMES"),
  
  GRADUATES("GRADUATES"),
  
  MILITARY("MILITARY"),
  
  COMICS("COMICS"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  EDUCATION("EDUCATION"),
  
  PARENTING("PARENTING"),
  
  MOVIE("MOVIE"),
  
  TRAVEL("TRAVEL"),
  
  FREAK("FREAK"),
  
  EMOTION("EMOTION"),
  
  HOME("HOME"),
  
  CONSTELLATION("CONSTELLATION"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  COLLECTION("COLLECTION"),
  
  REGIMEN("REGIMEN"),
  
  CULTURE("CULTURE"),
  
  ANIMATION("ANIMATION"),
  
  EXPLORE("EXPLORE"),
  
  BUSINESS("BUSINESS"),
  
  FASHION("FASHION"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  SPORTS("SPORTS"),
  
  AMUSEMENT("AMUSEMENT"),
  
  LOCAL("LOCAL"),
  
  STORIES("STORIES"),
  
  FINANCE("FINANCE"),
  
  TIPS("TIPS"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  HISTORY("HISTORY"),
  
  PETS("PETS"),
  
  WORKPLACE("WORKPLACE"),
  
  ESSAY("ESSAY"),
  
  GOVERNMENT("GOVERNMENT"),
  
  ESTATE("ESTATE"),
  
  LAWS("LAWS"),
  
  SCIENCE("SCIENCE"),
  
  SOCIETY("SOCIETY"),
  
  GOURMET("GOURMET"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  DESIGN("DESIGN");

  private String value;

  ToolsBidSuggestV2ArticleCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2ArticleCategory fromValue(String value) {
    for (ToolsBidSuggestV2ArticleCategory b : ToolsBidSuggestV2ArticleCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2ArticleCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2ArticleCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2ArticleCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2ArticleCategory.fromValue(value);
    }
  }
}

