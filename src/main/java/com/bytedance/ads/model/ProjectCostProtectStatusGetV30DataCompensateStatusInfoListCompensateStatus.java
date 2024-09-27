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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus.Adapter.class)
public enum ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus {
  
  CONFIRMING("CONFIRMING"),
  
  DEFAULT("DEFAULT"),
  
  ENDED("ENDED"),
  
  FAILED("FAILED"),
  
  INVALID("INVALID"),
  
  IN_EFFECT("IN_EFFECT"),
  
  PAID("PAID"),
  
  UNSUPPORTED("UNSUPPORTED");

  private String value;

  ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus fromValue(String value) {
    for (ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus b : ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus.fromValue(value);
    }
  }
}

