/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo {
  public static final String SERIALIZED_NAME_TOTAL_PLATFORM_FEE = "total_platform_fee";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLATFORM_FEE)
  private Long totalPlatformFee = null;

  public static final String SERIALIZED_NAME_TOTAL_TASK_COST = "total_task_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASK_COST)
  private Long totalTaskCost = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo totalPlatformFee(Long totalPlatformFee) {
    
    this.totalPlatformFee = totalPlatformFee;
    return this;
  }

   /**
   * 
   * @return totalPlatformFee
  **/
  @javax.annotation.Nullable
  public Long getTotalPlatformFee() {
    return totalPlatformFee;
  }


  public void setTotalPlatformFee(Long totalPlatformFee) {
    this.totalPlatformFee = totalPlatformFee;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo totalTaskCost(Long totalTaskCost) {
    
    this.totalTaskCost = totalTaskCost;
    return this;
  }

   /**
   * 
   * @return totalTaskCost
  **/
  @javax.annotation.Nullable
  public Long getTotalTaskCost() {
    return totalTaskCost;
  }


  public void setTotalTaskCost(Long totalTaskCost) {
    this.totalTaskCost = totalTaskCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo = (StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo) o;
    return Objects.equals(this.totalPlatformFee, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo.totalPlatformFee) &&
        Objects.equals(this.totalTaskCost, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo.totalTaskCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPlatformFee, totalTaskCost);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo {\n");
    sb.append("    totalPlatformFee: ").append(toIndentedString(totalPlatformFee)).append("\n");
    sb.append("    totalTaskCost: ").append(toIndentedString(totalTaskCost)).append("\n");
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
    openapiFields.add("total_platform_fee");
    openapiFields.add("total_task_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

