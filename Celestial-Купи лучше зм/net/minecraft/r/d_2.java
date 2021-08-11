/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.R;

import java.io.OutputStream;
import net.minecraft.ar.aa;

public class d
extends aa {
    public d(String string, OutputStream outputStream) {
        super(string, outputStream);
    }

    @Override
    protected void a(String string) {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = arrstackTraceElement[Math.min(3, arrstackTraceElement.length)];
        a.info("[{}]@.({}:{}): {}", (Object)this.b, (Object)stackTraceElement.getFileName(), (Object)stackTraceElement.getLineNumber(), (Object)string);
    }
}

