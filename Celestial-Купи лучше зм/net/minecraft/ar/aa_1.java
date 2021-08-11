/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ar;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aa
extends PrintStream {
    protected final /* synthetic */ String b;
    protected static final /* synthetic */ Logger a;

    @Override
    public void println(Object object) {
        this.a(String.valueOf(object));
    }

    static {
        a = LogManager.getLogger();
    }

    protected void a(String string) {
        a.info("[{}]: {}", (Object)this.b, (Object)string);
    }

    public aa(String string, OutputStream outputStream) {
        super(outputStream);
        this.b = string;
    }

    @Override
    public void println(String string) {
        this.a(string);
    }
}

