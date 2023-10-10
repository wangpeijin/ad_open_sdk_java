/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
 * ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner {
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

  public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner() {
  }

  public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner authorName(String authorName) {
    
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


  public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner avatar(String avatar) {
    
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


  public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner awemeId(String awemeId) {
    
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


  public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner categoryName(String categoryName) {
    
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


  public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner coverNumStr(String coverNumStr) {
    
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


  public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner labelId(Long labelId) {
    
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


  public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner totalFansNumStr(String totalFansNumStr) {
    
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
    ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner toolsAwemeSimilarAuthorSearchV2ResponseDataListInner = (ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner) o;
    return Objects.equals(this.authorName, toolsAwemeSimilarAuthorSearchV2ResponseDataListInner.authorName) &&
        Objects.equals(this.avatar, toolsAwemeSimilarAuthorSearchV2ResponseDataListInner.avatar) &&
        Objects.equals(this.awemeId, toolsAwemeSimilarAuthorSearchV2ResponseDataListInner.awemeId) &&
        Objects.equals(this.categoryName, toolsAwemeSimilarAuthorSearchV2ResponseDataListInner.categoryName) &&
        Objects.equals(this.coverNumStr, toolsAwemeSimilarAuthorSearchV2ResponseDataListInner.coverNumStr) &&
        Objects.equals(this.labelId, toolsAwemeSimilarAuthorSearchV2ResponseDataListInner.labelId) &&
        Objects.equals(this.totalFansNumStr, toolsAwemeSimilarAuthorSearchV2ResponseDataListInner.totalFansNumStr);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorName, avatar, awemeId, categoryName, coverNumStr, labelId, totalFansNumStr);
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
    sb.append("class ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner {\n");
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
       if (!ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner
  */
  public static ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeSimilarAuthorSearchV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

