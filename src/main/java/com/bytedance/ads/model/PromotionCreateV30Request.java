/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionCreateV30AdDownloadStatus;
import com.bytedance.ads.model.PromotionCreateV30AutoExtendTraffic;
import com.bytedance.ads.model.PromotionCreateV30BudgetMode;
import com.bytedance.ads.model.PromotionCreateV30CreativeAutoGenerateSwitch;
import com.bytedance.ads.model.PromotionCreateV30IsCommentDisable;
import com.bytedance.ads.model.PromotionCreateV30MaterialsType;
import com.bytedance.ads.model.PromotionCreateV30Operation;
import com.bytedance.ads.model.PromotionCreateV30RequestBrandInfo;
import com.bytedance.ads.model.PromotionCreateV30RequestKeywordsInner;
import com.bytedance.ads.model.PromotionCreateV30RequestNativeSetting;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterials;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PromotionCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class PromotionCreateV30Request {
  public static final String SERIALIZED_NAME_AD_DOWNLOAD_STATUS = "ad_download_status";
  @SerializedName(SERIALIZED_NAME_AD_DOWNLOAD_STATUS)
  private PromotionCreateV30AdDownloadStatus adDownloadStatus = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TRAFFIC = "auto_extend_traffic";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TRAFFIC)
  private PromotionCreateV30AutoExtendTraffic autoExtendTraffic = null;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BRAND_INFO = "brand_info";
  @SerializedName(SERIALIZED_NAME_BRAND_INFO)
  private PromotionCreateV30RequestBrandInfo brandInfo = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private PromotionCreateV30BudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Long configId = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH = "creative_auto_generate_switch";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH)
  private PromotionCreateV30CreativeAutoGenerateSwitch creativeAutoGenerateSwitch = null;

  public static final String SERIALIZED_NAME_DEEP_CPABID = "deep_cpabid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPABID)
  private Double deepCpabid = null;

  public static final String SERIALIZED_NAME_IS_COMMENT_DISABLE = "is_comment_disable";
  @SerializedName(SERIALIZED_NAME_IS_COMMENT_DISABLE)
  private PromotionCreateV30IsCommentDisable isCommentDisable = null;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<PromotionCreateV30RequestKeywordsInner> keywords = null;

  public static final String SERIALIZED_NAME_MATERIALS_TYPE = "materials_type";
  @SerializedName(SERIALIZED_NAME_MATERIALS_TYPE)
  private PromotionCreateV30MaterialsType materialsType = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NATIVE_SETTING = "native_setting";
  @SerializedName(SERIALIZED_NAME_NATIVE_SETTING)
  private PromotionCreateV30RequestNativeSetting nativeSetting = null;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private PromotionCreateV30Operation operation = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROMOTION_MATERIALS = "promotion_materials";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MATERIALS)
  private PromotionCreateV30RequestPromotionMaterials promotionMaterials = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_UNION_BID_RATIO = "union_bid_ratio";
  @SerializedName(SERIALIZED_NAME_UNION_BID_RATIO)
  private Double unionBidRatio = null;

  public PromotionCreateV30Request() {
  }

  public PromotionCreateV30Request adDownloadStatus(PromotionCreateV30AdDownloadStatus adDownloadStatus) {
    
    this.adDownloadStatus = adDownloadStatus;
    return this;
  }

   /**
   * Get adDownloadStatus
   * @return adDownloadStatus
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30AdDownloadStatus getAdDownloadStatus() {
    return adDownloadStatus;
  }


  public void setAdDownloadStatus(PromotionCreateV30AdDownloadStatus adDownloadStatus) {
    this.adDownloadStatus = adDownloadStatus;
  }


  public PromotionCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public PromotionCreateV30Request autoExtendTraffic(PromotionCreateV30AutoExtendTraffic autoExtendTraffic) {
    
    this.autoExtendTraffic = autoExtendTraffic;
    return this;
  }

   /**
   * Get autoExtendTraffic
   * @return autoExtendTraffic
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30AutoExtendTraffic getAutoExtendTraffic() {
    return autoExtendTraffic;
  }


  public void setAutoExtendTraffic(PromotionCreateV30AutoExtendTraffic autoExtendTraffic) {
    this.autoExtendTraffic = autoExtendTraffic;
  }


  public PromotionCreateV30Request bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public PromotionCreateV30Request brandInfo(PromotionCreateV30RequestBrandInfo brandInfo) {
    
    this.brandInfo = brandInfo;
    return this;
  }

   /**
   * Get brandInfo
   * @return brandInfo
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30RequestBrandInfo getBrandInfo() {
    return brandInfo;
  }


  public void setBrandInfo(PromotionCreateV30RequestBrandInfo brandInfo) {
    this.brandInfo = brandInfo;
  }


  public PromotionCreateV30Request budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public PromotionCreateV30Request budgetMode(PromotionCreateV30BudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30BudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(PromotionCreateV30BudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public PromotionCreateV30Request configId(Long configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 
   * @return configId
  **/
  @javax.annotation.Nullable
  public Long getConfigId() {
    return configId;
  }


  public void setConfigId(Long configId) {
    this.configId = configId;
  }


  public PromotionCreateV30Request cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public PromotionCreateV30Request creativeAutoGenerateSwitch(PromotionCreateV30CreativeAutoGenerateSwitch creativeAutoGenerateSwitch) {
    
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
    return this;
  }

   /**
   * Get creativeAutoGenerateSwitch
   * @return creativeAutoGenerateSwitch
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30CreativeAutoGenerateSwitch getCreativeAutoGenerateSwitch() {
    return creativeAutoGenerateSwitch;
  }


  public void setCreativeAutoGenerateSwitch(PromotionCreateV30CreativeAutoGenerateSwitch creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
  }


  public PromotionCreateV30Request deepCpabid(Double deepCpabid) {
    
    this.deepCpabid = deepCpabid;
    return this;
  }

   /**
   * 
   * @return deepCpabid
  **/
  @javax.annotation.Nullable
  public Double getDeepCpabid() {
    return deepCpabid;
  }


  public void setDeepCpabid(Double deepCpabid) {
    this.deepCpabid = deepCpabid;
  }


  public PromotionCreateV30Request isCommentDisable(PromotionCreateV30IsCommentDisable isCommentDisable) {
    
    this.isCommentDisable = isCommentDisable;
    return this;
  }

   /**
   * Get isCommentDisable
   * @return isCommentDisable
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30IsCommentDisable getIsCommentDisable() {
    return isCommentDisable;
  }


  public void setIsCommentDisable(PromotionCreateV30IsCommentDisable isCommentDisable) {
    this.isCommentDisable = isCommentDisable;
  }


  public PromotionCreateV30Request keywords(List<PromotionCreateV30RequestKeywordsInner> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public PromotionCreateV30Request addKeywordsItem(PromotionCreateV30RequestKeywordsInner keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestKeywordsInner> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<PromotionCreateV30RequestKeywordsInner> keywords) {
    this.keywords = keywords;
  }


  public PromotionCreateV30Request materialsType(PromotionCreateV30MaterialsType materialsType) {
    
    this.materialsType = materialsType;
    return this;
  }

   /**
   * Get materialsType
   * @return materialsType
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30MaterialsType getMaterialsType() {
    return materialsType;
  }


  public void setMaterialsType(PromotionCreateV30MaterialsType materialsType) {
    this.materialsType = materialsType;
  }


  public PromotionCreateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PromotionCreateV30Request nativeSetting(PromotionCreateV30RequestNativeSetting nativeSetting) {
    
    this.nativeSetting = nativeSetting;
    return this;
  }

   /**
   * Get nativeSetting
   * @return nativeSetting
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30RequestNativeSetting getNativeSetting() {
    return nativeSetting;
  }


  public void setNativeSetting(PromotionCreateV30RequestNativeSetting nativeSetting) {
    this.nativeSetting = nativeSetting;
  }


  public PromotionCreateV30Request operation(PromotionCreateV30Operation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30Operation getOperation() {
    return operation;
  }


  public void setOperation(PromotionCreateV30Operation operation) {
    this.operation = operation;
  }


  public PromotionCreateV30Request projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public PromotionCreateV30Request promotionMaterials(PromotionCreateV30RequestPromotionMaterials promotionMaterials) {
    
    this.promotionMaterials = promotionMaterials;
    return this;
  }

   /**
   * Get promotionMaterials
   * @return promotionMaterials
  **/
  @javax.annotation.Nonnull
  public PromotionCreateV30RequestPromotionMaterials getPromotionMaterials() {
    return promotionMaterials;
  }


  public void setPromotionMaterials(PromotionCreateV30RequestPromotionMaterials promotionMaterials) {
    this.promotionMaterials = promotionMaterials;
  }


  public PromotionCreateV30Request roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public PromotionCreateV30Request source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public PromotionCreateV30Request unionBidRatio(Double unionBidRatio) {
    
    this.unionBidRatio = unionBidRatio;
    return this;
  }

   /**
   * 
   * @return unionBidRatio
  **/
  @javax.annotation.Nullable
  public Double getUnionBidRatio() {
    return unionBidRatio;
  }


  public void setUnionBidRatio(Double unionBidRatio) {
    this.unionBidRatio = unionBidRatio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCreateV30Request promotionCreateV30Request = (PromotionCreateV30Request) o;
    return Objects.equals(this.adDownloadStatus, promotionCreateV30Request.adDownloadStatus) &&
        Objects.equals(this.advertiserId, promotionCreateV30Request.advertiserId) &&
        Objects.equals(this.autoExtendTraffic, promotionCreateV30Request.autoExtendTraffic) &&
        Objects.equals(this.bid, promotionCreateV30Request.bid) &&
        Objects.equals(this.brandInfo, promotionCreateV30Request.brandInfo) &&
        Objects.equals(this.budget, promotionCreateV30Request.budget) &&
        Objects.equals(this.budgetMode, promotionCreateV30Request.budgetMode) &&
        Objects.equals(this.configId, promotionCreateV30Request.configId) &&
        Objects.equals(this.cpaBid, promotionCreateV30Request.cpaBid) &&
        Objects.equals(this.creativeAutoGenerateSwitch, promotionCreateV30Request.creativeAutoGenerateSwitch) &&
        Objects.equals(this.deepCpabid, promotionCreateV30Request.deepCpabid) &&
        Objects.equals(this.isCommentDisable, promotionCreateV30Request.isCommentDisable) &&
        Objects.equals(this.keywords, promotionCreateV30Request.keywords) &&
        Objects.equals(this.materialsType, promotionCreateV30Request.materialsType) &&
        Objects.equals(this.name, promotionCreateV30Request.name) &&
        Objects.equals(this.nativeSetting, promotionCreateV30Request.nativeSetting) &&
        Objects.equals(this.operation, promotionCreateV30Request.operation) &&
        Objects.equals(this.projectId, promotionCreateV30Request.projectId) &&
        Objects.equals(this.promotionMaterials, promotionCreateV30Request.promotionMaterials) &&
        Objects.equals(this.roiGoal, promotionCreateV30Request.roiGoal) &&
        Objects.equals(this.source, promotionCreateV30Request.source) &&
        Objects.equals(this.unionBidRatio, promotionCreateV30Request.unionBidRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adDownloadStatus, advertiserId, autoExtendTraffic, bid, brandInfo, budget, budgetMode, configId, cpaBid, creativeAutoGenerateSwitch, deepCpabid, isCommentDisable, keywords, materialsType, name, nativeSetting, operation, projectId, promotionMaterials, roiGoal, source, unionBidRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreateV30Request {\n");
    sb.append("    adDownloadStatus: ").append(toIndentedString(adDownloadStatus)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoExtendTraffic: ").append(toIndentedString(autoExtendTraffic)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    brandInfo: ").append(toIndentedString(brandInfo)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    creativeAutoGenerateSwitch: ").append(toIndentedString(creativeAutoGenerateSwitch)).append("\n");
    sb.append("    deepCpabid: ").append(toIndentedString(deepCpabid)).append("\n");
    sb.append("    isCommentDisable: ").append(toIndentedString(isCommentDisable)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    materialsType: ").append(toIndentedString(materialsType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nativeSetting: ").append(toIndentedString(nativeSetting)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    promotionMaterials: ").append(toIndentedString(promotionMaterials)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    unionBidRatio: ").append(toIndentedString(unionBidRatio)).append("\n");
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
    openapiFields.add("ad_download_status");
    openapiFields.add("advertiser_id");
    openapiFields.add("auto_extend_traffic");
    openapiFields.add("bid");
    openapiFields.add("brand_info");
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("config_id");
    openapiFields.add("cpa_bid");
    openapiFields.add("creative_auto_generate_switch");
    openapiFields.add("deep_cpabid");
    openapiFields.add("is_comment_disable");
    openapiFields.add("keywords");
    openapiFields.add("materials_type");
    openapiFields.add("name");
    openapiFields.add("native_setting");
    openapiFields.add("operation");
    openapiFields.add("project_id");
    openapiFields.add("promotion_materials");
    openapiFields.add("roi_goal");
    openapiFields.add("source");
    openapiFields.add("union_bid_ratio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("promotion_materials");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionCreateV30Request>() {
           @Override
           public void write(JsonWriter out, PromotionCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to PromotionCreateV30Request
  */
  public static PromotionCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionCreateV30Request.class);
  }

 /**
  * Convert an instance of PromotionCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

