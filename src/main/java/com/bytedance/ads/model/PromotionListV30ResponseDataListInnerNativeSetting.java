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
import com.bytedance.ads.model.PromotionListV30DataListNativeSettingAnchorRelatedType;
import com.bytedance.ads.model.PromotionListV30DataListNativeSettingAwemeSettingType;
import com.bytedance.ads.model.PromotionListV30DataListNativeSettingIsFeedAndFavSee;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class PromotionListV30ResponseDataListInnerNativeSetting {
  public static final String SERIALIZED_NAME_ANCHOR_RELATED_TYPE = "anchor_related_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_RELATED_TYPE)
  private PromotionListV30DataListNativeSettingAnchorRelatedType anchorRelatedType = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_IDS = "aweme_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_IDS)
  private List<String> awemeIds = null;

  public static final String SERIALIZED_NAME_AWEME_SETTING_TYPE = "aweme_setting_type";
  @SerializedName(SERIALIZED_NAME_AWEME_SETTING_TYPE)
  private PromotionListV30DataListNativeSettingAwemeSettingType awemeSettingType = null;

  public static final String SERIALIZED_NAME_EXCLUDE_AWEME_IDS = "exclude_aweme_ids";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_AWEME_IDS)
  private List<String> excludeAwemeIds = null;

  public static final String SERIALIZED_NAME_IS_FEED_AND_FAV_SEE = "is_feed_and_fav_see";
  @SerializedName(SERIALIZED_NAME_IS_FEED_AND_FAV_SEE)
  private PromotionListV30DataListNativeSettingIsFeedAndFavSee isFeedAndFavSee = null;

  public PromotionListV30ResponseDataListInnerNativeSetting() {
  }

  public PromotionListV30ResponseDataListInnerNativeSetting anchorRelatedType(PromotionListV30DataListNativeSettingAnchorRelatedType anchorRelatedType) {
    
    this.anchorRelatedType = anchorRelatedType;
    return this;
  }

   /**
   * Get anchorRelatedType
   * @return anchorRelatedType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListNativeSettingAnchorRelatedType getAnchorRelatedType() {
    return anchorRelatedType;
  }


  public void setAnchorRelatedType(PromotionListV30DataListNativeSettingAnchorRelatedType anchorRelatedType) {
    this.anchorRelatedType = anchorRelatedType;
  }


  public PromotionListV30ResponseDataListInnerNativeSetting awemeId(String awemeId) {
    
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


  public PromotionListV30ResponseDataListInnerNativeSetting awemeIds(List<String> awemeIds) {
    
    this.awemeIds = awemeIds;
    return this;
  }

  public PromotionListV30ResponseDataListInnerNativeSetting addAwemeIdsItem(String awemeIdsItem) {
    if (this.awemeIds == null) {
      this.awemeIds = new ArrayList<>();
    }
    this.awemeIds.add(awemeIdsItem);
    return this;
  }

   /**
   * 
   * @return awemeIds
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeIds() {
    return awemeIds;
  }


  public void setAwemeIds(List<String> awemeIds) {
    this.awemeIds = awemeIds;
  }


  public PromotionListV30ResponseDataListInnerNativeSetting awemeSettingType(PromotionListV30DataListNativeSettingAwemeSettingType awemeSettingType) {
    
    this.awemeSettingType = awemeSettingType;
    return this;
  }

   /**
   * Get awemeSettingType
   * @return awemeSettingType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListNativeSettingAwemeSettingType getAwemeSettingType() {
    return awemeSettingType;
  }


  public void setAwemeSettingType(PromotionListV30DataListNativeSettingAwemeSettingType awemeSettingType) {
    this.awemeSettingType = awemeSettingType;
  }


  public PromotionListV30ResponseDataListInnerNativeSetting excludeAwemeIds(List<String> excludeAwemeIds) {
    
    this.excludeAwemeIds = excludeAwemeIds;
    return this;
  }

  public PromotionListV30ResponseDataListInnerNativeSetting addExcludeAwemeIdsItem(String excludeAwemeIdsItem) {
    if (this.excludeAwemeIds == null) {
      this.excludeAwemeIds = new ArrayList<>();
    }
    this.excludeAwemeIds.add(excludeAwemeIdsItem);
    return this;
  }

   /**
   * 
   * @return excludeAwemeIds
  **/
  @javax.annotation.Nullable
  public List<String> getExcludeAwemeIds() {
    return excludeAwemeIds;
  }


  public void setExcludeAwemeIds(List<String> excludeAwemeIds) {
    this.excludeAwemeIds = excludeAwemeIds;
  }


  public PromotionListV30ResponseDataListInnerNativeSetting isFeedAndFavSee(PromotionListV30DataListNativeSettingIsFeedAndFavSee isFeedAndFavSee) {
    
    this.isFeedAndFavSee = isFeedAndFavSee;
    return this;
  }

   /**
   * Get isFeedAndFavSee
   * @return isFeedAndFavSee
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListNativeSettingIsFeedAndFavSee getIsFeedAndFavSee() {
    return isFeedAndFavSee;
  }


  public void setIsFeedAndFavSee(PromotionListV30DataListNativeSettingIsFeedAndFavSee isFeedAndFavSee) {
    this.isFeedAndFavSee = isFeedAndFavSee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerNativeSetting promotionListV30ResponseDataListInnerNativeSetting = (PromotionListV30ResponseDataListInnerNativeSetting) o;
    return Objects.equals(this.anchorRelatedType, promotionListV30ResponseDataListInnerNativeSetting.anchorRelatedType) &&
        Objects.equals(this.awemeId, promotionListV30ResponseDataListInnerNativeSetting.awemeId) &&
        Objects.equals(this.awemeIds, promotionListV30ResponseDataListInnerNativeSetting.awemeIds) &&
        Objects.equals(this.awemeSettingType, promotionListV30ResponseDataListInnerNativeSetting.awemeSettingType) &&
        Objects.equals(this.excludeAwemeIds, promotionListV30ResponseDataListInnerNativeSetting.excludeAwemeIds) &&
        Objects.equals(this.isFeedAndFavSee, promotionListV30ResponseDataListInnerNativeSetting.isFeedAndFavSee);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorRelatedType, awemeId, awemeIds, awemeSettingType, excludeAwemeIds, isFeedAndFavSee);
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
    sb.append("class PromotionListV30ResponseDataListInnerNativeSetting {\n");
    sb.append("    anchorRelatedType: ").append(toIndentedString(anchorRelatedType)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeIds: ").append(toIndentedString(awemeIds)).append("\n");
    sb.append("    awemeSettingType: ").append(toIndentedString(awemeSettingType)).append("\n");
    sb.append("    excludeAwemeIds: ").append(toIndentedString(excludeAwemeIds)).append("\n");
    sb.append("    isFeedAndFavSee: ").append(toIndentedString(isFeedAndFavSee)).append("\n");
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
    openapiFields.add("anchor_related_type");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_ids");
    openapiFields.add("aweme_setting_type");
    openapiFields.add("exclude_aweme_ids");
    openapiFields.add("is_feed_and_fav_see");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerNativeSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerNativeSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerNativeSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerNativeSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerNativeSetting>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerNativeSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerNativeSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerNativeSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerNativeSetting
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerNativeSetting
  */
  public static PromotionListV30ResponseDataListInnerNativeSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerNativeSetting.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerNativeSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

