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
@JsonAdapter(ToolsBidSuggestV2ArticleCategory.Adapter.class)
public enum ToolsBidSuggestV2ArticleCategory {
  
  MILITARY("MILITARY"),
  
  CARS("CARS"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  AMUSEMENT("AMUSEMENT"),
  
  PETS("PETS"),
  
  HISTORY("HISTORY"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  CONSTELLATION("CONSTELLATION"),
  
  SOCIETY("SOCIETY"),
  
  STORIES("STORIES"),
  
  ANIMATION("ANIMATION"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  SPORTS("SPORTS"),
  
  FASHION("FASHION"),
  
  COLLECTION("COLLECTION"),
  
  HOME("HOME"),
  
  LAWS("LAWS"),
  
  WORKPLACE("WORKPLACE"),
  
  REGIMEN("REGIMEN"),
  
  EDUCATION("EDUCATION"),
  
  TIPS("TIPS"),
  
  ESSAY("ESSAY"),
  
  SCIENCE("SCIENCE"),
  
  COMICS("COMICS"),
  
  GOURMET("GOURMET"),
  
  BUSINESS("BUSINESS"),
  
  GAMES("GAMES"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  LOCAL("LOCAL"),
  
  DIGITAL("DIGITAL"),
  
  CULTURE("CULTURE"),
  
  FREAK("FREAK"),
  
  DESIGN("DESIGN"),
  
  EXPLORE("EXPLORE"),
  
  MOVIE("MOVIE"),
  
  FINANCE("FINANCE"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  HEALTH("HEALTH"),
  
  PARENTING("PARENTING"),
  
  GOVERNMENT("GOVERNMENT"),
  
  GRADUATES("GRADUATES"),
  
  ESTATE("ESTATE"),
  
  EMOTION("EMOTION"),
  
  TRAVEL("TRAVEL");

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

