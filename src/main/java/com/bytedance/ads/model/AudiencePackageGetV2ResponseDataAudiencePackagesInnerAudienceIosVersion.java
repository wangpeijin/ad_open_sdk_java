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
public class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion {
  public static final String SERIALIZED_NAME_OP = "op";
  @SerializedName(SERIALIZED_NAME_OP)
  private String op = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value = null;

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion() {
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion op(String op) {
    
    this.op = op;
    return this;
  }

   /**
   * 
   * @return op
  **/
  @javax.annotation.Nullable
  public String getOp() {
    return op;
  }


  public void setOp(String op) {
    this.op = op;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion = (AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion) o;
    return Objects.equals(this.op, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion.op) &&
        Objects.equals(this.value, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, value);
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
    sb.append("class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("op");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion>() {
           @Override
           public void write(JsonWriter out, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion
  */
  public static AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion.class);
  }

 /**
  * Convert an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceIosVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

