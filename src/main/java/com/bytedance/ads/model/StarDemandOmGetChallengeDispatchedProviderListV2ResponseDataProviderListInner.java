/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
 * StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner {
  public static final String SERIALIZED_NAME_CAN_CANCEL_COOPERATE = "can_cancel_cooperate";
  @SerializedName(SERIALIZED_NAME_CAN_CANCEL_COOPERATE)
  private Boolean canCancelCooperate = null;

  public static final String SERIALIZED_NAME_HAS_PROVIDER_RECEIVED = "has_provider_received";
  @SerializedName(SERIALIZED_NAME_HAS_PROVIDER_RECEIVED)
  private Boolean hasProviderReceived = null;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "provider_id";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private Long providerId = null;

  public StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner() {
  }

  public StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner canCancelCooperate(Boolean canCancelCooperate) {
    
    this.canCancelCooperate = canCancelCooperate;
    return this;
  }

   /**
   * 是否可以和服务商取消合作
   * @return canCancelCooperate
  **/
  @javax.annotation.Nullable
  public Boolean getCanCancelCooperate() {
    return canCancelCooperate;
  }


  public void setCanCancelCooperate(Boolean canCancelCooperate) {
    this.canCancelCooperate = canCancelCooperate;
  }


  public StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner hasProviderReceived(Boolean hasProviderReceived) {
    
    this.hasProviderReceived = hasProviderReceived;
    return this;
  }

   /**
   * 服务商是否接单
   * @return hasProviderReceived
  **/
  @javax.annotation.Nullable
  public Boolean getHasProviderReceived() {
    return hasProviderReceived;
  }


  public void setHasProviderReceived(Boolean hasProviderReceived) {
    this.hasProviderReceived = hasProviderReceived;
  }


  public StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner providerId(Long providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * 
   * @return providerId
  **/
  @javax.annotation.Nullable
  public Long getProviderId() {
    return providerId;
  }


  public void setProviderId(Long providerId) {
    this.providerId = providerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner starDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner = (StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner) o;
    return Objects.equals(this.canCancelCooperate, starDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner.canCancelCooperate) &&
        Objects.equals(this.hasProviderReceived, starDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner.hasProviderReceived) &&
        Objects.equals(this.providerId, starDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner.providerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(canCancelCooperate, hasProviderReceived, providerId);
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
    sb.append("class StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner {\n");
    sb.append("    canCancelCooperate: ").append(toIndentedString(canCancelCooperate)).append("\n");
    sb.append("    hasProviderReceived: ").append(toIndentedString(hasProviderReceived)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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
    openapiFields.add("can_cancel_cooperate");
    openapiFields.add("has_provider_received");
    openapiFields.add("provider_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner
  */
  public static StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeDispatchedProviderListV2ResponseDataProviderListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

