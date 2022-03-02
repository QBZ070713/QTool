package com.hicore.qtool.LogUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LogUtils {
    private static boolean DebugMode = true;
    static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA);
    public static void debug(String Tag,String text){
        if (!DebugMode)return;
        LogOutputFile.Print(LogOutputFile.LEVEL_DEBUG,"["+format.format(new Date())+"]"+Tag+":"+text);
    }

    public static void error(String Tag,String text){
        LogOutputFile.Print(LogOutputFile.LEVEL_ERROR,"["+format.format(new Date())+"]"+Tag+":"+text);
    }
    public static void fetal_error(String Tag,String text){
        LogOutputFile.Print(LogOutputFile.LEVEL_FETAL_ERROR,"["+format.format(new Date())+"]"+Tag+":"+text);
    }
    public static void info(String Tag,String text){
        LogOutputFile.Print(LogOutputFile.LEVEL_INFO,"["+format.format(new Date())+"]"+Tag+":"+text);
    }
    public static void warning(String Tag,String text){
        LogOutputFile.Print(LogOutputFile.LEVEL_WARNING,"["+format.format(new Date())+"]"+Tag+":"+text);
    }

}
