/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
 * StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner {
  public static final String SERIALIZED_NAME_PACK_ID = "pack_id";
  @SerializedName(SERIALIZED_NAME_PACK_ID)
  private Long packId = null;

  public static final String SERIALIZED_NAME_PACK_NAME = "pack_name";
  @SerializedName(SERIALIZED_NAME_PACK_NAME)
  private String packName = null;

  public StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner() {
  }

  public StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner packId(Long packId) {
    
    this.packId = packId;
    return this;
  }

   /**
   * 人群包ID
   * @return packId
  **/
  @javax.annotation.Nullable
  public Long getPackId() {
    return packId;
  }


  public void setPackId(Long packId) {
    this.packId = packId;
  }


  public StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner packName(String packName) {
    
    this.packName = packName;
    return this;
  }

   /**
   * 人群包名称
   * @return packName
  **/
  @javax.annotation.Nullable
  public String getPackName() {
    return packName;
  }


  public void setPackName(String packName) {
    this.packName = packName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner starVasGetCommonAuthorPackageListV2ResponseDataPacksInner = (StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner) o;
    return Objects.equals(this.packId, starVasGetCommonAuthorPackageListV2ResponseDataPacksInner.packId) &&
        Objects.equals(this.packName, starVasGetCommonAuthorPackageListV2ResponseDataPacksInner.packName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packId, packName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner {\n");
    sb.append("    packId: ").append(toIndentedString(packId)).append("\n");
    sb.append("    packName: ").append(toIndentedString(packName)).append("\n");
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
    openapiFields.add("pack_id");
    openapiFields.add("pack_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pack_id");
    openapiRequiredFields.add("pack_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner>() {
           @Override
           public void write(JsonWriter out, StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner
  * @throws IOException if the JSON string is invalid with respect to StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner
  */
  public static StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner.class);
  }

 /**
  * Convert an instance of StarVasGetCommonAuthorPackageListV2ResponseDataPacksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

