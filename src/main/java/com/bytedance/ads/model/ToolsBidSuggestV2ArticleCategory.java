/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
  
  FINANCE("FINANCE"),
  
  SCIENCE("SCIENCE"),
  
  HEALTH("HEALTH"),
  
  CONSTELLATION("CONSTELLATION"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  HISTORY("HISTORY"),
  
  FREAK("FREAK"),
  
  HOME("HOME"),
  
  GAMES("GAMES"),
  
  SPORTS("SPORTS"),
  
  ESTATE("ESTATE"),
  
  EMOTION("EMOTION"),
  
  REGIMEN("REGIMEN"),
  
  DESIGN("DESIGN"),
  
  WORKPLACE("WORKPLACE"),
  
  TIPS("TIPS"),
  
  PETS("PETS"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  TRAVEL("TRAVEL"),
  
  GOURMET("GOURMET"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  ANIMATION("ANIMATION"),
  
  CARS("CARS"),
  
  MILITARY("MILITARY"),
  
  FASHION("FASHION"),
  
  DIGITAL("DIGITAL"),
  
  ESSAY("ESSAY"),
  
  GRADUATES("GRADUATES"),
  
  PARENTING("PARENTING"),
  
  LOCAL("LOCAL"),
  
  COMICS("COMICS"),
  
  AMUSEMENT("AMUSEMENT"),
  
  COLLECTION("COLLECTION"),
  
  SOCIETY("SOCIETY"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  CULTURE("CULTURE"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  GOVERNMENT("GOVERNMENT"),
  
  EXPLORE("EXPLORE"),
  
  STORIES("STORIES"),
  
  EDUCATION("EDUCATION"),
  
  BUSINESS("BUSINESS"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  LAWS("LAWS"),
  
  MOVIE("MOVIE");

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

