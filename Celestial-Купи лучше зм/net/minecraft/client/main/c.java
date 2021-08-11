/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.main;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

final class c
extends Authenticator {
    final /* synthetic */ String b;
    final /* synthetic */ String a;

    c(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.a, this.b.toCharArray());
    }
}

