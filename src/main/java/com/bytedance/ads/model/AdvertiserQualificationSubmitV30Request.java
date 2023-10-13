/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserQualificationSubmitV30RequestIndustriesInner;
import com.bytedance.ads.model.AdvertiserQualificationSubmitV30RequestSubject;
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
 * AdvertiserQualificationSubmitV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class AdvertiserQualificationSubmitV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_INDUSTRIES = "industries";
  @SerializedName(SERIALIZED_NAME_INDUSTRIES)
  private List<AdvertiserQualificationSubmitV30RequestIndustriesInner> industries = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private AdvertiserQualificationSubmitV30RequestSubject subject = null;

  public AdvertiserQualificationSubmitV30Request() {
  }

  public AdvertiserQualificationSubmitV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserQualificationSubmitV30Request industries(List<AdvertiserQualificationSubmitV30RequestIndustriesInner> industries) {
    
    this.industries = industries;
    return this;
  }

  public AdvertiserQualificationSubmitV30Request addIndustriesItem(AdvertiserQualificationSubmitV30RequestIndustriesInner industriesItem) {
    if (this.industries == null) {
      this.industries = new ArrayList<>();
    }
    this.industries.add(industriesItem);
    return this;
  }

   /**
   * 行业资质
   * @return industries
  **/
  @javax.annotation.Nullable
  public List<AdvertiserQualificationSubmitV30RequestIndustriesInner> getIndustries() {
    return industries;
  }


  public void setIndustries(List<AdvertiserQualificationSubmitV30RequestIndustriesInner> industries) {
    this.industries = industries;
  }


  public AdvertiserQualificationSubmitV30Request subject(AdvertiserQualificationSubmitV30RequestSubject subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationSubmitV30RequestSubject getSubject() {
    return subject;
  }


  public void setSubject(AdvertiserQualificationSubmitV30RequestSubject subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserQualificationSubmitV30Request advertiserQualificationSubmitV30Request = (AdvertiserQualificationSubmitV30Request) o;
    return Objects.equals(this.advertiserId, advertiserQualificationSubmitV30Request.advertiserId) &&
        Objects.equals(this.industries, advertiserQualificationSubmitV30Request.industries) &&
        Objects.equals(this.subject, advertiserQualificationSubmitV30Request.subject);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, industries, subject);
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
    sb.append("class AdvertiserQualificationSubmitV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("industries");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("subject");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationSubmitV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationSubmitV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationSubmitV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationSubmitV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationSubmitV30Request>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationSubmitV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationSubmitV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationSubmitV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationSubmitV30Request
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationSubmitV30Request
  */
  public static AdvertiserQualificationSubmitV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationSubmitV30Request.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationSubmitV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

