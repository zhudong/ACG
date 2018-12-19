package com.kcx.acg.base;

/**
 * Created by Administrator on 2018-5-3.
 */

public class BusEvent {

    public static final int GO_HOME_CODE = 1;
    public static final int LOGIN_SUCCESS = 2;
    public static final int OPEN_VIP_SUCCESS = 3;
    public static final int LOGIN_OUT = 4;
    public static final int INTEREST_ATTENTION = 5;
    public static final int COLLECT = 6;
    public static final int ATTENTION = 7;
    public static final int ATTENTION_MEMBER = 8;
    public static final int REPLY_SUCCESS = 9;
    public static final int SHARE = 10;
    public static final int CLICK_STAR_TAB = 11;
    public static final int REFRESH_INCOME = 12;
    public static final int REGISTER_SUCCESS = 13;
    public static final int UPLOAD_PICTURE_STATE = 14;
    public static final int UPLOAD_VIDEO_STATE = 15;
    public static final int CLICK_MINE_TAB = 16;
    public static final int PICTURE_DEL = 17;


    //图片下载完成
    //使用mTpye来区分来自不同接受者和发送者
    private int mType = 0;
    private Object mParam;
    private String mStrParam;
    private String mStrParam02;
    private String mStrParam03;
    private int mIntParam;
    private long mLongParam;
    private boolean mBooleanParam;
    private boolean mBooleanParam02;
    private int mIntValue;
    private int mIntValue02;
    private byte[] byteParam;

    public BusEvent(int type, long longparam) {
        this.mType = type;
        this.mLongParam = longparam;
    }

    public BusEvent(int type, byte[] byteParam) {
        this.mType = type;
        this.byteParam = byteParam;
    }

    public BusEvent(int type, int intParam) {
        this.mType = type;
        this.mIntParam = intParam;
    }

    public BusEvent(int type, Object param) {
        mType = type;
        mParam = param;
    }

    public BusEvent(int type, String str) {
        mType = type;
        mStrParam = str;
    }


    public BusEvent(int type, Object param, String str) {
        mType = type;
        mParam = param;
        mStrParam = str;
    }

    public BusEvent(int type, Object param, String str, String mStrParam02, String mStrParam03) {
        this.mType = type;
        this.mParam = param;
        this.mStrParam = str;
        this.mStrParam02 = mStrParam02;
        this.mStrParam03 = mStrParam03;
    }

    public BusEvent(int type, boolean booleanParam, Object param) {
        mType = type;
        mParam = param;
        mBooleanParam = booleanParam;
    }

    public BusEvent(int type, boolean booleanParam, Object param, String strValue) {
        mType = type;
        mParam = param;
        mBooleanParam = booleanParam;
        mStrParam = strValue;
    }

    public BusEvent(int type, boolean booleanParam) {
        mType = type;

        mBooleanParam = booleanParam;
    }

    public BusEvent(int type, boolean booleanParam, boolean booleanParam02) {
        mType = type;

        mBooleanParam = booleanParam;
        mBooleanParam02 = booleanParam02;
    }

    public BusEvent(int type, boolean booleanParam, boolean booleanParam02, int intValue) {
        mType = type;

        mBooleanParam = booleanParam;
        mBooleanParam02 = booleanParam02;
        mIntValue = intValue;
    }

    public BusEvent(int type, boolean booleanParam, boolean booleanParam02, String strValue) {
        mType = type;

        mBooleanParam = booleanParam;
        mBooleanParam02 = booleanParam02;
        mStrParam = strValue;
    }

    public BusEvent(int type, boolean booleanParam, int intValue) {
        mType = type;
        mIntValue = intValue;
        mBooleanParam = booleanParam;
    }

    public BusEvent(int type, boolean booleanParam, int intValue, int intValue02) {
        mType = type;
        mIntValue = intValue;
        mBooleanParam = booleanParam;
        mIntValue02 = intValue02;
    }

    public BusEvent(int type, boolean booleanParam, String stringParam, String strParam02) {
        mType = type;
        mStrParam = stringParam;
        mBooleanParam = booleanParam;
        mStrParam02 = strParam02;
    }

    public BusEvent(int type, String stringParam, String strParam02) {
        mType = type;
        mStrParam = stringParam;
        mStrParam02 = strParam02;
    }

    public BusEvent(int type, String stringParam, String strParam02, String strParam03) {
        mType = type;
        mStrParam = stringParam;
        mStrParam02 = strParam02;
        mStrParam03 = strParam03;
    }

    public BusEvent(int type, boolean booleanParam, String stringParam) {
        mType = type;
        mStrParam = stringParam;
        mBooleanParam = booleanParam;
    }

    public BusEvent(int type, Object param, int intParam) {
        mType = type;
        mParam = param;
        mIntParam = intParam;
    }

    public BusEvent(int type, long longParam, Object param) {
        this.mType = type;
        this.mLongParam = longParam;
        this.mParam = param;
    }

    public BusEvent(int type, int intParam, String strParam) {
        this.mType = type;
        this.mIntValue = intParam;
        this.mStrParam = strParam;
    }

    public BusEvent(int type, boolean booleanParam, Object param, String className, boolean booleanParam02) {
        mType = type;
        mParam = param;
        mStrParam = className;
        mBooleanParam = booleanParam;
        mBooleanParam02 = booleanParam02;
    }

    public int getType() {
        return mType;
    }

    public Object getParam() {
        return mParam;
    }

    public long getmLongParam() {
        return mLongParam;
    }

    public String getStrParam() {
        return mStrParam;
    }

    public String getStrParam02() {
        return mStrParam02;
    }

    public int getIntParam() {
        return mIntParam;
    }

    public boolean getBooleanParam() {
        return mBooleanParam;
    }

    public int getIntValue() {
        return mIntValue;
    }

    public boolean getBooleanParam02() {
        return mBooleanParam02;
    }

    public int getIntValue02() {
        return mIntValue02;
    }

    public byte[] getByteParam() {
        return byteParam;
    }

    public String getmStrParam03() {
        return mStrParam03;
    }

    public void setmStrParam03(String mStrParam03) {
        this.mStrParam03 = mStrParam03;
    }
}
