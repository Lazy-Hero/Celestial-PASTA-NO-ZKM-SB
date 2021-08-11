/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package net.minecraft.Z;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import net.minecraft.W.K;
import net.minecraft.Z.b;
import net.minecraft.Z.j;
import net.minecraft.ae.a;

public interface i
extends j,
b {
    public ImmutableMap<a<?>, Comparable<?>> a();

    public K b();

    public Collection<a<?>> c();

    public <T extends Comparable<T>, V extends T> i a(a<T> var1, V var2);

    public <T extends Comparable<T>> T b(a<T> var1);

    public <T extends Comparable<T>> i a(a<T> var1);
}

