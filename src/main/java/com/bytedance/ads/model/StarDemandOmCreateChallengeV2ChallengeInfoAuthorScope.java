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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope.Adapter.class)
public enum StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l);

  private Long value;

  StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope fromValue(Long value) {
    for (StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope b : StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope.fromValue(value);
    }
  }
}

