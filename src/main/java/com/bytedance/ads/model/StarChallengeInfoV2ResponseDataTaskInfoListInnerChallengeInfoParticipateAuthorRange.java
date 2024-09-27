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
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRangeAuthorWatcherTag;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange {
  public static final String SERIALIZED_NAME_AUTHOR_UIDS = "author_uids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_UIDS)
  private List<Long> authorUids = null;

  public static final String SERIALIZED_NAME_AUTHOR_WATCHER_TAG = "author_watcher_tag";
  @SerializedName(SERIALIZED_NAME_AUTHOR_WATCHER_TAG)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag = null;

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

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange authorUids(List<Long> authorUids) {
    
    this.authorUids = authorUids;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange addAuthorUidsItem(Long authorUidsItem) {
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


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange authorWatcherTag(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag) {
    
    this.authorWatcherTag = authorWatcherTag;
    return this;
  }

   /**
   * Get authorWatcherTag
   * @return authorWatcherTag
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRangeAuthorWatcherTag getAuthorWatcherTag() {
    return authorWatcherTag;
  }


  public void setAuthorWatcherTag(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag) {
    this.authorWatcherTag = authorWatcherTag;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange contentTags(List<Long> contentTags) {
    
    this.contentTags = contentTags;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange addContentTagsItem(Long contentTagsItem) {
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


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange gender(List<String> gender) {
    
    this.gender = gender;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange addGenderItem(String genderItem) {
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


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange maxFollower(Long maxFollower) {
    
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


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange minFollower(Long minFollower) {
    
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


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange provinces(List<String> provinces) {
    
    this.provinces = provinces;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange addProvincesItem(String provincesItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange = (StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange) o;
    return Objects.equals(this.authorUids, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.authorUids) &&
        Objects.equals(this.authorWatcherTag, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.authorWatcherTag) &&
        Objects.equals(this.contentTags, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.contentTags) &&
        Objects.equals(this.gender, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.gender) &&
        Objects.equals(this.maxFollower, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.maxFollower) &&
        Objects.equals(this.minFollower, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.minFollower) &&
        Objects.equals(this.provinces, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.provinces);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorUids, authorWatcherTag, contentTags, gender, maxFollower, minFollower, provinces);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange {\n");
    sb.append("    authorUids: ").append(toIndentedString(authorUids)).append("\n");
    sb.append("    authorWatcherTag: ").append(toIndentedString(authorWatcherTag)).append("\n");
    sb.append("    contentTags: ").append(toIndentedString(contentTags)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maxFollower: ").append(toIndentedString(maxFollower)).append("\n");
    sb.append("    minFollower: ").append(toIndentedString(minFollower)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
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
    openapiFields.add("content_tags");
    openapiFields.add("gender");
    openapiFields.add("max_follower");
    openapiFields.add("min_follower");
    openapiFields.add("provinces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

