// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/credentials.proto

package com.galrabin.models;

public interface CredentailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.Credentails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.common.PhoneOTP phoneMode = 1;</code>
   */
  boolean hasPhoneMode();
  /**
   * <code>.common.PhoneOTP phoneMode = 1;</code>
   */
  com.galrabin.models.PhoneOTP getPhoneMode();
  /**
   * <code>.common.PhoneOTP phoneMode = 1;</code>
   */
  com.galrabin.models.PhoneOTPOrBuilder getPhoneModeOrBuilder();

  /**
   * <code>.common.EmailCreds emailMode = 2;</code>
   */
  boolean hasEmailMode();
  /**
   * <code>.common.EmailCreds emailMode = 2;</code>
   */
  com.galrabin.models.EmailCreds getEmailMode();
  /**
   * <code>.common.EmailCreds emailMode = 2;</code>
   */
  com.galrabin.models.EmailCredsOrBuilder getEmailModeOrBuilder();

  public com.galrabin.models.Credentails.ModeCase getModeCase();
}
