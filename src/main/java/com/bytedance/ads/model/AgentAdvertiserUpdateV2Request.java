/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
 * AgentAdvertiserUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class AgentAdvertiserUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CONTACTER = "contacter";
  @SerializedName(SERIALIZED_NAME_CONTACTER)
  private String contacter = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note = null;

  public static final String SERIALIZED_NAME_PHONENUMBER = "phonenumber";
  @SerializedName(SERIALIZED_NAME_PHONENUMBER)
  private String phonenumber = null;

  public AgentAdvertiserUpdateV2Request() {
  }

  public AgentAdvertiserUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AgentAdvertiserUpdateV2Request contacter(String contacter) {
    
    this.contacter = contacter;
    return this;
  }

   /**
   * 
   * @return contacter
  **/
  @javax.annotation.Nullable
  public String getContacter() {
    return contacter;
  }


  public void setContacter(String contacter) {
    this.contacter = contacter;
  }


  public AgentAdvertiserUpdateV2Request email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AgentAdvertiserUpdateV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AgentAdvertiserUpdateV2Request note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * 
   * @return note
  **/
  @javax.annotation.Nullable
  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public AgentAdvertiserUpdateV2Request phonenumber(String phonenumber) {
    
    this.phonenumber = phonenumber;
    return this;
  }

   /**
   * 
   * @return phonenumber
  **/
  @javax.annotation.Nullable
  public String getPhonenumber() {
    return phonenumber;
  }


  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvertiserUpdateV2Request agentAdvertiserUpdateV2Request = (AgentAdvertiserUpdateV2Request) o;
    return Objects.equals(this.advertiserId, agentAdvertiserUpdateV2Request.advertiserId) &&
        Objects.equals(this.contacter, agentAdvertiserUpdateV2Request.contacter) &&
        Objects.equals(this.email, agentAdvertiserUpdateV2Request.email) &&
        Objects.equals(this.name, agentAdvertiserUpdateV2Request.name) &&
        Objects.equals(this.note, agentAdvertiserUpdateV2Request.note) &&
        Objects.equals(this.phonenumber, agentAdvertiserUpdateV2Request.phonenumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, contacter, email, name, note, phonenumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvertiserUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    contacter: ").append(toIndentedString(contacter)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    phonenumber: ").append(toIndentedString(phonenumber)).append("\n");
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
    openapiFields.add("contacter");
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("note");
    openapiFields.add("phonenumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserUpdateV2Request
  */
  public static AgentAdvertiserUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserUpdateV2Request.class);
  }

 /**
  * Convert an instance of AgentAdvertiserUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

