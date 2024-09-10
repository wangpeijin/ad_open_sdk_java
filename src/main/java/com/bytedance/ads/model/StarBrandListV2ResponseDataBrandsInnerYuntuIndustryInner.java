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
 * StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner() {
  }

  public StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner name(String name) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner starBrandListV2ResponseDataBrandsInnerYuntuIndustryInner = (StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner) o;
    return Objects.equals(this.id, starBrandListV2ResponseDataBrandsInnerYuntuIndustryInner.id) &&
        Objects.equals(this.name, starBrandListV2ResponseDataBrandsInnerYuntuIndustryInner.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
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
    sb.append("class StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner>() {
           @Override
           public void write(JsonWriter out, StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner
  * @throws IOException if the JSON string is invalid with respect to StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner
  */
  public static StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner.class);
  }

 /**
  * Convert an instance of StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

