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
import com.bytedance.ads.model.QianchuanAdCreateV10MultiProductCreativeListCreativeSettingCreativeAutoGenerate;
import com.bytedance.ads.model.QianchuanAdCreateV10MultiProductCreativeListCreativeSettingDynamicCreative;
import com.bytedance.ads.model.QianchuanAdCreateV10MultiProductCreativeListCreativeSettingIsHomepageHide;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting {
  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE = "creative_auto_generate";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE)
  private QianchuanAdCreateV10MultiProductCreativeListCreativeSettingCreativeAutoGenerate creativeAutoGenerate = null;

  public static final String SERIALIZED_NAME_CREATIVE_CATEGORY = "creative_category";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CATEGORY)
  private QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory creativeCategory = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE = "dynamic_creative";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE)
  private QianchuanAdCreateV10MultiProductCreativeListCreativeSettingDynamicCreative dynamicCreative = null;

  public static final String SERIALIZED_NAME_IS_HOMEPAGE_HIDE = "is_homepage_hide";
  @SerializedName(SERIALIZED_NAME_IS_HOMEPAGE_HIDE)
  private QianchuanAdCreateV10MultiProductCreativeListCreativeSettingIsHomepageHide isHomepageHide = null;

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting() {
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号id
   * minimum: 1
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting creativeAutoGenerate(QianchuanAdCreateV10MultiProductCreativeListCreativeSettingCreativeAutoGenerate creativeAutoGenerate) {
    
    this.creativeAutoGenerate = creativeAutoGenerate;
    return this;
  }

   /**
   * Get creativeAutoGenerate
   * @return creativeAutoGenerate
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10MultiProductCreativeListCreativeSettingCreativeAutoGenerate getCreativeAutoGenerate() {
    return creativeAutoGenerate;
  }


  public void setCreativeAutoGenerate(QianchuanAdCreateV10MultiProductCreativeListCreativeSettingCreativeAutoGenerate creativeAutoGenerate) {
    this.creativeAutoGenerate = creativeAutoGenerate;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting creativeCategory(QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory creativeCategory) {
    
    this.creativeCategory = creativeCategory;
    return this;
  }

   /**
   * Get creativeCategory
   * @return creativeCategory
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory getCreativeCategory() {
    return creativeCategory;
  }


  public void setCreativeCategory(QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory creativeCategory) {
    this.creativeCategory = creativeCategory;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting dynamicCreative(QianchuanAdCreateV10MultiProductCreativeListCreativeSettingDynamicCreative dynamicCreative) {
    
    this.dynamicCreative = dynamicCreative;
    return this;
  }

   /**
   * Get dynamicCreative
   * @return dynamicCreative
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10MultiProductCreativeListCreativeSettingDynamicCreative getDynamicCreative() {
    return dynamicCreative;
  }


  public void setDynamicCreative(QianchuanAdCreateV10MultiProductCreativeListCreativeSettingDynamicCreative dynamicCreative) {
    this.dynamicCreative = dynamicCreative;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting isHomepageHide(QianchuanAdCreateV10MultiProductCreativeListCreativeSettingIsHomepageHide isHomepageHide) {
    
    this.isHomepageHide = isHomepageHide;
    return this;
  }

   /**
   * Get isHomepageHide
   * @return isHomepageHide
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10MultiProductCreativeListCreativeSettingIsHomepageHide getIsHomepageHide() {
    return isHomepageHide;
  }


  public void setIsHomepageHide(QianchuanAdCreateV10MultiProductCreativeListCreativeSettingIsHomepageHide isHomepageHide) {
    this.isHomepageHide = isHomepageHide;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting = (QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting) o;
    return Objects.equals(this.adKeywords, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.adKeywords) &&
        Objects.equals(this.awemeId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.awemeId) &&
        Objects.equals(this.creativeAutoGenerate, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.creativeAutoGenerate) &&
        Objects.equals(this.creativeCategory, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.creativeCategory) &&
        Objects.equals(this.dynamicCreative, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.dynamicCreative) &&
        Objects.equals(this.isHomepageHide, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.isHomepageHide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adKeywords, awemeId, creativeAutoGenerate, creativeCategory, dynamicCreative, isHomepageHide);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting {\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    creativeAutoGenerate: ").append(toIndentedString(creativeAutoGenerate)).append("\n");
    sb.append("    creativeCategory: ").append(toIndentedString(creativeCategory)).append("\n");
    sb.append("    dynamicCreative: ").append(toIndentedString(dynamicCreative)).append("\n");
    sb.append("    isHomepageHide: ").append(toIndentedString(isHomepageHide)).append("\n");
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
    openapiFields.add("ad_keywords");
    openapiFields.add("aweme_id");
    openapiFields.add("creative_auto_generate");
    openapiFields.add("creative_category");
    openapiFields.add("dynamic_creative");
    openapiFields.add("is_homepage_hide");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting
  */
  public static QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

