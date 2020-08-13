// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserInfo.proto

package com.mgtv.lib.protobuf;

public final class UserInfo {
  private UserInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface UserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.mgtv.lib.protobuf.User)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    java.lang.String getUsername();
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string password = 3;</code>
     * @return The password.
     */
    java.lang.String getPassword();
    /**
     * <code>string password = 3;</code>
     * @return The bytes for password.
     */
    com.google.protobuf.ByteString
        getPasswordBytes();

    /**
     * <code>int32 sex = 4;</code>
     * @return The sex.
     */
    int getSex();

    /**
     * <code>int32 age = 5;</code>
     * @return The age.
     */
    int getAge();
  }
  /**
   * Protobuf type {@code com.mgtv.lib.protobuf.User}
   */
  public  static final class User extends
      com.google.protobuf.GeneratedMessageLite<
          User, User.Builder> implements
      // @@protoc_insertion_point(message_implements:com.mgtv.lib.protobuf.User)
      UserOrBuilder {
    private User() {
      username_ = "";
      password_ = "";
    }
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     */
    private void setId(long value) {
      
      id_ = value;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    private void clearId() {
      
      id_ = 0L;
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private java.lang.String username_;
    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    @java.lang.Override
    public java.lang.String getUsername() {
      return username_;
    }
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(username_);
    }
    /**
     * <code>string username = 2;</code>
     * @param value The username to set.
     */
    private void setUsername(
        java.lang.String value) {
      value.getClass();
  
      username_ = value;
    }
    /**
     * <code>string username = 2;</code>
     */
    private void clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
    }
    /**
     * <code>string username = 2;</code>
     * @param value The bytes for username to set.
     */
    private void setUsernameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      username_ = value.toStringUtf8();
      
    }

    public static final int PASSWORD_FIELD_NUMBER = 3;
    private java.lang.String password_;
    /**
     * <code>string password = 3;</code>
     * @return The password.
     */
    @java.lang.Override
    public java.lang.String getPassword() {
      return password_;
    }
    /**
     * <code>string password = 3;</code>
     * @return The bytes for password.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(password_);
    }
    /**
     * <code>string password = 3;</code>
     * @param value The password to set.
     */
    private void setPassword(
        java.lang.String value) {
      value.getClass();
  
      password_ = value;
    }
    /**
     * <code>string password = 3;</code>
     */
    private void clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
    }
    /**
     * <code>string password = 3;</code>
     * @param value The bytes for password to set.
     */
    private void setPasswordBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      password_ = value.toStringUtf8();
      
    }

    public static final int SEX_FIELD_NUMBER = 4;
    private int sex_;
    /**
     * <code>int32 sex = 4;</code>
     * @return The sex.
     */
    @java.lang.Override
    public int getSex() {
      return sex_;
    }
    /**
     * <code>int32 sex = 4;</code>
     * @param value The sex to set.
     */
    private void setSex(int value) {
      
      sex_ = value;
    }
    /**
     * <code>int32 sex = 4;</code>
     */
    private void clearSex() {
      
      sex_ = 0;
    }

    public static final int AGE_FIELD_NUMBER = 5;
    private int age_;
    /**
     * <code>int32 age = 5;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 5;</code>
     * @param value The age to set.
     */
    private void setAge(int value) {
      
      age_ = value;
    }
    /**
     * <code>int32 age = 5;</code>
     */
    private void clearAge() {
      
      age_ = 0;
    }

    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.mgtv.lib.protobuf.UserInfo.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.mgtv.lib.protobuf.UserInfo.User prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code com.mgtv.lib.protobuf.User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.mgtv.lib.protobuf.UserInfo.User, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.mgtv.lib.protobuf.User)
        com.mgtv.lib.protobuf.UserInfo.UserOrBuilder {
      // Construct using com.mgtv.lib.protobuf.UserInfo.User.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>int64 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public long getId() {
        return instance.getId();
      }
      /**
       * <code>int64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <code>string username = 2;</code>
       * @return The username.
       */
      @java.lang.Override
      public java.lang.String getUsername() {
        return instance.getUsername();
      }
      /**
       * <code>string username = 2;</code>
       * @return The bytes for username.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        return instance.getUsernameBytes();
      }
      /**
       * <code>string username = 2;</code>
       * @param value The username to set.
       * @return This builder for chaining.
       */
      public Builder setUsername(
          java.lang.String value) {
        copyOnWrite();
        instance.setUsername(value);
        return this;
      }
      /**
       * <code>string username = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsername() {
        copyOnWrite();
        instance.clearUsername();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       * @param value The bytes for username to set.
       * @return This builder for chaining.
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setUsernameBytes(value);
        return this;
      }

      /**
       * <code>string password = 3;</code>
       * @return The password.
       */
      @java.lang.Override
      public java.lang.String getPassword() {
        return instance.getPassword();
      }
      /**
       * <code>string password = 3;</code>
       * @return The bytes for password.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        return instance.getPasswordBytes();
      }
      /**
       * <code>string password = 3;</code>
       * @param value The password to set.
       * @return This builder for chaining.
       */
      public Builder setPassword(
          java.lang.String value) {
        copyOnWrite();
        instance.setPassword(value);
        return this;
      }
      /**
       * <code>string password = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPassword() {
        copyOnWrite();
        instance.clearPassword();
        return this;
      }
      /**
       * <code>string password = 3;</code>
       * @param value The bytes for password to set.
       * @return This builder for chaining.
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPasswordBytes(value);
        return this;
      }

      /**
       * <code>int32 sex = 4;</code>
       * @return The sex.
       */
      @java.lang.Override
      public int getSex() {
        return instance.getSex();
      }
      /**
       * <code>int32 sex = 4;</code>
       * @param value The sex to set.
       * @return This builder for chaining.
       */
      public Builder setSex(int value) {
        copyOnWrite();
        instance.setSex(value);
        return this;
      }
      /**
       * <code>int32 sex = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSex() {
        copyOnWrite();
        instance.clearSex();
        return this;
      }

      /**
       * <code>int32 age = 5;</code>
       * @return The age.
       */
      @java.lang.Override
      public int getAge() {
        return instance.getAge();
      }
      /**
       * <code>int32 age = 5;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        copyOnWrite();
        instance.setAge(value);
        return this;
      }
      /**
       * <code>int32 age = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        copyOnWrite();
        instance.clearAge();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.mgtv.lib.protobuf.User)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.mgtv.lib.protobuf.UserInfo.User();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "id_",
              "username_",
              "password_",
              "sex_",
              "age_",
            };
            java.lang.String info =
                "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0208" +
                "\u0003\u0208\u0004\u0004\u0005\u0004";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.mgtv.lib.protobuf.UserInfo.User> parser = PARSER;
          if (parser == null) {
            synchronized (com.mgtv.lib.protobuf.UserInfo.User.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.mgtv.lib.protobuf.UserInfo.User>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.mgtv.lib.protobuf.User)
    private static final com.mgtv.lib.protobuf.UserInfo.User DEFAULT_INSTANCE;
    static {
      User defaultInstance = new User();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        User.class, defaultInstance);
    }

    public static com.mgtv.lib.protobuf.UserInfo.User getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<User> PARSER;

    public static com.google.protobuf.Parser<User> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}