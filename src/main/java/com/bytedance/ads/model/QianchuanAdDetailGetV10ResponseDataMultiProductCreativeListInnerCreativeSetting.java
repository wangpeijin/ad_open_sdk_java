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
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingDynamicCreative;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingIsHomepageHide;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSettingCreativeCategory;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting {
  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE = "creative_auto_generate";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE)
  private QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate creativeAutoGenerate = null;

  public static final String SERIALIZED_NAME_CREATIVE_CATEGORY = "creative_category";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CATEGORY)
  private QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSettingCreativeCategory creativeCategory = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE = "dynamic_creative";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE)
  private QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingDynamicCreative dynamicCreative = null;

  public static final String SERIALIZED_NAME_IS_HOMEPAGE_HIDE = "is_homepage_hide";
  @SerializedName(SERIALIZED_NAME_IS_HOMEPAGE_HIDE)
  private QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingIsHomepageHide isHomepageHide = null;

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting() {
  }

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting addAdKeywordsItem(String adKeywordsItem) {
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


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号id
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting creativeAutoGenerate(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate creativeAutoGenerate) {
    
    this.creativeAutoGenerate = creativeAutoGenerate;
    return this;
  }

   /**
   * Get creativeAutoGenerate
   * @return creativeAutoGenerate
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate getCreativeAutoGenerate() {
    return creativeAutoGenerate;
  }


  public void setCreativeAutoGenerate(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate creativeAutoGenerate) {
    this.creativeAutoGenerate = creativeAutoGenerate;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting creativeCategory(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSettingCreativeCategory creativeCategory) {
    
    this.creativeCategory = creativeCategory;
    return this;
  }

   /**
   * Get creativeCategory
   * @return creativeCategory
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSettingCreativeCategory getCreativeCategory() {
    return creativeCategory;
  }


  public void setCreativeCategory(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSettingCreativeCategory creativeCategory) {
    this.creativeCategory = creativeCategory;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting dynamicCreative(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingDynamicCreative dynamicCreative) {
    
    this.dynamicCreative = dynamicCreative;
    return this;
  }

   /**
   * Get dynamicCreative
   * @return dynamicCreative
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingDynamicCreative getDynamicCreative() {
    return dynamicCreative;
  }


  public void setDynamicCreative(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingDynamicCreative dynamicCreative) {
    this.dynamicCreative = dynamicCreative;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting isHomepageHide(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingIsHomepageHide isHomepageHide) {
    
    this.isHomepageHide = isHomepageHide;
    return this;
  }

   /**
   * Get isHomepageHide
   * @return isHomepageHide
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingIsHomepageHide getIsHomepageHide() {
    return isHomepageHide;
  }


  public void setIsHomepageHide(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingIsHomepageHide isHomepageHide) {
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
    QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting = (QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting) o;
    return Objects.equals(this.adKeywords, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.adKeywords) &&
        Objects.equals(this.awemeId, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.awemeId) &&
        Objects.equals(this.creativeAutoGenerate, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.creativeAutoGenerate) &&
        Objects.equals(this.creativeCategory, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.creativeCategory) &&
        Objects.equals(this.dynamicCreative, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.dynamicCreative) &&
        Objects.equals(this.isHomepageHide, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.isHomepageHide);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adKeywords, awemeId, creativeAutoGenerate, creativeCategory, dynamicCreative, isHomepageHide);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting {\n");
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
       if (!QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting
  */
  public static QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

