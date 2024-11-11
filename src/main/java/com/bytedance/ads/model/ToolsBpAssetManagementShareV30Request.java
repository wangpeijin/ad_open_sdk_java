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
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30AllAccountsByBp;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30AssetType;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30RequestAccountInfosInner;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30RequestAllAccountsByCompanyInner;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30ShareMode;
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
 * ToolsBpAssetManagementShareV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsBpAssetManagementShareV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_INFOS = "account_infos";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFOS)
  private List<ToolsBpAssetManagementShareV30RequestAccountInfosInner> accountInfos = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNTS_BY_BP = "all_accounts_by_bp";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNTS_BY_BP)
  private List<ToolsBpAssetManagementShareV30AllAccountsByBp> allAccountsByBp = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNTS_BY_COMPANY = "all_accounts_by_company";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNTS_BY_COMPANY)
  private List<ToolsBpAssetManagementShareV30RequestAllAccountsByCompanyInner> allAccountsByCompany = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private ToolsBpAssetManagementShareV30AssetType assetType = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private Long organizationId = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ToolsBpAssetManagementShareV30ShareMode shareMode = null;

  public ToolsBpAssetManagementShareV30Request() {
  }

  public ToolsBpAssetManagementShareV30Request accountInfos(List<ToolsBpAssetManagementShareV30RequestAccountInfosInner> accountInfos) {
    
    this.accountInfos = accountInfos;
    return this;
  }

  public ToolsBpAssetManagementShareV30Request addAccountInfosItem(ToolsBpAssetManagementShareV30RequestAccountInfosInner accountInfosItem) {
    if (this.accountInfos == null) {
      this.accountInfos = new ArrayList<>();
    }
    this.accountInfos.add(accountInfosItem);
    return this;
  }

   /**
   * 部分共享的账户列表
   * @return accountInfos
  **/
  @javax.annotation.Nullable
  public List<ToolsBpAssetManagementShareV30RequestAccountInfosInner> getAccountInfos() {
    return accountInfos;
  }


  public void setAccountInfos(List<ToolsBpAssetManagementShareV30RequestAccountInfosInner> accountInfos) {
    this.accountInfos = accountInfos;
  }


  public ToolsBpAssetManagementShareV30Request allAccountsByBp(List<ToolsBpAssetManagementShareV30AllAccountsByBp> allAccountsByBp) {
    
    this.allAccountsByBp = allAccountsByBp;
    return this;
  }

  public ToolsBpAssetManagementShareV30Request addAllAccountsByBpItem(ToolsBpAssetManagementShareV30AllAccountsByBp allAccountsByBpItem) {
    if (this.allAccountsByBp == null) {
      this.allAccountsByBp = new ArrayList<>();
    }
    this.allAccountsByBp.add(allAccountsByBpItem);
    return this;
  }

   /**
   * 组织内业务线
   * @return allAccountsByBp
  **/
  @javax.annotation.Nullable
  public List<ToolsBpAssetManagementShareV30AllAccountsByBp> getAllAccountsByBp() {
    return allAccountsByBp;
  }


  public void setAllAccountsByBp(List<ToolsBpAssetManagementShareV30AllAccountsByBp> allAccountsByBp) {
    this.allAccountsByBp = allAccountsByBp;
  }


  public ToolsBpAssetManagementShareV30Request allAccountsByCompany(List<ToolsBpAssetManagementShareV30RequestAllAccountsByCompanyInner> allAccountsByCompany) {
    
    this.allAccountsByCompany = allAccountsByCompany;
    return this;
  }

  public ToolsBpAssetManagementShareV30Request addAllAccountsByCompanyItem(ToolsBpAssetManagementShareV30RequestAllAccountsByCompanyInner allAccountsByCompanyItem) {
    if (this.allAccountsByCompany == null) {
      this.allAccountsByCompany = new ArrayList<>();
    }
    this.allAccountsByCompany.add(allAccountsByCompanyItem);
    return this;
  }

   /**
   * 主体共享信息
   * @return allAccountsByCompany
  **/
  @javax.annotation.Nullable
  public List<ToolsBpAssetManagementShareV30RequestAllAccountsByCompanyInner> getAllAccountsByCompany() {
    return allAccountsByCompany;
  }


  public void setAllAccountsByCompany(List<ToolsBpAssetManagementShareV30RequestAllAccountsByCompanyInner> allAccountsByCompany) {
    this.allAccountsByCompany = allAccountsByCompany;
  }


  public ToolsBpAssetManagementShareV30Request assetType(ToolsBpAssetManagementShareV30AssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nonnull
  public ToolsBpAssetManagementShareV30AssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(ToolsBpAssetManagementShareV30AssetType assetType) {
    this.assetType = assetType;
  }


  public ToolsBpAssetManagementShareV30Request instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 资产ID
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsBpAssetManagementShareV30Request organizationId(Long organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * 组织ID
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  public Long getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  public ToolsBpAssetManagementShareV30Request shareMode(ToolsBpAssetManagementShareV30ShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nonnull
  public ToolsBpAssetManagementShareV30ShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(ToolsBpAssetManagementShareV30ShareMode shareMode) {
    this.shareMode = shareMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBpAssetManagementShareV30Request toolsBpAssetManagementShareV30Request = (ToolsBpAssetManagementShareV30Request) o;
    return Objects.equals(this.accountInfos, toolsBpAssetManagementShareV30Request.accountInfos) &&
        Objects.equals(this.allAccountsByBp, toolsBpAssetManagementShareV30Request.allAccountsByBp) &&
        Objects.equals(this.allAccountsByCompany, toolsBpAssetManagementShareV30Request.allAccountsByCompany) &&
        Objects.equals(this.assetType, toolsBpAssetManagementShareV30Request.assetType) &&
        Objects.equals(this.instanceId, toolsBpAssetManagementShareV30Request.instanceId) &&
        Objects.equals(this.organizationId, toolsBpAssetManagementShareV30Request.organizationId) &&
        Objects.equals(this.shareMode, toolsBpAssetManagementShareV30Request.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfos, allAccountsByBp, allAccountsByCompany, assetType, instanceId, organizationId, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsBpAssetManagementShareV30Request {\n");
    sb.append("    accountInfos: ").append(toIndentedString(accountInfos)).append("\n");
    sb.append("    allAccountsByBp: ").append(toIndentedString(allAccountsByBp)).append("\n");
    sb.append("    allAccountsByCompany: ").append(toIndentedString(allAccountsByCompany)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
    openapiFields.add("account_infos");
    openapiFields.add("all_accounts_by_bp");
    openapiFields.add("all_accounts_by_company");
    openapiFields.add("asset_type");
    openapiFields.add("instance_id");
    openapiFields.add("organization_id");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asset_type");
    openapiRequiredFields.add("instance_id");
    openapiRequiredFields.add("organization_id");
    openapiRequiredFields.add("share_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBpAssetManagementShareV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBpAssetManagementShareV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBpAssetManagementShareV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBpAssetManagementShareV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBpAssetManagementShareV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsBpAssetManagementShareV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBpAssetManagementShareV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBpAssetManagementShareV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBpAssetManagementShareV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsBpAssetManagementShareV30Request
  */
  public static ToolsBpAssetManagementShareV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBpAssetManagementShareV30Request.class);
  }

 /**
  * Convert an instance of ToolsBpAssetManagementShareV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

