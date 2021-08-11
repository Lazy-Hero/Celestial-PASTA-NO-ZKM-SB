/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ar;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;
import net.minecraft.ar.K;
import org.apache.logging.log4j.Logger;

public class T {
    @Nullable
    public static <V> V a(FutureTask<V> futureTask, Logger logger) {
        try {
            futureTask.run();
            return futureTask.get();
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        return null;
    }

    public static <T> T a(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static K a() {
        String string = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (string.contains("win")) {
            return K.WINDOWS;
        }
        if (string.contains("mac")) {
            return K.OSX;
        }
        if (string.contains("solaris")) {
            return K.SOLARIS;
        }
        if (string.contains("sunos")) {
            return K.SOLARIS;
        }
        if (string.contains("linux")) {
            return K.LINUX;
        }
        return string.contains("unix") ? K.LINUX : K.UNKNOWN;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

