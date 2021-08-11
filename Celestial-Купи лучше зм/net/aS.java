/*
 * Decompiled with CFR 0.150.
 */
package net;

import java.util.Iterator;
import java.util.List;
import net.I;
import net.aq;
import net.minecraft.ag.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.av;
import net.minecraft.client.r.b;
import net.minecraft.client.w.Z;
import net.minecraft.client.w.au;
import net.minecraft.client.w.j;
import net.q;

public class aS
extends aq {
    @Override
    public j e() {
        return new Z();
    }

    public aS() {
        super(Q.class, "sheep_wool", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        net.minecraft.client.C.q q2;
        av av2;
        b b10;
        a4 a42 = net.minecraft.client.Q.P().aQ();
        String[] arrstring = I.c();
        b b11 = b10 = a42.c().get(Q.class);
        if (arrstring != null) {
            if (!(b11 instanceof av)) {
                fU.h("Not a RenderSheep: " + b10);
                return null;
            }
            b11 = b10;
        }
        if (arrstring != null) {
            if (b11.b() == null) {
                av2 = new av(a42);
                av2.i = new au();
                av2.a = 0.7f;
                b10 = av2;
            }
            b11 = b10;
        }
        av2 = (av)b11;
        List list = av2.a();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            q2 = iterator.next();
            if (q2 instanceof net.minecraft.client.C.q) {
                iterator.remove();
            }
            if (arrstring != null) continue;
        }
        q2 = new net.minecraft.client.C.q(av2);
        q2.a = (Z)j2;
        av2.a(q2);
        return av2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

