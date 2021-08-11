/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.b;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.al;
import net.minecraft.client.b.at;
import net.minecraft.client.b.av;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import org.lwjgl.input.Mouse;

public class a1
extends L {
    public static /* synthetic */ dv B;
    protected /* synthetic */ ArrayList<eI> A;
    private /* synthetic */ int y;
    private /* synthetic */ int z;

    @Override
    public void a(int n2, int n3, float f10) {
        block3: {
            net.minecraft.client.a.v.M();
            net.minecraft.client.a.v.f();
            l l2 = new l(this.m);
            String[] arrstring = q.b();
            int n4 = l2.e();
            int n5 = l2.a();
            dJ.a(new net.minecraft.ar.v("celestial/celestial.jpg"), 1.0f, 1.0f, (float)n4, (float)n5, Color.WHITE);
            this.m.A.c("Made with love by Smertnix", 1.0f, l2.a() - this.m.A.c() - 2, -1);
            Iterator<eI> iterator = this.A.iterator();
            while (iterator.hasNext()) {
                block5: {
                    int n6;
                    int n7;
                    eI eI2;
                    block4: {
                        eI eI3;
                        eI2 = eI3 = iterator.next();
                        n7 = n2;
                        n6 = n3;
                        if (arrstring == null) break block4;
                        eI2.a(n7, n6, Color.WHITE);
                        if (arrstring == null) break block3;
                        if (!Mouse.isButtonDown((int)0)) break block5;
                        eI2 = eI3;
                        n7 = n2;
                        n6 = n3;
                    }
                    eI2.c(n7, n6);
                }
                if (arrstring != null) continue;
            }
            net.minecraft.client.a.v.B();
            super.a(n2, n3, f10);
        }
    }

    public a1() {
        this.A = new ArrayList();
    }

    @Override
    public void r() {
        l l2 = new l(this.m);
        this.y = l2.e();
        this.z = l2.a();
        this.t.add(new dF(0, this.y / 2 - 90, this.z / 2 + 4, 180, 15, "Singleplayer"));
        this.t.add(new dF(1, this.y / 2 - 90, this.z / 2 + 32, 180, 15, "Multiplayer"));
        this.t.add(new dF(2, this.y / 2 - 90, this.z / 2 + 60, 180, 15, "Alt Manager"));
        this.A.clear();
        this.A.add(new eI(new net.minecraft.ar.v("celestial/world.png"), this.y / 2 + 100, this.z / 2, 24, 24, "Language", 15));
        this.A.add(new eI(new net.minecraft.ar.v("celestial/misc.png"), this.y / 2 + 100, this.z / 2 + 34, 24, 24, "Options", 16));
        this.A.add(new eI(new net.minecraft.ar.v("celestial/quit.png"), this.y / 2 + 105, this.z / 2 + 68, 15, 15, "Quit Game", 14));
    }

    static {
        B = new dv();
    }

    @Override
    public void a(s s2) throws IOException {
        String[] arrstring = q.b();
        if (arrstring != null) {
            switch (s2.g) {
                case 0: {
                    this.m.a(new at(this));
                    if (arrstring != null) break;
                }
                case 1: {
                    this.m.a(new av(this));
                    if (arrstring != null) break;
                }
                case 2: {
                    this.m.a(new dz());
                    if (arrstring != null) break;
                }
                case 3: {
                    this.m.a(new al(this, this.m.ac));
                    if (arrstring != null) break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
            }
            super.a(s2);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

