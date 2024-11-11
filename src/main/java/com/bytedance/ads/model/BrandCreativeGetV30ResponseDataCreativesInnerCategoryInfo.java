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
 * 分类信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo {
  public static final String SERIALIZED_NAME_AD_CATEGORY = "ad_category";
  @SerializedName(SERIALIZED_NAME_AD_CATEGORY)
  private Long adCategory = null;

  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_BRAND_NAME_ID = "brand_name_id";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME_ID)
  private Long brandNameId = null;

  public static final String SERIALIZED_NAME_CDP_BRAND_ID = "cdp_brand_id";
  @SerializedName(SERIALIZED_NAME_CDP_BRAND_ID)
  private Long cdpBrandId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_V3 = "industry_v3";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_V3)
  private Long industryV3 = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private List<String> productName = null;

  public static final String SERIALIZED_NAME_SUB_BRAND_NAME_IDS = "sub_brand_name_ids";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_NAME_IDS)
  private List<Long> subBrandNameIds = null;

  public static final String SERIALIZED_NAME_SUB_BRAND_NAMES = "sub_brand_names";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_NAMES)
  private List<String> subBrandNames = null;

  public static final String SERIALIZED_NAME_YUNTU_CATEGORY_ID = "yuntu_category_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_CATEGORY_ID)
  private Long yuntuCategoryId = null;

  public static final String SERIALIZED_NAME_YUNTU_MAIN_INDUSTRY_ID = "yuntu_main_industry_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_MAIN_INDUSTRY_ID)
  private Long yuntuMainIndustryId = null;

  public static final String SERIALIZED_NAME_YUNTU_SPU_ID = "yuntu_spu_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_SPU_ID)
  private String yuntuSpuId = null;

  public static final String SERIALIZED_NAME_YUNTU_SPU_NAME = "yuntu_spu_name";
  @SerializedName(SERIALIZED_NAME_YUNTU_SPU_NAME)
  private String yuntuSpuName = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo adCategory(Long adCategory) {
    
    this.adCategory = adCategory;
    return this;
  }

   /**
   * 创意分类
   * @return adCategory
  **/
  @javax.annotation.Nullable
  public Long getAdCategory() {
    return adCategory;
  }


  public void setAdCategory(Long adCategory) {
    this.adCategory = adCategory;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 创意标签
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌名称
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo brandNameId(Long brandNameId) {
    
    this.brandNameId = brandNameId;
    return this;
  }

   /**
   * 品牌名称Id
   * @return brandNameId
  **/
  @javax.annotation.Nullable
  public Long getBrandNameId() {
    return brandNameId;
  }


  public void setBrandNameId(Long brandNameId) {
    this.brandNameId = brandNameId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo cdpBrandId(Long cdpBrandId) {
    
    this.cdpBrandId = cdpBrandId;
    return this;
  }

   /**
   * cdp返回的品牌名称id
   * @return cdpBrandId
  **/
  @javax.annotation.Nullable
  public Long getCdpBrandId() {
    return cdpBrandId;
  }


  public void setCdpBrandId(Long cdpBrandId) {
    this.cdpBrandId = cdpBrandId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo industryV3(Long industryV3) {
    
    this.industryV3 = industryV3;
    return this;
  }

   /**
   * 创意分类（行业3.0版）
   * @return industryV3
  **/
  @javax.annotation.Nullable
  public Long getIndustryV3() {
    return industryV3;
  }


  public void setIndustryV3(Long industryV3) {
    this.industryV3 = industryV3;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo productName(List<String> productName) {
    
    this.productName = productName;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo addProductNameItem(String productNameItem) {
    if (this.productName == null) {
      this.productName = new ArrayList<>();
    }
    this.productName.add(productNameItem);
    return this;
  }

   /**
   * 产品名称
   * @return productName
  **/
  @javax.annotation.Nullable
  public List<String> getProductName() {
    return productName;
  }


  public void setProductName(List<String> productName) {
    this.productName = productName;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo subBrandNameIds(List<Long> subBrandNameIds) {
    
    this.subBrandNameIds = subBrandNameIds;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo addSubBrandNameIdsItem(Long subBrandNameIdsItem) {
    if (this.subBrandNameIds == null) {
      this.subBrandNameIds = new ArrayList<>();
    }
    this.subBrandNameIds.add(subBrandNameIdsItem);
    return this;
  }

   /**
   * 品牌二级名称Ids
   * @return subBrandNameIds
  **/
  @javax.annotation.Nullable
  public List<Long> getSubBrandNameIds() {
    return subBrandNameIds;
  }


  public void setSubBrandNameIds(List<Long> subBrandNameIds) {
    this.subBrandNameIds = subBrandNameIds;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo subBrandNames(List<String> subBrandNames) {
    
    this.subBrandNames = subBrandNames;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo addSubBrandNamesItem(String subBrandNamesItem) {
    if (this.subBrandNames == null) {
      this.subBrandNames = new ArrayList<>();
    }
    this.subBrandNames.add(subBrandNamesItem);
    return this;
  }

   /**
   * 品牌二级名称
   * @return subBrandNames
  **/
  @javax.annotation.Nullable
  public List<String> getSubBrandNames() {
    return subBrandNames;
  }


  public void setSubBrandNames(List<String> subBrandNames) {
    this.subBrandNames = subBrandNames;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo yuntuCategoryId(Long yuntuCategoryId) {
    
    this.yuntuCategoryId = yuntuCategoryId;
    return this;
  }

   /**
   * 云图分类
   * @return yuntuCategoryId
  **/
  @javax.annotation.Nullable
  public Long getYuntuCategoryId() {
    return yuntuCategoryId;
  }


  public void setYuntuCategoryId(Long yuntuCategoryId) {
    this.yuntuCategoryId = yuntuCategoryId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo yuntuMainIndustryId(Long yuntuMainIndustryId) {
    
    this.yuntuMainIndustryId = yuntuMainIndustryId;
    return this;
  }

   /**
   * 云图一级分类ID
   * @return yuntuMainIndustryId
  **/
  @javax.annotation.Nullable
  public Long getYuntuMainIndustryId() {
    return yuntuMainIndustryId;
  }


  public void setYuntuMainIndustryId(Long yuntuMainIndustryId) {
    this.yuntuMainIndustryId = yuntuMainIndustryId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo yuntuSpuId(String yuntuSpuId) {
    
    this.yuntuSpuId = yuntuSpuId;
    return this;
  }

   /**
   * 电商spuId
   * @return yuntuSpuId
  **/
  @javax.annotation.Nullable
  public String getYuntuSpuId() {
    return yuntuSpuId;
  }


  public void setYuntuSpuId(String yuntuSpuId) {
    this.yuntuSpuId = yuntuSpuId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo yuntuSpuName(String yuntuSpuName) {
    
    this.yuntuSpuName = yuntuSpuName;
    return this;
  }

   /**
   * 电商spu名称
   * @return yuntuSpuName
  **/
  @javax.annotation.Nullable
  public String getYuntuSpuName() {
    return yuntuSpuName;
  }


  public void setYuntuSpuName(String yuntuSpuName) {
    this.yuntuSpuName = yuntuSpuName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo = (BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo) o;
    return Objects.equals(this.adCategory, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.adCategory) &&
        Objects.equals(this.adKeywords, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.adKeywords) &&
        Objects.equals(this.brandName, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.brandName) &&
        Objects.equals(this.brandNameId, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.brandNameId) &&
        Objects.equals(this.cdpBrandId, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.cdpBrandId) &&
        Objects.equals(this.industryV3, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.industryV3) &&
        Objects.equals(this.productName, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.productName) &&
        Objects.equals(this.subBrandNameIds, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.subBrandNameIds) &&
        Objects.equals(this.subBrandNames, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.subBrandNames) &&
        Objects.equals(this.yuntuCategoryId, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.yuntuCategoryId) &&
        Objects.equals(this.yuntuMainIndustryId, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.yuntuMainIndustryId) &&
        Objects.equals(this.yuntuSpuId, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.yuntuSpuId) &&
        Objects.equals(this.yuntuSpuName, brandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.yuntuSpuName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCategory, adKeywords, brandName, brandNameId, cdpBrandId, industryV3, productName, subBrandNameIds, subBrandNames, yuntuCategoryId, yuntuMainIndustryId, yuntuSpuId, yuntuSpuName);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo {\n");
    sb.append("    adCategory: ").append(toIndentedString(adCategory)).append("\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    brandNameId: ").append(toIndentedString(brandNameId)).append("\n");
    sb.append("    cdpBrandId: ").append(toIndentedString(cdpBrandId)).append("\n");
    sb.append("    industryV3: ").append(toIndentedString(industryV3)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    subBrandNameIds: ").append(toIndentedString(subBrandNameIds)).append("\n");
    sb.append("    subBrandNames: ").append(toIndentedString(subBrandNames)).append("\n");
    sb.append("    yuntuCategoryId: ").append(toIndentedString(yuntuCategoryId)).append("\n");
    sb.append("    yuntuMainIndustryId: ").append(toIndentedString(yuntuMainIndustryId)).append("\n");
    sb.append("    yuntuSpuId: ").append(toIndentedString(yuntuSpuId)).append("\n");
    sb.append("    yuntuSpuName: ").append(toIndentedString(yuntuSpuName)).append("\n");
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
    openapiFields.add("ad_category");
    openapiFields.add("ad_keywords");
    openapiFields.add("brand_name");
    openapiFields.add("brand_name_id");
    openapiFields.add("cdp_brand_id");
    openapiFields.add("industry_v3");
    openapiFields.add("product_name");
    openapiFields.add("sub_brand_name_ids");
    openapiFields.add("sub_brand_names");
    openapiFields.add("yuntu_category_id");
    openapiFields.add("yuntu_main_industry_id");
    openapiFields.add("yuntu_spu_id");
    openapiFields.add("yuntu_spu_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

