/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory {
  public static final String SERIALIZED_NAME_FIRST_CATEGORY_ID = "first_category_id";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_ID)
  private Long firstCategoryId = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_ID = "second_industry_id";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_ID)
  private Long secondIndustryId = null;

  public static final String SERIALIZED_NAME_THIRD_INDUSTRY_ID = "third_industry_id";
  @SerializedName(SERIALIZED_NAME_THIRD_INDUSTRY_ID)
  private Long thirdIndustryId = null;

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory() {
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory firstCategoryId(Long firstCategoryId) {
    
    this.firstCategoryId = firstCategoryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return firstCategoryId
  **/
  @javax.annotation.Nullable
  public Long getFirstCategoryId() {
    return firstCategoryId;
  }


  public void setFirstCategoryId(Long firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory secondIndustryId(Long secondIndustryId) {
    
    this.secondIndustryId = secondIndustryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return secondIndustryId
  **/
  @javax.annotation.Nullable
  public Long getSecondIndustryId() {
    return secondIndustryId;
  }


  public void setSecondIndustryId(Long secondIndustryId) {
    this.secondIndustryId = secondIndustryId;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory thirdIndustryId(Long thirdIndustryId) {
    
    this.thirdIndustryId = thirdIndustryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return thirdIndustryId
  **/
  @javax.annotation.Nullable
  public Long getThirdIndustryId() {
    return thirdIndustryId;
  }


  public void setThirdIndustryId(Long thirdIndustryId) {
    this.thirdIndustryId = thirdIndustryId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory = (QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory) o;
    return Objects.equals(this.firstCategoryId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory.firstCategoryId) &&
        Objects.equals(this.secondIndustryId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory.secondIndustryId) &&
        Objects.equals(this.thirdIndustryId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory.thirdIndustryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstCategoryId, secondIndustryId, thirdIndustryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory {\n");
    sb.append("    firstCategoryId: ").append(toIndentedString(firstCategoryId)).append("\n");
    sb.append("    secondIndustryId: ").append(toIndentedString(secondIndustryId)).append("\n");
    sb.append("    thirdIndustryId: ").append(toIndentedString(thirdIndustryId)).append("\n");
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
    openapiFields.add("first_category_id");
    openapiFields.add("second_industry_id");
    openapiFields.add("third_industry_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory
  */
  public static QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSettingCreativeCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

