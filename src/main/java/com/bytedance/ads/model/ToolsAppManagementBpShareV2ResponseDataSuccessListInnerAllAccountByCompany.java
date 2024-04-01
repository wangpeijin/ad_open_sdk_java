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
import com.bytedance.ads.model.ToolsAppManagementBpShareV2DataSuccessListAllAccountByCompanyAccountType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
public class ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementBpShareV2DataSuccessListAllAccountByCompanyAccountType accountType = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany() {
  }

  public ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany accountType(ToolsAppManagementBpShareV2DataSuccessListAllAccountByCompanyAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareV2DataSuccessListAllAccountByCompanyAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementBpShareV2DataSuccessListAllAccountByCompanyAccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany toolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany = (ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany) o;
    return Objects.equals(this.accountType, toolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany.accountType) &&
        Objects.equals(this.companyId, toolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany.companyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, companyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
    openapiFields.add("account_type");
    openapiFields.add("company_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany
  */
  public static ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

