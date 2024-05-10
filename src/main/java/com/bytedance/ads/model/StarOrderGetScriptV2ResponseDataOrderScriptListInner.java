/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInner;
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
 * StarOrderGetScriptV2ResponseDataOrderScriptListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class StarOrderGetScriptV2ResponseDataOrderScriptListInner {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_SCRIPT_LIST = "script_list";
  @SerializedName(SERIALIZED_NAME_SCRIPT_LIST)
  private List<StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInner> scriptList = null;

  public StarOrderGetScriptV2ResponseDataOrderScriptListInner() {
  }

  public StarOrderGetScriptV2ResponseDataOrderScriptListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单id
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarOrderGetScriptV2ResponseDataOrderScriptListInner scriptList(List<StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInner> scriptList) {
    
    this.scriptList = scriptList;
    return this;
  }

  public StarOrderGetScriptV2ResponseDataOrderScriptListInner addScriptListItem(StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInner scriptListItem) {
    if (this.scriptList == null) {
      this.scriptList = new ArrayList<>();
    }
    this.scriptList.add(scriptListItem);
    return this;
  }

   /**
   * 
   * @return scriptList
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInner> getScriptList() {
    return scriptList;
  }


  public void setScriptList(List<StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInner> scriptList) {
    this.scriptList = scriptList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetScriptV2ResponseDataOrderScriptListInner starOrderGetScriptV2ResponseDataOrderScriptListInner = (StarOrderGetScriptV2ResponseDataOrderScriptListInner) o;
    return Objects.equals(this.orderId, starOrderGetScriptV2ResponseDataOrderScriptListInner.orderId) &&
        Objects.equals(this.scriptList, starOrderGetScriptV2ResponseDataOrderScriptListInner.scriptList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, scriptList);
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
    sb.append("class StarOrderGetScriptV2ResponseDataOrderScriptListInner {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    scriptList: ").append(toIndentedString(scriptList)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("script_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetScriptV2ResponseDataOrderScriptListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetScriptV2ResponseDataOrderScriptListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetScriptV2ResponseDataOrderScriptListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetScriptV2ResponseDataOrderScriptListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetScriptV2ResponseDataOrderScriptListInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetScriptV2ResponseDataOrderScriptListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetScriptV2ResponseDataOrderScriptListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetScriptV2ResponseDataOrderScriptListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetScriptV2ResponseDataOrderScriptListInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetScriptV2ResponseDataOrderScriptListInner
  */
  public static StarOrderGetScriptV2ResponseDataOrderScriptListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetScriptV2ResponseDataOrderScriptListInner.class);
  }

 /**
  * Convert an instance of StarOrderGetScriptV2ResponseDataOrderScriptListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

