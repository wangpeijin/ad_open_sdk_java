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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_AUTO_AD_IDS = "auto_ad_ids";
  @SerializedName(SERIALIZED_NAME_AUTO_AD_IDS)
  private List<Long> autoAdIds = null;

  public static final String SERIALIZED_NAME_AUTO_PROMOTION_IDS = "auto_promotion_ids";
  @SerializedName(SERIALIZED_NAME_AUTO_PROMOTION_IDS)
  private List<Long> autoPromotionIds = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_IS_VALID_VIDEO_MATERIAL = "is_valid_video_material";
  @SerializedName(SERIALIZED_NAME_IS_VALID_VIDEO_MATERIAL)
  private Integer isValidVideoMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_CREATE_TIME = "material_create_time";
  @SerializedName(SERIALIZED_NAME_MATERIAL_CREATE_TIME)
  private String materialCreateTime = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_IS_EFFECTIVE = "material_is_effective";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IS_EFFECTIVE)
  private Integer materialIsEffective = null;

  public static final String SERIALIZED_NAME_MATERIAL_TAGS = "material_tags";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TAGS)
  private List<String> materialTags = null;

  public static final String SERIALIZED_NAME_POLICY_COST = "policy_cost";
  @SerializedName(SERIALIZED_NAME_POLICY_COST)
  private Double policyCost = null;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "promotion_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<Long> promotionIds = null;

  public static final String SERIALIZED_NAME_ROW_ID = "row_id";
  @SerializedName(SERIALIZED_NAME_ROW_ID)
  private Long rowId = null;

  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo() {
  }

  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo autoAdIds(List<Long> autoAdIds) {
    
    this.autoAdIds = autoAdIds;
    return this;
  }

  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo addAutoAdIdsItem(Long autoAdIdsItem) {
    if (this.autoAdIds == null) {
      this.autoAdIds = new ArrayList<>();
    }
    this.autoAdIds.add(autoAdIdsItem);
    return this;
  }

   /**
   * 
   * @return autoAdIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAutoAdIds() {
    return autoAdIds;
  }


  public void setAutoAdIds(List<Long> autoAdIds) {
    this.autoAdIds = autoAdIds;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo autoPromotionIds(List<Long> autoPromotionIds) {
    
    this.autoPromotionIds = autoPromotionIds;
    return this;
  }

  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo addAutoPromotionIdsItem(Long autoPromotionIdsItem) {
    if (this.autoPromotionIds == null) {
      this.autoPromotionIds = new ArrayList<>();
    }
    this.autoPromotionIds.add(autoPromotionIdsItem);
    return this;
  }

   /**
   * 
   * @return autoPromotionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAutoPromotionIds() {
    return autoPromotionIds;
  }


  public void setAutoPromotionIds(List<Long> autoPromotionIds) {
    this.autoPromotionIds = autoPromotionIds;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo isValidVideoMaterial(Integer isValidVideoMaterial) {
    
    this.isValidVideoMaterial = isValidVideoMaterial;
    return this;
  }

   /**
   * 
   * @return isValidVideoMaterial
  **/
  @javax.annotation.Nullable
  public Integer getIsValidVideoMaterial() {
    return isValidVideoMaterial;
  }


  public void setIsValidVideoMaterial(Integer isValidVideoMaterial) {
    this.isValidVideoMaterial = isValidVideoMaterial;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo materialCreateTime(String materialCreateTime) {
    
    this.materialCreateTime = materialCreateTime;
    return this;
  }

   /**
   * 
   * @return materialCreateTime
  **/
  @javax.annotation.Nullable
  public String getMaterialCreateTime() {
    return materialCreateTime;
  }


  public void setMaterialCreateTime(String materialCreateTime) {
    this.materialCreateTime = materialCreateTime;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo materialIsEffective(Integer materialIsEffective) {
    
    this.materialIsEffective = materialIsEffective;
    return this;
  }

   /**
   * 
   * @return materialIsEffective
  **/
  @javax.annotation.Nullable
  public Integer getMaterialIsEffective() {
    return materialIsEffective;
  }


  public void setMaterialIsEffective(Integer materialIsEffective) {
    this.materialIsEffective = materialIsEffective;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo materialTags(List<String> materialTags) {
    
    this.materialTags = materialTags;
    return this;
  }

  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo addMaterialTagsItem(String materialTagsItem) {
    if (this.materialTags == null) {
      this.materialTags = new ArrayList<>();
    }
    this.materialTags.add(materialTagsItem);
    return this;
  }

   /**
   * 
   * @return materialTags
  **/
  @javax.annotation.Nullable
  public List<String> getMaterialTags() {
    return materialTags;
  }


  public void setMaterialTags(List<String> materialTags) {
    this.materialTags = materialTags;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo policyCost(Double policyCost) {
    
    this.policyCost = policyCost;
    return this;
  }

   /**
   * 
   * @return policyCost
  **/
  @javax.annotation.Nullable
  public Double getPolicyCost() {
    return policyCost;
  }


  public void setPolicyCost(Double policyCost) {
    this.policyCost = policyCost;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo promotionIds(List<Long> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo addPromotionIdsItem(Long promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * 
   * @return promotionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionIds() {
    return promotionIds;
  }


  public void setPromotionIds(List<Long> promotionIds) {
    this.promotionIds = promotionIds;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo rowId(Long rowId) {
    
    this.rowId = rowId;
    return this;
  }

   /**
   * 
   * @return rowId
  **/
  @javax.annotation.Nullable
  public Long getRowId() {
    return rowId;
  }


  public void setRowId(Long rowId) {
    this.rowId = rowId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo = (FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo) o;
    return Objects.equals(this.adIds, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.adIds) &&
        Objects.equals(this.autoAdIds, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.autoAdIds) &&
        Objects.equals(this.autoPromotionIds, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.autoPromotionIds) &&
        Objects.equals(this.cost, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.cost) &&
        Objects.equals(this.isValidVideoMaterial, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.isValidVideoMaterial) &&
        Objects.equals(this.materialCreateTime, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.materialCreateTime) &&
        Objects.equals(this.materialId, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.materialId) &&
        Objects.equals(this.materialIsEffective, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.materialIsEffective) &&
        Objects.equals(this.materialTags, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.materialTags) &&
        Objects.equals(this.policyCost, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.policyCost) &&
        Objects.equals(this.promotionIds, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.promotionIds) &&
        Objects.equals(this.rowId, fileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.rowId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, autoAdIds, autoPromotionIds, cost, isValidVideoMaterial, materialCreateTime, materialId, materialIsEffective, materialTags, policyCost, promotionIds, rowId);
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
    sb.append("class FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    autoAdIds: ").append(toIndentedString(autoAdIds)).append("\n");
    sb.append("    autoPromotionIds: ").append(toIndentedString(autoPromotionIds)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    isValidVideoMaterial: ").append(toIndentedString(isValidVideoMaterial)).append("\n");
    sb.append("    materialCreateTime: ").append(toIndentedString(materialCreateTime)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialIsEffective: ").append(toIndentedString(materialIsEffective)).append("\n");
    sb.append("    materialTags: ").append(toIndentedString(materialTags)).append("\n");
    sb.append("    policyCost: ").append(toIndentedString(policyCost)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("auto_ad_ids");
    openapiFields.add("auto_promotion_ids");
    openapiFields.add("cost");
    openapiFields.add("is_valid_video_material");
    openapiFields.add("material_create_time");
    openapiFields.add("material_id");
    openapiFields.add("material_is_effective");
    openapiFields.add("material_tags");
    openapiFields.add("policy_cost");
    openapiFields.add("promotion_ids");
    openapiFields.add("row_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo>() {
           @Override
           public void write(JsonWriter out, FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo
  * @throws IOException if the JSON string is invalid with respect to FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo
  */
  public static FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo.class);
  }

 /**
  * Convert an instance of FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

