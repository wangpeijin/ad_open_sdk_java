/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class QianchuanTrackUrlCheckV10ResponseData {
  public static final String SERIALIZED_NAME_FAIL_TRACK_URL = "fail_track_url";
  @SerializedName(SERIALIZED_NAME_FAIL_TRACK_URL)
  private List<QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner> failTrackUrl = null;

  public static final String SERIALIZED_NAME_SUC_TRACK_URL = "suc_track_url";
  @SerializedName(SERIALIZED_NAME_SUC_TRACK_URL)
  private List<String> sucTrackUrl = null;

  public QianchuanTrackUrlCheckV10ResponseData() {
  }

  public QianchuanTrackUrlCheckV10ResponseData failTrackUrl(List<QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner> failTrackUrl) {
    
    this.failTrackUrl = failTrackUrl;
    return this;
  }

  public QianchuanTrackUrlCheckV10ResponseData addFailTrackUrlItem(QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner failTrackUrlItem) {
    if (this.failTrackUrl == null) {
      this.failTrackUrl = new ArrayList<>();
    }
    this.failTrackUrl.add(failTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return failTrackUrl
  **/
  @javax.annotation.Nullable
  public List<QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner> getFailTrackUrl() {
    return failTrackUrl;
  }


  public void setFailTrackUrl(List<QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner> failTrackUrl) {
    this.failTrackUrl = failTrackUrl;
  }


  public QianchuanTrackUrlCheckV10ResponseData sucTrackUrl(List<String> sucTrackUrl) {
    
    this.sucTrackUrl = sucTrackUrl;
    return this;
  }

  public QianchuanTrackUrlCheckV10ResponseData addSucTrackUrlItem(String sucTrackUrlItem) {
    if (this.sucTrackUrl == null) {
      this.sucTrackUrl = new ArrayList<>();
    }
    this.sucTrackUrl.add(sucTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return sucTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getSucTrackUrl() {
    return sucTrackUrl;
  }


  public void setSucTrackUrl(List<String> sucTrackUrl) {
    this.sucTrackUrl = sucTrackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanTrackUrlCheckV10ResponseData qianchuanTrackUrlCheckV10ResponseData = (QianchuanTrackUrlCheckV10ResponseData) o;
    return Objects.equals(this.failTrackUrl, qianchuanTrackUrlCheckV10ResponseData.failTrackUrl) &&
        Objects.equals(this.sucTrackUrl, qianchuanTrackUrlCheckV10ResponseData.sucTrackUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failTrackUrl, sucTrackUrl);
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
    sb.append("class QianchuanTrackUrlCheckV10ResponseData {\n");
    sb.append("    failTrackUrl: ").append(toIndentedString(failTrackUrl)).append("\n");
    sb.append("    sucTrackUrl: ").append(toIndentedString(sucTrackUrl)).append("\n");
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
    openapiFields.add("fail_track_url");
    openapiFields.add("suc_track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("suc_track_url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanTrackUrlCheckV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanTrackUrlCheckV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanTrackUrlCheckV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanTrackUrlCheckV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanTrackUrlCheckV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanTrackUrlCheckV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanTrackUrlCheckV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanTrackUrlCheckV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanTrackUrlCheckV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanTrackUrlCheckV10ResponseData
  */
  public static QianchuanTrackUrlCheckV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanTrackUrlCheckV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanTrackUrlCheckV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

