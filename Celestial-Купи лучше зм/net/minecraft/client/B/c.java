/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.B;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.B.d;
import net.minecraft.client.B.i;

public class c
extends IOException {
    private final /* synthetic */ List<i> b;
    private final /* synthetic */ String a;

    public void a(String string) {
        i.a(this.b.get(0), string);
        this.b.add(0, new i(null));
    }

    public static c a(Exception exception) {
        int n2 = d.b();
        Exception exception2 = exception;
        if (n2 != 0) {
            if (exception2 instanceof c) {
                return (c)exception;
            }
            exception2 = exception;
        }
        String string = exception2.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new c(string, exception);
    }

    public c(String string, Throwable throwable) {
        super(throwable);
        this.b = Lists.newArrayList();
        this.b.add(new i(null));
        this.a = string;
    }

    public void b(String string) {
        i.b(this.b.get(0), string);
    }

    @Override
    public String getMessage() {
        return "Invalid " + this.b.get(this.b.size() - 1) + ": " + this.a;
    }

    public c(String string) {
        this.b = Lists.newArrayList();
        this.b.add(new i(null));
        this.a = string;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

