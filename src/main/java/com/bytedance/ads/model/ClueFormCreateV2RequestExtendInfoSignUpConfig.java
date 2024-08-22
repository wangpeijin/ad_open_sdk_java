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
import com.bytedance.ads.model.ClueFormCreateV2ExtendInfoSignUpConfigSignType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class ClueFormCreateV2RequestExtendInfoSignUpConfig {
  public static final String SERIALIZED_NAME_SIGN_TYPE = "sign_type";
  @SerializedName(SERIALIZED_NAME_SIGN_TYPE)
  private ClueFormCreateV2ExtendInfoSignUpConfigSignType signType = null;

  public ClueFormCreateV2RequestExtendInfoSignUpConfig() {
  }

  public ClueFormCreateV2RequestExtendInfoSignUpConfig signType(ClueFormCreateV2ExtendInfoSignUpConfigSignType signType) {
    
    this.signType = signType;
    return this;
  }

   /**
   * Get signType
   * @return signType
  **/
  @javax.annotation.Nullable
  public ClueFormCreateV2ExtendInfoSignUpConfigSignType getSignType() {
    return signType;
  }


  public void setSignType(ClueFormCreateV2ExtendInfoSignUpConfigSignType signType) {
    this.signType = signType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueFormCreateV2RequestExtendInfoSignUpConfig clueFormCreateV2RequestExtendInfoSignUpConfig = (ClueFormCreateV2RequestExtendInfoSignUpConfig) o;
    return Objects.equals(this.signType, clueFormCreateV2RequestExtendInfoSignUpConfig.signType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueFormCreateV2RequestExtendInfoSignUpConfig {\n");
    sb.append("    signType: ").append(toIndentedString(signType)).append("\n");
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
    openapiFields.add("sign_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueFormCreateV2RequestExtendInfoSignUpConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueFormCreateV2RequestExtendInfoSignUpConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueFormCreateV2RequestExtendInfoSignUpConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueFormCreateV2RequestExtendInfoSignUpConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueFormCreateV2RequestExtendInfoSignUpConfig>() {
           @Override
           public void write(JsonWriter out, ClueFormCreateV2RequestExtendInfoSignUpConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueFormCreateV2RequestExtendInfoSignUpConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueFormCreateV2RequestExtendInfoSignUpConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueFormCreateV2RequestExtendInfoSignUpConfig
  * @throws IOException if the JSON string is invalid with respect to ClueFormCreateV2RequestExtendInfoSignUpConfig
  */
  public static ClueFormCreateV2RequestExtendInfoSignUpConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueFormCreateV2RequestExtendInfoSignUpConfig.class);
  }

 /**
  * Convert an instance of ClueFormCreateV2RequestExtendInfoSignUpConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

