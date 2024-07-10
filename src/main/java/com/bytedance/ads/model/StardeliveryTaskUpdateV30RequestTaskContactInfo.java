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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class StardeliveryTaskUpdateV30RequestTaskContactInfo {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private Long contactId = null;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName = null;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact_phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone = null;

  public StardeliveryTaskUpdateV30RequestTaskContactInfo() {
  }

  public StardeliveryTaskUpdateV30RequestTaskContactInfo contactId(Long contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * 
   * @return contactId
  **/
  @javax.annotation.Nullable
  public Long getContactId() {
    return contactId;
  }


  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }


  public StardeliveryTaskUpdateV30RequestTaskContactInfo contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 
   * @return contactName
  **/
  @javax.annotation.Nullable
  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public StardeliveryTaskUpdateV30RequestTaskContactInfo contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 
   * @return contactPhone
  **/
  @javax.annotation.Nullable
  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskUpdateV30RequestTaskContactInfo stardeliveryTaskUpdateV30RequestTaskContactInfo = (StardeliveryTaskUpdateV30RequestTaskContactInfo) o;
    return Objects.equals(this.contactId, stardeliveryTaskUpdateV30RequestTaskContactInfo.contactId) &&
        Objects.equals(this.contactName, stardeliveryTaskUpdateV30RequestTaskContactInfo.contactName) &&
        Objects.equals(this.contactPhone, stardeliveryTaskUpdateV30RequestTaskContactInfo.contactPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactName, contactPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskUpdateV30RequestTaskContactInfo {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
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
    openapiFields.add("contact_id");
    openapiFields.add("contact_name");
    openapiFields.add("contact_phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskUpdateV30RequestTaskContactInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskUpdateV30RequestTaskContactInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskUpdateV30RequestTaskContactInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskUpdateV30RequestTaskContactInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskUpdateV30RequestTaskContactInfo>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskUpdateV30RequestTaskContactInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskUpdateV30RequestTaskContactInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskUpdateV30RequestTaskContactInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskUpdateV30RequestTaskContactInfo
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskUpdateV30RequestTaskContactInfo
  */
  public static StardeliveryTaskUpdateV30RequestTaskContactInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskUpdateV30RequestTaskContactInfo.class);
  }

 /**
  * Convert an instance of StardeliveryTaskUpdateV30RequestTaskContactInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

