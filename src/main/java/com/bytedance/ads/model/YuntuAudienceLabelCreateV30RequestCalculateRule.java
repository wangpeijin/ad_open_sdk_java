/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30CalculateRuleFieldFilters;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30RequestCalculateRuleBehaviorFilters;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * 计算规则
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class YuntuAudienceLabelCreateV30RequestCalculateRule {
  public static final String SERIALIZED_NAME_BEHAVIOR_FILTERS = "behavior_filters";
  @SerializedName(SERIALIZED_NAME_BEHAVIOR_FILTERS)
  private YuntuAudienceLabelCreateV30RequestCalculateRuleBehaviorFilters behaviorFilters = null;

  public static final String SERIALIZED_NAME_FIELD_FILTERS = "field_filters";
  @SerializedName(SERIALIZED_NAME_FIELD_FILTERS)
  private List<YuntuAudienceLabelCreateV30CalculateRuleFieldFilters> fieldFilters = null;

  public static final String SERIALIZED_NAME_ITEM_FILTERS = "item_filters";
  @SerializedName(SERIALIZED_NAME_ITEM_FILTERS)
  private YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters itemFilters = null;

  public static final String SERIALIZED_NAME_WORD_RULE = "word_rule";
  @SerializedName(SERIALIZED_NAME_WORD_RULE)
  private YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule wordRule = null;

  public YuntuAudienceLabelCreateV30RequestCalculateRule() {
  }

  public YuntuAudienceLabelCreateV30RequestCalculateRule behaviorFilters(YuntuAudienceLabelCreateV30RequestCalculateRuleBehaviorFilters behaviorFilters) {
    
    this.behaviorFilters = behaviorFilters;
    return this;
  }

   /**
   * Get behaviorFilters
   * @return behaviorFilters
  **/
  @javax.annotation.Nonnull
  public YuntuAudienceLabelCreateV30RequestCalculateRuleBehaviorFilters getBehaviorFilters() {
    return behaviorFilters;
  }


  public void setBehaviorFilters(YuntuAudienceLabelCreateV30RequestCalculateRuleBehaviorFilters behaviorFilters) {
    this.behaviorFilters = behaviorFilters;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRule fieldFilters(List<YuntuAudienceLabelCreateV30CalculateRuleFieldFilters> fieldFilters) {
    
    this.fieldFilters = fieldFilters;
    return this;
  }

  public YuntuAudienceLabelCreateV30RequestCalculateRule addFieldFiltersItem(YuntuAudienceLabelCreateV30CalculateRuleFieldFilters fieldFiltersItem) {
    if (this.fieldFilters == null) {
      this.fieldFilters = new ArrayList<>();
    }
    this.fieldFilters.add(fieldFiltersItem);
    return this;
  }

   /**
   * 匹配方式。其中内容人群标签下，title 必选，额外可多选 ocr_content 及 asr_content；搜索人群标签固定为 query；商品人群标签固定为 product_name。 title &#x3D; 内容标题ocr,asr, query,product_name(商品名称)
   * @return fieldFilters
  **/
  @javax.annotation.Nonnull
  public List<YuntuAudienceLabelCreateV30CalculateRuleFieldFilters> getFieldFilters() {
    return fieldFilters;
  }


  public void setFieldFilters(List<YuntuAudienceLabelCreateV30CalculateRuleFieldFilters> fieldFilters) {
    this.fieldFilters = fieldFilters;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRule itemFilters(YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters itemFilters) {
    
    this.itemFilters = itemFilters;
    return this;
  }

   /**
   * Get itemFilters
   * @return itemFilters
  **/
  @javax.annotation.Nonnull
  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters getItemFilters() {
    return itemFilters;
  }


  public void setItemFilters(YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters itemFilters) {
    this.itemFilters = itemFilters;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRule wordRule(YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule wordRule) {
    
    this.wordRule = wordRule;
    return this;
  }

   /**
   * Get wordRule
   * @return wordRule
  **/
  @javax.annotation.Nonnull
  public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule getWordRule() {
    return wordRule;
  }


  public void setWordRule(YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule wordRule) {
    this.wordRule = wordRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuAudienceLabelCreateV30RequestCalculateRule yuntuAudienceLabelCreateV30RequestCalculateRule = (YuntuAudienceLabelCreateV30RequestCalculateRule) o;
    return Objects.equals(this.behaviorFilters, yuntuAudienceLabelCreateV30RequestCalculateRule.behaviorFilters) &&
        Objects.equals(this.fieldFilters, yuntuAudienceLabelCreateV30RequestCalculateRule.fieldFilters) &&
        Objects.equals(this.itemFilters, yuntuAudienceLabelCreateV30RequestCalculateRule.itemFilters) &&
        Objects.equals(this.wordRule, yuntuAudienceLabelCreateV30RequestCalculateRule.wordRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behaviorFilters, fieldFilters, itemFilters, wordRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceLabelCreateV30RequestCalculateRule {\n");
    sb.append("    behaviorFilters: ").append(toIndentedString(behaviorFilters)).append("\n");
    sb.append("    fieldFilters: ").append(toIndentedString(fieldFilters)).append("\n");
    sb.append("    itemFilters: ").append(toIndentedString(itemFilters)).append("\n");
    sb.append("    wordRule: ").append(toIndentedString(wordRule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("behavior_filters");
    openapiFields.add("field_filters");
    openapiFields.add("item_filters");
    openapiFields.add("word_rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("behavior_filters");
    openapiRequiredFields.add("field_filters");
    openapiRequiredFields.add("item_filters");
    openapiRequiredFields.add("word_rule");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceLabelCreateV30RequestCalculateRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceLabelCreateV30RequestCalculateRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceLabelCreateV30RequestCalculateRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceLabelCreateV30RequestCalculateRule.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceLabelCreateV30RequestCalculateRule>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceLabelCreateV30RequestCalculateRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceLabelCreateV30RequestCalculateRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceLabelCreateV30RequestCalculateRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceLabelCreateV30RequestCalculateRule
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceLabelCreateV30RequestCalculateRule
  */
  public static YuntuAudienceLabelCreateV30RequestCalculateRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceLabelCreateV30RequestCalculateRule.class);
  }

 /**
  * Convert an instance of YuntuAudienceLabelCreateV30RequestCalculateRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

