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
@JsonAdapter(ToolsBidSuggestV2ArticleCategory.Adapter.class)
public enum ToolsBidSuggestV2ArticleCategory {
  
  WORKPLACE("WORKPLACE"),
  
  GOURMET("GOURMET"),
  
  LAWS("LAWS"),
  
  ANIMATION("ANIMATION"),
  
  BUSINESS("BUSINESS"),
  
  SOCIETY("SOCIETY"),
  
  ESSAY("ESSAY"),
  
  MILITARY("MILITARY"),
  
  COMICS("COMICS"),
  
  DESIGN("DESIGN"),
  
  HEALTH("HEALTH"),
  
  FASHION("FASHION"),
  
  EDUCATION("EDUCATION"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  CARS("CARS"),
  
  PARENTING("PARENTING"),
  
  STORIES("STORIES"),
  
  FREAK("FREAK"),
  
  DIGITAL("DIGITAL"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  LOCAL("LOCAL"),
  
  PETS("PETS"),
  
  GRADUATES("GRADUATES"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  MOVIE("MOVIE"),
  
  HOME("HOME"),
  
  FINANCE("FINANCE"),
  
  GOVERNMENT("GOVERNMENT"),
  
  SCIENCE("SCIENCE"),
  
  SPORTS("SPORTS"),
  
  CONSTELLATION("CONSTELLATION"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  GAMES("GAMES"),
  
  AMUSEMENT("AMUSEMENT"),
  
  ESTATE("ESTATE"),
  
  REGIMEN("REGIMEN"),
  
  CULTURE("CULTURE"),
  
  EXPLORE("EXPLORE"),
  
  HISTORY("HISTORY"),
  
  EMOTION("EMOTION"),
  
  TRAVEL("TRAVEL"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  COLLECTION("COLLECTION"),
  
  TIPS("TIPS"),
  
  RUMOR_CRACKER("RUMOR_CRACKER");

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

