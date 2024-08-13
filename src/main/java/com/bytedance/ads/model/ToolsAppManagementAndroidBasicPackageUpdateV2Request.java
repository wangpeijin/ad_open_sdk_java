/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageUpdateV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageUpdateV2FileOption;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner;
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
 * ToolsAppManagementAndroidBasicPackageUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsAppManagementAndroidBasicPackageUpdateV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementAndroidBasicPackageUpdateV2AccountType accountType = null;

  public static final String SERIALIZED_NAME_APP_DESCRIPTION = "app_description";
  @SerializedName(SERIALIZED_NAME_APP_DESCRIPTION)
  private String appDescription = null;

  public static final String SERIALIZED_NAME_APP_DEVELOPER_NAME = "app_developer_name";
  @SerializedName(SERIALIZED_NAME_APP_DEVELOPER_NAME)
  private String appDeveloperName = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_AUTO_PUBLISH = "auto_publish";
  @SerializedName(SERIALIZED_NAME_AUTO_PUBLISH)
  private Boolean autoPublish = null;

  public static final String SERIALIZED_NAME_FILE_OPTION = "file_option";
  @SerializedName(SERIALIZED_NAME_FILE_OPTION)
  private ToolsAppManagementAndroidBasicPackageUpdateV2FileOption fileOption = null;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner> files = null;

  public static final String SERIALIZED_NAME_INDUSTRY_ID = "industry_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_ID)
  private String industryId = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType paymentType = null;

  public static final String SERIALIZED_NAME_PERMISSIONS_DESCRIPTION = "permissions_description";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_DESCRIPTION)
  private String permissionsDescription = null;

  public static final String SERIALIZED_NAME_RECOMMEND = "recommend";
  @SerializedName(SERIALIZED_NAME_RECOMMEND)
  private String recommend = null;

  public static final String SERIALIZED_NAME_THEME_TAG_ID = "theme_tag_id";
  @SerializedName(SERIALIZED_NAME_THEME_TAG_ID)
  private String themeTagId = null;

  public static final String SERIALIZED_NAME_UPDATE_DESCRIPTION = "update_description";
  @SerializedName(SERIALIZED_NAME_UPDATE_DESCRIPTION)
  private String updateDescription = null;

  public ToolsAppManagementAndroidBasicPackageUpdateV2Request() {
  }

  public ToolsAppManagementAndroidBasicPackageUpdateV2Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账户id指可以接的账号体系如广告主id、巨量纵横组织id等
   * minimum: 1
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request accountType(ToolsAppManagementAndroidBasicPackageUpdateV2AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementAndroidBasicPackageUpdateV2AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementAndroidBasicPackageUpdateV2AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request appDescription(String appDescription) {
    
    this.appDescription = appDescription;
    return this;
  }

   /**
   * 应用介绍
   * @return appDescription
  **/
  @javax.annotation.Nonnull
  public String getAppDescription() {
    return appDescription;
  }


  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request appDeveloperName(String appDeveloperName) {
    
    this.appDeveloperName = appDeveloperName;
    return this;
  }

   /**
   * 应用开发者名称
   * @return appDeveloperName
  **/
  @javax.annotation.Nonnull
  public String getAppDeveloperName() {
    return appDeveloperName;
  }


  public void setAppDeveloperName(String appDeveloperName) {
    this.appDeveloperName = appDeveloperName;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称
   * @return appName
  **/
  @javax.annotation.Nonnull
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request autoPublish(Boolean autoPublish) {
    
    this.autoPublish = autoPublish;
    return this;
  }

   /**
   * 是否自动发布
   * @return autoPublish
  **/
  @javax.annotation.Nonnull
  public Boolean getAutoPublish() {
    return autoPublish;
  }


  public void setAutoPublish(Boolean autoPublish) {
    this.autoPublish = autoPublish;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request fileOption(ToolsAppManagementAndroidBasicPackageUpdateV2FileOption fileOption) {
    
    this.fileOption = fileOption;
    return this;
  }

   /**
   * Get fileOption
   * @return fileOption
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementAndroidBasicPackageUpdateV2FileOption getFileOption() {
    return fileOption;
  }


  public void setFileOption(ToolsAppManagementAndroidBasicPackageUpdateV2FileOption fileOption) {
    this.fileOption = fileOption;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request files(List<ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner> files) {
    
    this.files = files;
    return this;
  }

  public ToolsAppManagementAndroidBasicPackageUpdateV2Request addFilesItem(ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * 文件内容&lt;br&gt;必须包含一个apk；可选：五个图片、一个视频
   * @return files
  **/
  @javax.annotation.Nonnull
  public List<ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner> getFiles() {
    return files;
  }


  public void setFiles(List<ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner> files) {
    this.files = files;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request industryId(String industryId) {
    
    this.industryId = industryId;
    return this;
  }

   /**
   * 分类id
   * @return industryId
  **/
  @javax.annotation.Nonnull
  public String getIndustryId() {
    return industryId;
  }


  public void setIndustryId(String industryId) {
    this.industryId = industryId;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 应用包id
   * @return packageId
  **/
  @javax.annotation.Nonnull
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request paymentType(ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType paymentType) {
    this.paymentType = paymentType;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request permissionsDescription(String permissionsDescription) {
    
    this.permissionsDescription = permissionsDescription;
    return this;
  }

   /**
   * 隐私权限说明
   * @return permissionsDescription
  **/
  @javax.annotation.Nonnull
  public String getPermissionsDescription() {
    return permissionsDescription;
  }


  public void setPermissionsDescription(String permissionsDescription) {
    this.permissionsDescription = permissionsDescription;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request recommend(String recommend) {
    
    this.recommend = recommend;
    return this;
  }

   /**
   * 推荐语
   * @return recommend
  **/
  @javax.annotation.Nonnull
  public String getRecommend() {
    return recommend;
  }


  public void setRecommend(String recommend) {
    this.recommend = recommend;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request themeTagId(String themeTagId) {
    
    this.themeTagId = themeTagId;
    return this;
  }

   /**
   * 应用题材标签id
   * @return themeTagId
  **/
  @javax.annotation.Nullable
  public String getThemeTagId() {
    return themeTagId;
  }


  public void setThemeTagId(String themeTagId) {
    this.themeTagId = themeTagId;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2Request updateDescription(String updateDescription) {
    
    this.updateDescription = updateDescription;
    return this;
  }

   /**
   * 版本更新说明
   * @return updateDescription
  **/
  @javax.annotation.Nonnull
  public String getUpdateDescription() {
    return updateDescription;
  }


  public void setUpdateDescription(String updateDescription) {
    this.updateDescription = updateDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementAndroidBasicPackageUpdateV2Request toolsAppManagementAndroidBasicPackageUpdateV2Request = (ToolsAppManagementAndroidBasicPackageUpdateV2Request) o;
    return Objects.equals(this.accountId, toolsAppManagementAndroidBasicPackageUpdateV2Request.accountId) &&
        Objects.equals(this.accountType, toolsAppManagementAndroidBasicPackageUpdateV2Request.accountType) &&
        Objects.equals(this.appDescription, toolsAppManagementAndroidBasicPackageUpdateV2Request.appDescription) &&
        Objects.equals(this.appDeveloperName, toolsAppManagementAndroidBasicPackageUpdateV2Request.appDeveloperName) &&
        Objects.equals(this.appName, toolsAppManagementAndroidBasicPackageUpdateV2Request.appName) &&
        Objects.equals(this.autoPublish, toolsAppManagementAndroidBasicPackageUpdateV2Request.autoPublish) &&
        Objects.equals(this.fileOption, toolsAppManagementAndroidBasicPackageUpdateV2Request.fileOption) &&
        Objects.equals(this.files, toolsAppManagementAndroidBasicPackageUpdateV2Request.files) &&
        Objects.equals(this.industryId, toolsAppManagementAndroidBasicPackageUpdateV2Request.industryId) &&
        Objects.equals(this.packageId, toolsAppManagementAndroidBasicPackageUpdateV2Request.packageId) &&
        Objects.equals(this.paymentType, toolsAppManagementAndroidBasicPackageUpdateV2Request.paymentType) &&
        Objects.equals(this.permissionsDescription, toolsAppManagementAndroidBasicPackageUpdateV2Request.permissionsDescription) &&
        Objects.equals(this.recommend, toolsAppManagementAndroidBasicPackageUpdateV2Request.recommend) &&
        Objects.equals(this.themeTagId, toolsAppManagementAndroidBasicPackageUpdateV2Request.themeTagId) &&
        Objects.equals(this.updateDescription, toolsAppManagementAndroidBasicPackageUpdateV2Request.updateDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, appDescription, appDeveloperName, appName, autoPublish, fileOption, files, industryId, packageId, paymentType, permissionsDescription, recommend, themeTagId, updateDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementAndroidBasicPackageUpdateV2Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    appDeveloperName: ").append(toIndentedString(appDeveloperName)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    autoPublish: ").append(toIndentedString(autoPublish)).append("\n");
    sb.append("    fileOption: ").append(toIndentedString(fileOption)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    industryId: ").append(toIndentedString(industryId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    permissionsDescription: ").append(toIndentedString(permissionsDescription)).append("\n");
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
    sb.append("    themeTagId: ").append(toIndentedString(themeTagId)).append("\n");
    sb.append("    updateDescription: ").append(toIndentedString(updateDescription)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("app_description");
    openapiFields.add("app_developer_name");
    openapiFields.add("app_name");
    openapiFields.add("auto_publish");
    openapiFields.add("file_option");
    openapiFields.add("files");
    openapiFields.add("industry_id");
    openapiFields.add("package_id");
    openapiFields.add("payment_type");
    openapiFields.add("permissions_description");
    openapiFields.add("recommend");
    openapiFields.add("theme_tag_id");
    openapiFields.add("update_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("app_description");
    openapiRequiredFields.add("app_developer_name");
    openapiRequiredFields.add("app_name");
    openapiRequiredFields.add("auto_publish");
    openapiRequiredFields.add("file_option");
    openapiRequiredFields.add("files");
    openapiRequiredFields.add("industry_id");
    openapiRequiredFields.add("package_id");
    openapiRequiredFields.add("payment_type");
    openapiRequiredFields.add("permissions_description");
    openapiRequiredFields.add("recommend");
    openapiRequiredFields.add("update_description");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementAndroidBasicPackageUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementAndroidBasicPackageUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementAndroidBasicPackageUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementAndroidBasicPackageUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementAndroidBasicPackageUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementAndroidBasicPackageUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementAndroidBasicPackageUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementAndroidBasicPackageUpdateV2Request
  */
  public static ToolsAppManagementAndroidBasicPackageUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementAndroidBasicPackageUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsAppManagementAndroidBasicPackageUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

