/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
  
  STORIES("STORIES"),
  
  PETS("PETS"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  LAWS("LAWS"),
  
  CARS("CARS"),
  
  CONSTELLATION("CONSTELLATION"),
  
  TRAVEL("TRAVEL"),
  
  EMOTION("EMOTION"),
  
  GAMES("GAMES"),
  
  COMICS("COMICS"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  TIPS("TIPS"),
  
  FASHION("FASHION"),
  
  SPORTS("SPORTS"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  MOVIE("MOVIE"),
  
  REGIMEN("REGIMEN"),
  
  AMUSEMENT("AMUSEMENT"),
  
  HEALTH("HEALTH"),
  
  BUSINESS("BUSINESS"),
  
  PARENTING("PARENTING"),
  
  GRADUATES("GRADUATES"),
  
  CULTURE("CULTURE"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  LOCAL("LOCAL"),
  
  ESSAY("ESSAY"),
  
  FINANCE("FINANCE"),
  
  ESTATE("ESTATE"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  EXPLORE("EXPLORE"),
  
  ANIMATION("ANIMATION"),
  
  HISTORY("HISTORY"),
  
  SCIENCE("SCIENCE"),
  
  FREAK("FREAK"),
  
  GOURMET("GOURMET"),
  
  SOCIETY("SOCIETY"),
  
  DESIGN("DESIGN"),
  
  HOME("HOME"),
  
  DIGITAL("DIGITAL"),
  
  GOVERNMENT("GOVERNMENT"),
  
  WORKPLACE("WORKPLACE"),
  
  COLLECTION("COLLECTION"),
  
  EDUCATION("EDUCATION"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  MILITARY("MILITARY");

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

