/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner {
  public static final String SERIALIZED_NAME_QUAL_TYPE = "qual_type";
  @SerializedName(SERIALIZED_NAME_QUAL_TYPE)
  private Long qualType = null;

  public static final String SERIALIZED_NAME_QUAL_TYPE_NAME = "qual_type_name";
  @SerializedName(SERIALIZED_NAME_QUAL_TYPE_NAME)
  private String qualTypeName = null;

  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner() {
  }

  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner qualType(Long qualType) {
    
    this.qualType = qualType;
    return this;
  }

   /**
   * 资质类型id
   * @return qualType
  **/
  @javax.annotation.Nullable
  public Long getQualType() {
    return qualType;
  }


  public void setQualType(Long qualType) {
    this.qualType = qualType;
  }


  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner qualTypeName(String qualTypeName) {
    
    this.qualTypeName = qualTypeName;
    return this;
  }

   /**
   * 资质类型名称
   * @return qualTypeName
  **/
  @javax.annotation.Nullable
  public String getQualTypeName() {
    return qualTypeName;
  }


  public void setQualTypeName(String qualTypeName) {
    this.qualTypeName = qualTypeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner = (AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner) o;
    return Objects.equals(this.qualType, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner.qualType) &&
        Objects.equals(this.qualTypeName, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner.qualTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualType, qualTypeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner {\n");
    sb.append("    qualType: ").append(toIndentedString(qualType)).append("\n");
    sb.append("    qualTypeName: ").append(toIndentedString(qualTypeName)).append("\n");
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
    openapiFields.add("qual_type");
    openapiFields.add("qual_type_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("qual_type");
    openapiRequiredFields.add("qual_type_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner
  */
  public static AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

