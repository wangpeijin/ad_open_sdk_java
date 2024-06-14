/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange {
  public static final String SERIALIZED_NAME_AUTHOR_UIDS = "author_uids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_UIDS)
  private List<Long> authorUids = null;

  public static final String SERIALIZED_NAME_AUTHOR_WATCHER_TAG = "author_watcher_tag";
  @SerializedName(SERIALIZED_NAME_AUTHOR_WATCHER_TAG)
  private StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag = null;

  public static final String SERIALIZED_NAME_CANCEL_AUTHOR_UIDS = "cancel_author_uids";
  @SerializedName(SERIALIZED_NAME_CANCEL_AUTHOR_UIDS)
  private List<Long> cancelAuthorUids = null;

  public static final String SERIALIZED_NAME_CANCEL_UNIQUE_IDS = "cancel_unique_ids";
  @SerializedName(SERIALIZED_NAME_CANCEL_UNIQUE_IDS)
  private List<String> cancelUniqueIds = null;

  public static final String SERIALIZED_NAME_CONTENT_TAGS = "content_tags";
  @SerializedName(SERIALIZED_NAME_CONTENT_TAGS)
  private List<Long> contentTags = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private List<String> gender = null;

  public static final String SERIALIZED_NAME_MAX_FOLLOWER = "max_follower";
  @SerializedName(SERIALIZED_NAME_MAX_FOLLOWER)
  private Long maxFollower = null;

  public static final String SERIALIZED_NAME_MIN_FOLLOWER = "min_follower";
  @SerializedName(SERIALIZED_NAME_MIN_FOLLOWER)
  private Long minFollower = null;

  public static final String SERIALIZED_NAME_PROVINCES = "provinces";
  @SerializedName(SERIALIZED_NAME_PROVINCES)
  private List<String> provinces = null;

  public static final String SERIALIZED_NAME_UNIQUE_IDS = "unique_ids";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDS)
  private List<String> uniqueIds = null;

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange() {
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange authorUids(List<Long> authorUids) {
    
    this.authorUids = authorUids;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange addAuthorUidsItem(Long authorUidsItem) {
    if (this.authorUids == null) {
      this.authorUids = new ArrayList<>();
    }
    this.authorUids.add(authorUidsItem);
    return this;
  }

   /**
   * 
   * @return authorUids
  **/
  @javax.annotation.Nullable
  public List<Long> getAuthorUids() {
    return authorUids;
  }


  public void setAuthorUids(List<Long> authorUids) {
    this.authorUids = authorUids;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange authorWatcherTag(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag) {
    
    this.authorWatcherTag = authorWatcherTag;
    return this;
  }

   /**
   * Get authorWatcherTag
   * @return authorWatcherTag
  **/
  @javax.annotation.Nullable
  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag getAuthorWatcherTag() {
    return authorWatcherTag;
  }


  public void setAuthorWatcherTag(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag) {
    this.authorWatcherTag = authorWatcherTag;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange cancelAuthorUids(List<Long> cancelAuthorUids) {
    
    this.cancelAuthorUids = cancelAuthorUids;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange addCancelAuthorUidsItem(Long cancelAuthorUidsItem) {
    if (this.cancelAuthorUids == null) {
      this.cancelAuthorUids = new ArrayList<>();
    }
    this.cancelAuthorUids.add(cancelAuthorUidsItem);
    return this;
  }

   /**
   * 
   * @return cancelAuthorUids
  **/
  @javax.annotation.Nullable
  public List<Long> getCancelAuthorUids() {
    return cancelAuthorUids;
  }


  public void setCancelAuthorUids(List<Long> cancelAuthorUids) {
    this.cancelAuthorUids = cancelAuthorUids;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange cancelUniqueIds(List<String> cancelUniqueIds) {
    
    this.cancelUniqueIds = cancelUniqueIds;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange addCancelUniqueIdsItem(String cancelUniqueIdsItem) {
    if (this.cancelUniqueIds == null) {
      this.cancelUniqueIds = new ArrayList<>();
    }
    this.cancelUniqueIds.add(cancelUniqueIdsItem);
    return this;
  }

   /**
   * 
   * @return cancelUniqueIds
  **/
  @javax.annotation.Nullable
  public List<String> getCancelUniqueIds() {
    return cancelUniqueIds;
  }


  public void setCancelUniqueIds(List<String> cancelUniqueIds) {
    this.cancelUniqueIds = cancelUniqueIds;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange contentTags(List<Long> contentTags) {
    
    this.contentTags = contentTags;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange addContentTagsItem(Long contentTagsItem) {
    if (this.contentTags == null) {
      this.contentTags = new ArrayList<>();
    }
    this.contentTags.add(contentTagsItem);
    return this;
  }

   /**
   * 
   * @return contentTags
  **/
  @javax.annotation.Nullable
  public List<Long> getContentTags() {
    return contentTags;
  }


  public void setContentTags(List<Long> contentTags) {
    this.contentTags = contentTags;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange gender(List<String> gender) {
    
    this.gender = gender;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }
    this.gender.add(genderItem);
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @javax.annotation.Nullable
  public List<String> getGender() {
    return gender;
  }


  public void setGender(List<String> gender) {
    this.gender = gender;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange maxFollower(Long maxFollower) {
    
    this.maxFollower = maxFollower;
    return this;
  }

   /**
   * 
   * @return maxFollower
  **/
  @javax.annotation.Nullable
  public Long getMaxFollower() {
    return maxFollower;
  }


  public void setMaxFollower(Long maxFollower) {
    this.maxFollower = maxFollower;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange minFollower(Long minFollower) {
    
    this.minFollower = minFollower;
    return this;
  }

   /**
   * 
   * @return minFollower
  **/
  @javax.annotation.Nullable
  public Long getMinFollower() {
    return minFollower;
  }


  public void setMinFollower(Long minFollower) {
    this.minFollower = minFollower;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange provinces(List<String> provinces) {
    
    this.provinces = provinces;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange addProvincesItem(String provincesItem) {
    if (this.provinces == null) {
      this.provinces = new ArrayList<>();
    }
    this.provinces.add(provincesItem);
    return this;
  }

   /**
   * 
   * @return provinces
  **/
  @javax.annotation.Nullable
  public List<String> getProvinces() {
    return provinces;
  }


  public void setProvinces(List<String> provinces) {
    this.provinces = provinces;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange uniqueIds(List<String> uniqueIds) {
    
    this.uniqueIds = uniqueIds;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange addUniqueIdsItem(String uniqueIdsItem) {
    if (this.uniqueIds == null) {
      this.uniqueIds = new ArrayList<>();
    }
    this.uniqueIds.add(uniqueIdsItem);
    return this;
  }

   /**
   * 
   * @return uniqueIds
  **/
  @javax.annotation.Nullable
  public List<String> getUniqueIds() {
    return uniqueIds;
  }


  public void setUniqueIds(List<String> uniqueIds) {
    this.uniqueIds = uniqueIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange = (StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange) o;
    return Objects.equals(this.authorUids, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.authorUids) &&
        Objects.equals(this.authorWatcherTag, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.authorWatcherTag) &&
        Objects.equals(this.cancelAuthorUids, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.cancelAuthorUids) &&
        Objects.equals(this.cancelUniqueIds, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.cancelUniqueIds) &&
        Objects.equals(this.contentTags, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.contentTags) &&
        Objects.equals(this.gender, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.gender) &&
        Objects.equals(this.maxFollower, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.maxFollower) &&
        Objects.equals(this.minFollower, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.minFollower) &&
        Objects.equals(this.provinces, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.provinces) &&
        Objects.equals(this.uniqueIds, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.uniqueIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorUids, authorWatcherTag, cancelAuthorUids, cancelUniqueIds, contentTags, gender, maxFollower, minFollower, provinces, uniqueIds);
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
    sb.append("class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange {\n");
    sb.append("    authorUids: ").append(toIndentedString(authorUids)).append("\n");
    sb.append("    authorWatcherTag: ").append(toIndentedString(authorWatcherTag)).append("\n");
    sb.append("    cancelAuthorUids: ").append(toIndentedString(cancelAuthorUids)).append("\n");
    sb.append("    cancelUniqueIds: ").append(toIndentedString(cancelUniqueIds)).append("\n");
    sb.append("    contentTags: ").append(toIndentedString(contentTags)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maxFollower: ").append(toIndentedString(maxFollower)).append("\n");
    sb.append("    minFollower: ").append(toIndentedString(minFollower)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
    sb.append("    uniqueIds: ").append(toIndentedString(uniqueIds)).append("\n");
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
    openapiFields.add("author_uids");
    openapiFields.add("author_watcher_tag");
    openapiFields.add("cancel_author_uids");
    openapiFields.add("cancel_unique_ids");
    openapiFields.add("content_tags");
    openapiFields.add("gender");
    openapiFields.add("max_follower");
    openapiFields.add("min_follower");
    openapiFields.add("provinces");
    openapiFields.add("unique_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange
  */
  public static StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

