/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner {
  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Long brandId = null;

  public static final String SERIALIZED_NAME_BRAND_LOGO = "brand_logo";
  @SerializedName(SERIALIZED_NAME_BRAND_LOGO)
  private String brandLogo = null;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner() {
  }

  public QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner brandLogo(String brandLogo) {
    
    this.brandLogo = brandLogo;
    return this;
  }

   /**
   * 
   * @return brandLogo
  **/
  @javax.annotation.Nullable
  public String getBrandLogo() {
    return brandLogo;
  }


  public void setBrandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
  }


  public QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner qianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner = (QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner) o;
    return Objects.equals(this.brandId, qianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner.brandId) &&
        Objects.equals(this.brandLogo, qianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner.brandLogo) &&
        Objects.equals(this.brandName, qianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner.brandName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandLogo, brandName);
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
    sb.append("class QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandLogo: ").append(toIndentedString(brandLogo)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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
    openapiFields.add("brand_id");
    openapiFields.add("brand_logo");
    openapiFields.add("brand_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner
  */
  public static QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanBrandAuthorizedGetV10ResponseDataBrandInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

