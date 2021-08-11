/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a1;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class aw
extends L {
    @Override
    public void r() {
        this.t.clear();
        this.t.add(new B(0, h / 2 - 155, w / 4 + 120 + 12, net.minecraft.client.D.h.a("gui.toTitle", new Object[0])));
        this.t.add(new B(1, h / 2 - 155 + 160, w / 4 + 120 + 12, net.minecraft.client.D.h.a("menu.quit", new Object[0])));
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, "Out of memory!", h / 2, w / 4 - 60 + 20, 0xFFFFFF);
        this.a(this.v, "Minecraft has run out of memory.", h / 2 - 140, w / 4 - 60 + 60 + 0, 0xA0A0A0);
        this.a(this.v, "This could be caused by a bug in the game or by the", h / 2 - 140, w / 4 - 60 + 60 + 18, 0xA0A0A0);
        this.a(this.v, "Java Virtual Machine not being allocated enough", h / 2 - 140, w / 4 - 60 + 60 + 27, 0xA0A0A0);
        this.a(this.v, "memory.", h / 2 - 140, w / 4 - 60 + 60 + 36, 0xA0A0A0);
        this.a(this.v, "To prevent level corruption, the current game has quit.", h / 2 - 140, w / 4 - 60 + 60 + 54, 0xA0A0A0);
        this.a(this.v, "We've tried to free up enough memory to let you go back to", h / 2 - 140, w / 4 - 60 + 60 + 63, 0xA0A0A0);
        this.a(this.v, "the main menu and back to playing, but this may not have worked.", h / 2 - 140, w / 4 - 60 + 60 + 72, 0xA0A0A0);
        this.a(this.v, "Please restart the game if you see this message again.", h / 2 - 140, w / 4 - 60 + 60 + 81, 0xA0A0A0);
        super.a(n2, n3, f10);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void a(s s2) throws IOException {
        block3: {
            int n2;
            block1: {
                block2: {
                    String[] arrstring = q.b();
                    n2 = s2.g;
                    if (arrstring == null) break block1;
                    if (n2 != 0) break block2;
                    this.m.a(new a1());
                    if (arrstring != null) break block3;
                }
                n2 = s2.g;
            }
            if (n2 == 1) {
                this.m.m();
            }
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
    }
}

