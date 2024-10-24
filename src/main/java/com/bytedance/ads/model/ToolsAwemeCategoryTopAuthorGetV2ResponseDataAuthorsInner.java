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
 * ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner {
  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName = null;

  public static final String SERIALIZED_NAME_COVER_NUM_STR = "cover_num_str";
  @SerializedName(SERIALIZED_NAME_COVER_NUM_STR)
  private String coverNumStr = null;

  public static final String SERIALIZED_NAME_LABEL_ID = "label_id";
  @SerializedName(SERIALIZED_NAME_LABEL_ID)
  private Long labelId = null;

  public static final String SERIALIZED_NAME_TOTAL_FANS_NUM_STR = "total_fans_num_str";
  @SerializedName(SERIALIZED_NAME_TOTAL_FANS_NUM_STR)
  private String totalFansNumStr = null;

  public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner() {
  }

  public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner avatar(String avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * 
   * @return avatar
  **/
  @javax.annotation.Nullable
  public String getAvatar() {
    return avatar;
  }


  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner coverNumStr(String coverNumStr) {
    
    this.coverNumStr = coverNumStr;
    return this;
  }

   /**
   * 
   * @return coverNumStr
  **/
  @javax.annotation.Nullable
  public String getCoverNumStr() {
    return coverNumStr;
  }


  public void setCoverNumStr(String coverNumStr) {
    this.coverNumStr = coverNumStr;
  }


  public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner labelId(Long labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * 
   * @return labelId
  **/
  @javax.annotation.Nullable
  public Long getLabelId() {
    return labelId;
  }


  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }


  public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner totalFansNumStr(String totalFansNumStr) {
    
    this.totalFansNumStr = totalFansNumStr;
    return this;
  }

   /**
   * 
   * @return totalFansNumStr
  **/
  @javax.annotation.Nullable
  public String getTotalFansNumStr() {
    return totalFansNumStr;
  }


  public void setTotalFansNumStr(String totalFansNumStr) {
    this.totalFansNumStr = totalFansNumStr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner toolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner = (ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner) o;
    return Objects.equals(this.authorName, toolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.authorName) &&
        Objects.equals(this.avatar, toolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.avatar) &&
        Objects.equals(this.awemeId, toolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.awemeId) &&
        Objects.equals(this.categoryName, toolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.categoryName) &&
        Objects.equals(this.coverNumStr, toolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.coverNumStr) &&
        Objects.equals(this.labelId, toolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.labelId) &&
        Objects.equals(this.totalFansNumStr, toolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.totalFansNumStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorName, avatar, awemeId, categoryName, coverNumStr, labelId, totalFansNumStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner {\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    coverNumStr: ").append(toIndentedString(coverNumStr)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    totalFansNumStr: ").append(toIndentedString(totalFansNumStr)).append("\n");
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
    openapiFields.add("author_name");
    openapiFields.add("avatar");
    openapiFields.add("aweme_id");
    openapiFields.add("category_name");
    openapiFields.add("cover_num_str");
    openapiFields.add("label_id");
    openapiFields.add("total_fans_num_str");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner
  */
  public static ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

