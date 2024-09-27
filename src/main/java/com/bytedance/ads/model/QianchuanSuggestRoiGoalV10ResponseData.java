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
public class QianchuanSuggestRoiGoalV10ResponseData {
  public static final String SERIALIZED_NAME_ECP_ROI_GOAL = "ecp_roi_goal";
  @SerializedName(SERIALIZED_NAME_ECP_ROI_GOAL)
  private Double ecpRoiGoal = null;

  public static final String SERIALIZED_NAME_ROI_LOWER_BOUND = "roi_lower_bound";
  @SerializedName(SERIALIZED_NAME_ROI_LOWER_BOUND)
  private Double roiLowerBound = null;

  public static final String SERIALIZED_NAME_ROI_UPPER_BOUND = "roi_upper_bound";
  @SerializedName(SERIALIZED_NAME_ROI_UPPER_BOUND)
  private Double roiUpperBound = null;

  public QianchuanSuggestRoiGoalV10ResponseData() {
  }

  public QianchuanSuggestRoiGoalV10ResponseData ecpRoiGoal(Double ecpRoiGoal) {
    
    this.ecpRoiGoal = ecpRoiGoal;
    return this;
  }

   /**
   * 
   * @return ecpRoiGoal
  **/
  @javax.annotation.Nullable
  public Double getEcpRoiGoal() {
    return ecpRoiGoal;
  }


  public void setEcpRoiGoal(Double ecpRoiGoal) {
    this.ecpRoiGoal = ecpRoiGoal;
  }


  public QianchuanSuggestRoiGoalV10ResponseData roiLowerBound(Double roiLowerBound) {
    
    this.roiLowerBound = roiLowerBound;
    return this;
  }

   /**
   * 
   * @return roiLowerBound
  **/
  @javax.annotation.Nullable
  public Double getRoiLowerBound() {
    return roiLowerBound;
  }


  public void setRoiLowerBound(Double roiLowerBound) {
    this.roiLowerBound = roiLowerBound;
  }


  public QianchuanSuggestRoiGoalV10ResponseData roiUpperBound(Double roiUpperBound) {
    
    this.roiUpperBound = roiUpperBound;
    return this;
  }

   /**
   * 
   * @return roiUpperBound
  **/
  @javax.annotation.Nullable
  public Double getRoiUpperBound() {
    return roiUpperBound;
  }


  public void setRoiUpperBound(Double roiUpperBound) {
    this.roiUpperBound = roiUpperBound;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanSuggestRoiGoalV10ResponseData qianchuanSuggestRoiGoalV10ResponseData = (QianchuanSuggestRoiGoalV10ResponseData) o;
    return Objects.equals(this.ecpRoiGoal, qianchuanSuggestRoiGoalV10ResponseData.ecpRoiGoal) &&
        Objects.equals(this.roiLowerBound, qianchuanSuggestRoiGoalV10ResponseData.roiLowerBound) &&
        Objects.equals(this.roiUpperBound, qianchuanSuggestRoiGoalV10ResponseData.roiUpperBound);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecpRoiGoal, roiLowerBound, roiUpperBound);
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
    sb.append("class QianchuanSuggestRoiGoalV10ResponseData {\n");
    sb.append("    ecpRoiGoal: ").append(toIndentedString(ecpRoiGoal)).append("\n");
    sb.append("    roiLowerBound: ").append(toIndentedString(roiLowerBound)).append("\n");
    sb.append("    roiUpperBound: ").append(toIndentedString(roiUpperBound)).append("\n");
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
    openapiFields.add("ecp_roi_goal");
    openapiFields.add("roi_lower_bound");
    openapiFields.add("roi_upper_bound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ecp_roi_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanSuggestRoiGoalV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanSuggestRoiGoalV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanSuggestRoiGoalV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanSuggestRoiGoalV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanSuggestRoiGoalV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanSuggestRoiGoalV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanSuggestRoiGoalV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanSuggestRoiGoalV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanSuggestRoiGoalV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanSuggestRoiGoalV10ResponseData
  */
  public static QianchuanSuggestRoiGoalV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanSuggestRoiGoalV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanSuggestRoiGoalV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

