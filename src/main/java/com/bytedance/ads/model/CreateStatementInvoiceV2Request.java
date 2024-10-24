/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreateStatementInvoiceV2InvoiceType;
import com.bytedance.ads.model.CreateStatementInvoiceV2RequestInvoiceBillListInner;
import com.bytedance.ads.model.CreateStatementInvoiceV2RequestRebateItemListInner;
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
 * CreateStatementInvoiceV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class CreateStatementInvoiceV2Request {
  public static final String SERIALIZED_NAME_AGENT_IDS = "agent_ids";
  @SerializedName(SERIALIZED_NAME_AGENT_IDS)
  private List<Long> agentIds = null;

  public static final String SERIALIZED_NAME_CUSTOMER_ADDRESS = "customer_address";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ADDRESS)
  private String customerAddress = null;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK = "customer_bank";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK)
  private String customerBank = null;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT = "customer_bank_account";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT)
  private String customerBankAccount = null;

  public static final String SERIALIZED_NAME_CUSTOMER_EMAIL = "customer_email";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_EMAIL)
  private String customerEmail = null;

  public static final String SERIALIZED_NAME_CUSTOMER_ID_LIST = "customer_id_list";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID_LIST)
  private List<Long> customerIdList = null;

  public static final String SERIALIZED_NAME_CUSTOMER_PHONE = "customer_phone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PHONE)
  private String customerPhone = null;

  public static final String SERIALIZED_NAME_CUSTOMER_SMS_PHONE = "customer_sms_phone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SMS_PHONE)
  private String customerSmsPhone = null;

  public static final String SERIALIZED_NAME_CUSTOMER_SUBJECT_NAME = "customer_subject_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SUBJECT_NAME)
  private String customerSubjectName = null;

  public static final String SERIALIZED_NAME_CUSTOMER_TAX_NO = "customer_tax_no";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_TAX_NO)
  private String customerTaxNo = null;

  public static final String SERIALIZED_NAME_INVOICE_BILL_LIST = "invoice_bill_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_BILL_LIST)
  private List<CreateStatementInvoiceV2RequestInvoiceBillListInner> invoiceBillList = null;

  public static final String SERIALIZED_NAME_INVOICE_TYPE = "invoice_type";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE)
  private CreateStatementInvoiceV2InvoiceType invoiceType = null;

  public static final String SERIALIZED_NAME_REBATE_ITEM_LIST = "rebate_item_list";
  @SerializedName(SERIALIZED_NAME_REBATE_ITEM_LIST)
  private List<CreateStatementInvoiceV2RequestRebateItemListInner> rebateItemList = null;

  public static final String SERIALIZED_NAME_SELECT_ADDRESS_AND_PHONE = "select_address_and_phone";
  @SerializedName(SERIALIZED_NAME_SELECT_ADDRESS_AND_PHONE)
  private Boolean selectAddressAndPhone = null;

  public static final String SERIALIZED_NAME_SELECT_BANK_AND_ACCOUNT = "select_bank_and_account";
  @SerializedName(SERIALIZED_NAME_SELECT_BANK_AND_ACCOUNT)
  private Boolean selectBankAndAccount = null;

  public static final String SERIALIZED_NAME_STATEMENT_SERIAL = "statement_serial";
  @SerializedName(SERIALIZED_NAME_STATEMENT_SERIAL)
  private String statementSerial = null;

  public static final String SERIALIZED_NAME_UNPRINTABLE_REMARK = "unprintable_remark";
  @SerializedName(SERIALIZED_NAME_UNPRINTABLE_REMARK)
  private String unprintableRemark = null;

  public CreateStatementInvoiceV2Request() {
  }

  public CreateStatementInvoiceV2Request agentIds(List<Long> agentIds) {
    
    this.agentIds = agentIds;
    return this;
  }

  public CreateStatementInvoiceV2Request addAgentIdsItem(Long agentIdsItem) {
    if (this.agentIds == null) {
      this.agentIds = new ArrayList<>();
    }
    this.agentIds.add(agentIdsItem);
    return this;
  }

   /**
   * 
   * @return agentIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAgentIds() {
    return agentIds;
  }


  public void setAgentIds(List<Long> agentIds) {
    this.agentIds = agentIds;
  }


  public CreateStatementInvoiceV2Request customerAddress(String customerAddress) {
    
    this.customerAddress = customerAddress;
    return this;
  }

   /**
   * 企业注册地址
   * @return customerAddress
  **/
  @javax.annotation.Nullable
  public String getCustomerAddress() {
    return customerAddress;
  }


  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }


  public CreateStatementInvoiceV2Request customerBank(String customerBank) {
    
    this.customerBank = customerBank;
    return this;
  }

   /**
   * 企业开户银行
   * @return customerBank
  **/
  @javax.annotation.Nullable
  public String getCustomerBank() {
    return customerBank;
  }


  public void setCustomerBank(String customerBank) {
    this.customerBank = customerBank;
  }


  public CreateStatementInvoiceV2Request customerBankAccount(String customerBankAccount) {
    
    this.customerBankAccount = customerBankAccount;
    return this;
  }

   /**
   * 企业银行账号
   * @return customerBankAccount
  **/
  @javax.annotation.Nullable
  public String getCustomerBankAccount() {
    return customerBankAccount;
  }


  public void setCustomerBankAccount(String customerBankAccount) {
    this.customerBankAccount = customerBankAccount;
  }


  public CreateStatementInvoiceV2Request customerEmail(String customerEmail) {
    
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * 客户邮箱
   * @return customerEmail
  **/
  @javax.annotation.Nonnull
  public String getCustomerEmail() {
    return customerEmail;
  }


  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }


  public CreateStatementInvoiceV2Request customerIdList(List<Long> customerIdList) {
    
    this.customerIdList = customerIdList;
    return this;
  }

  public CreateStatementInvoiceV2Request addCustomerIdListItem(Long customerIdListItem) {
    if (this.customerIdList == null) {
      this.customerIdList = new ArrayList<>();
    }
    this.customerIdList.add(customerIdListItem);
    return this;
  }

   /**
   * 客户ID列表，鉴权使用
   * @return customerIdList
  **/
  @javax.annotation.Nullable
  public List<Long> getCustomerIdList() {
    return customerIdList;
  }


  public void setCustomerIdList(List<Long> customerIdList) {
    this.customerIdList = customerIdList;
  }


  public CreateStatementInvoiceV2Request customerPhone(String customerPhone) {
    
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * 企业注册电话
   * @return customerPhone
  **/
  @javax.annotation.Nullable
  public String getCustomerPhone() {
    return customerPhone;
  }


  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public CreateStatementInvoiceV2Request customerSmsPhone(String customerSmsPhone) {
    
    this.customerSmsPhone = customerSmsPhone;
    return this;
  }

   /**
   * 客户短信电话
   * @return customerSmsPhone
  **/
  @javax.annotation.Nullable
  public String getCustomerSmsPhone() {
    return customerSmsPhone;
  }


  public void setCustomerSmsPhone(String customerSmsPhone) {
    this.customerSmsPhone = customerSmsPhone;
  }


  public CreateStatementInvoiceV2Request customerSubjectName(String customerSubjectName) {
    
    this.customerSubjectName = customerSubjectName;
    return this;
  }

   /**
   * 开票客户名称
   * @return customerSubjectName
  **/
  @javax.annotation.Nonnull
  public String getCustomerSubjectName() {
    return customerSubjectName;
  }


  public void setCustomerSubjectName(String customerSubjectName) {
    this.customerSubjectName = customerSubjectName;
  }


  public CreateStatementInvoiceV2Request customerTaxNo(String customerTaxNo) {
    
    this.customerTaxNo = customerTaxNo;
    return this;
  }

   /**
   * 纳税人识别号
   * @return customerTaxNo
  **/
  @javax.annotation.Nonnull
  public String getCustomerTaxNo() {
    return customerTaxNo;
  }


  public void setCustomerTaxNo(String customerTaxNo) {
    this.customerTaxNo = customerTaxNo;
  }


  public CreateStatementInvoiceV2Request invoiceBillList(List<CreateStatementInvoiceV2RequestInvoiceBillListInner> invoiceBillList) {
    
    this.invoiceBillList = invoiceBillList;
    return this;
  }

  public CreateStatementInvoiceV2Request addInvoiceBillListItem(CreateStatementInvoiceV2RequestInvoiceBillListInner invoiceBillListItem) {
    if (this.invoiceBillList == null) {
      this.invoiceBillList = new ArrayList<>();
    }
    this.invoiceBillList.add(invoiceBillListItem);
    return this;
  }

   /**
   * 发票票据列表
   * @return invoiceBillList
  **/
  @javax.annotation.Nonnull
  public List<CreateStatementInvoiceV2RequestInvoiceBillListInner> getInvoiceBillList() {
    return invoiceBillList;
  }


  public void setInvoiceBillList(List<CreateStatementInvoiceV2RequestInvoiceBillListInner> invoiceBillList) {
    this.invoiceBillList = invoiceBillList;
  }


  public CreateStatementInvoiceV2Request invoiceType(CreateStatementInvoiceV2InvoiceType invoiceType) {
    
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * Get invoiceType
   * @return invoiceType
  **/
  @javax.annotation.Nonnull
  public CreateStatementInvoiceV2InvoiceType getInvoiceType() {
    return invoiceType;
  }


  public void setInvoiceType(CreateStatementInvoiceV2InvoiceType invoiceType) {
    this.invoiceType = invoiceType;
  }


  public CreateStatementInvoiceV2Request rebateItemList(List<CreateStatementInvoiceV2RequestRebateItemListInner> rebateItemList) {
    
    this.rebateItemList = rebateItemList;
    return this;
  }

  public CreateStatementInvoiceV2Request addRebateItemListItem(CreateStatementInvoiceV2RequestRebateItemListInner rebateItemListItem) {
    if (this.rebateItemList == null) {
      this.rebateItemList = new ArrayList<>();
    }
    this.rebateItemList.add(rebateItemListItem);
    return this;
  }

   /**
   * 差额返点编号、金额集合
   * @return rebateItemList
  **/
  @javax.annotation.Nullable
  public List<CreateStatementInvoiceV2RequestRebateItemListInner> getRebateItemList() {
    return rebateItemList;
  }


  public void setRebateItemList(List<CreateStatementInvoiceV2RequestRebateItemListInner> rebateItemList) {
    this.rebateItemList = rebateItemList;
  }


  public CreateStatementInvoiceV2Request selectAddressAndPhone(Boolean selectAddressAndPhone) {
    
    this.selectAddressAndPhone = selectAddressAndPhone;
    return this;
  }

   /**
   * 数电发票，是否勾选企业注册地址、电话
   * @return selectAddressAndPhone
  **/
  @javax.annotation.Nullable
  public Boolean getSelectAddressAndPhone() {
    return selectAddressAndPhone;
  }


  public void setSelectAddressAndPhone(Boolean selectAddressAndPhone) {
    this.selectAddressAndPhone = selectAddressAndPhone;
  }


  public CreateStatementInvoiceV2Request selectBankAndAccount(Boolean selectBankAndAccount) {
    
    this.selectBankAndAccount = selectBankAndAccount;
    return this;
  }

   /**
   * 数电发票，是否勾选开户行、开户账号
   * @return selectBankAndAccount
  **/
  @javax.annotation.Nullable
  public Boolean getSelectBankAndAccount() {
    return selectBankAndAccount;
  }


  public void setSelectBankAndAccount(Boolean selectBankAndAccount) {
    this.selectBankAndAccount = selectBankAndAccount;
  }


  public CreateStatementInvoiceV2Request statementSerial(String statementSerial) {
    
    this.statementSerial = statementSerial;
    return this;
  }

   /**
   * 结算单编号
   * @return statementSerial
  **/
  @javax.annotation.Nonnull
  public String getStatementSerial() {
    return statementSerial;
  }


  public void setStatementSerial(String statementSerial) {
    this.statementSerial = statementSerial;
  }


  public CreateStatementInvoiceV2Request unprintableRemark(String unprintableRemark) {
    
    this.unprintableRemark = unprintableRemark;
    return this;
  }

   /**
   * 非打印备注
   * @return unprintableRemark
  **/
  @javax.annotation.Nullable
  public String getUnprintableRemark() {
    return unprintableRemark;
  }


  public void setUnprintableRemark(String unprintableRemark) {
    this.unprintableRemark = unprintableRemark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStatementInvoiceV2Request createStatementInvoiceV2Request = (CreateStatementInvoiceV2Request) o;
    return Objects.equals(this.agentIds, createStatementInvoiceV2Request.agentIds) &&
        Objects.equals(this.customerAddress, createStatementInvoiceV2Request.customerAddress) &&
        Objects.equals(this.customerBank, createStatementInvoiceV2Request.customerBank) &&
        Objects.equals(this.customerBankAccount, createStatementInvoiceV2Request.customerBankAccount) &&
        Objects.equals(this.customerEmail, createStatementInvoiceV2Request.customerEmail) &&
        Objects.equals(this.customerIdList, createStatementInvoiceV2Request.customerIdList) &&
        Objects.equals(this.customerPhone, createStatementInvoiceV2Request.customerPhone) &&
        Objects.equals(this.customerSmsPhone, createStatementInvoiceV2Request.customerSmsPhone) &&
        Objects.equals(this.customerSubjectName, createStatementInvoiceV2Request.customerSubjectName) &&
        Objects.equals(this.customerTaxNo, createStatementInvoiceV2Request.customerTaxNo) &&
        Objects.equals(this.invoiceBillList, createStatementInvoiceV2Request.invoiceBillList) &&
        Objects.equals(this.invoiceType, createStatementInvoiceV2Request.invoiceType) &&
        Objects.equals(this.rebateItemList, createStatementInvoiceV2Request.rebateItemList) &&
        Objects.equals(this.selectAddressAndPhone, createStatementInvoiceV2Request.selectAddressAndPhone) &&
        Objects.equals(this.selectBankAndAccount, createStatementInvoiceV2Request.selectBankAndAccount) &&
        Objects.equals(this.statementSerial, createStatementInvoiceV2Request.statementSerial) &&
        Objects.equals(this.unprintableRemark, createStatementInvoiceV2Request.unprintableRemark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentIds, customerAddress, customerBank, customerBankAccount, customerEmail, customerIdList, customerPhone, customerSmsPhone, customerSubjectName, customerTaxNo, invoiceBillList, invoiceType, rebateItemList, selectAddressAndPhone, selectBankAndAccount, statementSerial, unprintableRemark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStatementInvoiceV2Request {\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    customerAddress: ").append(toIndentedString(customerAddress)).append("\n");
    sb.append("    customerBank: ").append(toIndentedString(customerBank)).append("\n");
    sb.append("    customerBankAccount: ").append(toIndentedString(customerBankAccount)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerIdList: ").append(toIndentedString(customerIdList)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    customerSmsPhone: ").append(toIndentedString(customerSmsPhone)).append("\n");
    sb.append("    customerSubjectName: ").append(toIndentedString(customerSubjectName)).append("\n");
    sb.append("    customerTaxNo: ").append(toIndentedString(customerTaxNo)).append("\n");
    sb.append("    invoiceBillList: ").append(toIndentedString(invoiceBillList)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    rebateItemList: ").append(toIndentedString(rebateItemList)).append("\n");
    sb.append("    selectAddressAndPhone: ").append(toIndentedString(selectAddressAndPhone)).append("\n");
    sb.append("    selectBankAndAccount: ").append(toIndentedString(selectBankAndAccount)).append("\n");
    sb.append("    statementSerial: ").append(toIndentedString(statementSerial)).append("\n");
    sb.append("    unprintableRemark: ").append(toIndentedString(unprintableRemark)).append("\n");
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
    openapiFields.add("agent_ids");
    openapiFields.add("customer_address");
    openapiFields.add("customer_bank");
    openapiFields.add("customer_bank_account");
    openapiFields.add("customer_email");
    openapiFields.add("customer_id_list");
    openapiFields.add("customer_phone");
    openapiFields.add("customer_sms_phone");
    openapiFields.add("customer_subject_name");
    openapiFields.add("customer_tax_no");
    openapiFields.add("invoice_bill_list");
    openapiFields.add("invoice_type");
    openapiFields.add("rebate_item_list");
    openapiFields.add("select_address_and_phone");
    openapiFields.add("select_bank_and_account");
    openapiFields.add("statement_serial");
    openapiFields.add("unprintable_remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_ids");
    openapiRequiredFields.add("customer_email");
    openapiRequiredFields.add("customer_subject_name");
    openapiRequiredFields.add("customer_tax_no");
    openapiRequiredFields.add("invoice_bill_list");
    openapiRequiredFields.add("invoice_type");
    openapiRequiredFields.add("statement_serial");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateStatementInvoiceV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateStatementInvoiceV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateStatementInvoiceV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateStatementInvoiceV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateStatementInvoiceV2Request>() {
           @Override
           public void write(JsonWriter out, CreateStatementInvoiceV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateStatementInvoiceV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateStatementInvoiceV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateStatementInvoiceV2Request
  * @throws IOException if the JSON string is invalid with respect to CreateStatementInvoiceV2Request
  */
  public static CreateStatementInvoiceV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateStatementInvoiceV2Request.class);
  }

 /**
  * Convert an instance of CreateStatementInvoiceV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

