/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo {
  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public static final String SERIALIZED_NAME_TOTAL_COST_PER_PAY_ORDER_FOR_ROI2 = "total_cost_per_pay_order_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_COST_PER_PAY_ORDER_FOR_ROI2)
  private Double totalCostPerPayOrderForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PAY_ORDER_COUNT_FOR_ROI2 = "total_pay_order_count_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAY_ORDER_COUNT_FOR_ROI2)
  private Double totalPayOrderCountForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PAY_ORDER_GMV_FOR_ROI2 = "total_pay_order_gmv_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAY_ORDER_GMV_FOR_ROI2)
  private Long totalPayOrderGmvForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PREPAY_AND_PAY_ORDER_ROI2 = "total_prepay_and_pay_order_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PREPAY_AND_PAY_ORDER_ROI2)
  private Double totalPrepayAndPayOrderRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PREPAY_ORDER_COUNT_FOR_ROI2 = "total_prepay_order_count_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PREPAY_ORDER_COUNT_FOR_ROI2)
  private Long totalPrepayOrderCountForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PREPAY_ORDER_GMV_FOR_ROI2 = "total_prepay_order_gmv_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PREPAY_ORDER_GMV_FOR_ROI2)
  private Double totalPrepayOrderGmvForRoi2 = null;

  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo() {
  }

  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo totalCostPerPayOrderForRoi2(Double totalCostPerPayOrderForRoi2) {
    
    this.totalCostPerPayOrderForRoi2 = totalCostPerPayOrderForRoi2;
    return this;
  }

   /**
   * 
   * @return totalCostPerPayOrderForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalCostPerPayOrderForRoi2() {
    return totalCostPerPayOrderForRoi2;
  }


  public void setTotalCostPerPayOrderForRoi2(Double totalCostPerPayOrderForRoi2) {
    this.totalCostPerPayOrderForRoi2 = totalCostPerPayOrderForRoi2;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo totalPayOrderCountForRoi2(Double totalPayOrderCountForRoi2) {
    
    this.totalPayOrderCountForRoi2 = totalPayOrderCountForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPayOrderCountForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPayOrderCountForRoi2() {
    return totalPayOrderCountForRoi2;
  }


  public void setTotalPayOrderCountForRoi2(Double totalPayOrderCountForRoi2) {
    this.totalPayOrderCountForRoi2 = totalPayOrderCountForRoi2;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo totalPayOrderGmvForRoi2(Long totalPayOrderGmvForRoi2) {
    
    this.totalPayOrderGmvForRoi2 = totalPayOrderGmvForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPayOrderGmvForRoi2
  **/
  @javax.annotation.Nullable
  public Long getTotalPayOrderGmvForRoi2() {
    return totalPayOrderGmvForRoi2;
  }


  public void setTotalPayOrderGmvForRoi2(Long totalPayOrderGmvForRoi2) {
    this.totalPayOrderGmvForRoi2 = totalPayOrderGmvForRoi2;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo totalPrepayAndPayOrderRoi2(Double totalPrepayAndPayOrderRoi2) {
    
    this.totalPrepayAndPayOrderRoi2 = totalPrepayAndPayOrderRoi2;
    return this;
  }

   /**
   * 
   * @return totalPrepayAndPayOrderRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPrepayAndPayOrderRoi2() {
    return totalPrepayAndPayOrderRoi2;
  }


  public void setTotalPrepayAndPayOrderRoi2(Double totalPrepayAndPayOrderRoi2) {
    this.totalPrepayAndPayOrderRoi2 = totalPrepayAndPayOrderRoi2;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo totalPrepayOrderCountForRoi2(Long totalPrepayOrderCountForRoi2) {
    
    this.totalPrepayOrderCountForRoi2 = totalPrepayOrderCountForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPrepayOrderCountForRoi2
  **/
  @javax.annotation.Nullable
  public Long getTotalPrepayOrderCountForRoi2() {
    return totalPrepayOrderCountForRoi2;
  }


  public void setTotalPrepayOrderCountForRoi2(Long totalPrepayOrderCountForRoi2) {
    this.totalPrepayOrderCountForRoi2 = totalPrepayOrderCountForRoi2;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo totalPrepayOrderGmvForRoi2(Double totalPrepayOrderGmvForRoi2) {
    
    this.totalPrepayOrderGmvForRoi2 = totalPrepayOrderGmvForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPrepayOrderGmvForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPrepayOrderGmvForRoi2() {
    return totalPrepayOrderGmvForRoi2;
  }


  public void setTotalPrepayOrderGmvForRoi2(Double totalPrepayOrderGmvForRoi2) {
    this.totalPrepayOrderGmvForRoi2 = totalPrepayOrderGmvForRoi2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo qianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo = (QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo) o;
    return Objects.equals(this.statCost, qianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.statCost) &&
        Objects.equals(this.totalCostPerPayOrderForRoi2, qianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.totalCostPerPayOrderForRoi2) &&
        Objects.equals(this.totalPayOrderCountForRoi2, qianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.totalPayOrderCountForRoi2) &&
        Objects.equals(this.totalPayOrderGmvForRoi2, qianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.totalPayOrderGmvForRoi2) &&
        Objects.equals(this.totalPrepayAndPayOrderRoi2, qianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.totalPrepayAndPayOrderRoi2) &&
        Objects.equals(this.totalPrepayOrderCountForRoi2, qianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.totalPrepayOrderCountForRoi2) &&
        Objects.equals(this.totalPrepayOrderGmvForRoi2, qianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.totalPrepayOrderGmvForRoi2);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(statCost, totalCostPerPayOrderForRoi2, totalPayOrderCountForRoi2, totalPayOrderGmvForRoi2, totalPrepayAndPayOrderRoi2, totalPrepayOrderCountForRoi2, totalPrepayOrderGmvForRoi2);
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
    sb.append("class QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo {\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
    sb.append("    totalCostPerPayOrderForRoi2: ").append(toIndentedString(totalCostPerPayOrderForRoi2)).append("\n");
    sb.append("    totalPayOrderCountForRoi2: ").append(toIndentedString(totalPayOrderCountForRoi2)).append("\n");
    sb.append("    totalPayOrderGmvForRoi2: ").append(toIndentedString(totalPayOrderGmvForRoi2)).append("\n");
    sb.append("    totalPrepayAndPayOrderRoi2: ").append(toIndentedString(totalPrepayAndPayOrderRoi2)).append("\n");
    sb.append("    totalPrepayOrderCountForRoi2: ").append(toIndentedString(totalPrepayOrderCountForRoi2)).append("\n");
    sb.append("    totalPrepayOrderGmvForRoi2: ").append(toIndentedString(totalPrepayOrderGmvForRoi2)).append("\n");
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
    openapiFields.add("stat_cost");
    openapiFields.add("total_cost_per_pay_order_for_roi2");
    openapiFields.add("total_pay_order_count_for_roi2");
    openapiFields.add("total_pay_order_gmv_for_roi2");
    openapiFields.add("total_prepay_and_pay_order_roi2");
    openapiFields.add("total_prepay_order_count_for_roi2");
    openapiFields.add("total_prepay_order_gmv_for_roi2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo
  */
  public static QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

