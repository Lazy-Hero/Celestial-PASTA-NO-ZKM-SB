/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import java.util.ArrayDeque;
import net.minecraft.E.J;
import net.minecraft.E.i;
import net.minecraft.aV;
import net.minecraft.aZ;

public class e
implements i {
    private final /* synthetic */ String a;

    @Override
    public void a(aZ aZ2, J j2, ArrayDeque<aV> arrayDeque, int n2) {
        aZ2.c().a(j2, this.a);
    }

    public String toString() {
        return "/" + this.a;
    }

    public e(String string) {
        this.a = string;
    }
}

