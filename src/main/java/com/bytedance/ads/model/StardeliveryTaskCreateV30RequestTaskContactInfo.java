/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
 * 联系人姓名及手机号，请传入可接通的手机号 达人接单后，您可以通过虚拟电话与达人沟通
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StardeliveryTaskCreateV30RequestTaskContactInfo {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private Long contactId = null;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName = null;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact_phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone = null;

  public StardeliveryTaskCreateV30RequestTaskContactInfo() {
  }

  public StardeliveryTaskCreateV30RequestTaskContactInfo contactId(Long contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * 联系人ID，可通过「获取星广联投任务详情」接口查询，如传入联系人ID优先取ID（同时传入联系人姓名+手机号不生效）
   * @return contactId
  **/
  @javax.annotation.Nullable
  public Long getContactId() {
    return contactId;
  }


  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }


  public StardeliveryTaskCreateV30RequestTaskContactInfo contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 联系人姓名，1-50个字符，此信息将被用于XXXXX - 姓名需与手机号同时传入，只传入姓名会报错 - 达人接单后，您可以通过虚拟电话与达人沟通，传入手机号信息前请阅读《个人信息保护声明》
   * @return contactName
  **/
  @javax.annotation.Nullable
  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public StardeliveryTaskCreateV30RequestTaskContactInfo contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 联系人手机号，请传入可以接通的手机号。达人接单后，您可以通过虚拟电话与达人沟通，传入手机号信息前请阅读《个人信息保护声明》 - 姓名需与手机号同时传入，只传入手机号会报错
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
    StardeliveryTaskCreateV30RequestTaskContactInfo stardeliveryTaskCreateV30RequestTaskContactInfo = (StardeliveryTaskCreateV30RequestTaskContactInfo) o;
    return Objects.equals(this.contactId, stardeliveryTaskCreateV30RequestTaskContactInfo.contactId) &&
        Objects.equals(this.contactName, stardeliveryTaskCreateV30RequestTaskContactInfo.contactName) &&
        Objects.equals(this.contactPhone, stardeliveryTaskCreateV30RequestTaskContactInfo.contactPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactName, contactPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskCreateV30RequestTaskContactInfo {\n");
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
       if (!StardeliveryTaskCreateV30RequestTaskContactInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskCreateV30RequestTaskContactInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskCreateV30RequestTaskContactInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskCreateV30RequestTaskContactInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskCreateV30RequestTaskContactInfo>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskCreateV30RequestTaskContactInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskCreateV30RequestTaskContactInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskCreateV30RequestTaskContactInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskCreateV30RequestTaskContactInfo
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskCreateV30RequestTaskContactInfo
  */
  public static StardeliveryTaskCreateV30RequestTaskContactInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskCreateV30RequestTaskContactInfo.class);
  }

 /**
  * Convert an instance of StardeliveryTaskCreateV30RequestTaskContactInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

