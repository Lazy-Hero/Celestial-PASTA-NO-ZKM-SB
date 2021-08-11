/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
package net.minecraft.ar;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class A {
    public /* synthetic */ int b;
    public /* synthetic */ int a;

    public void c() {
        Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2));
        Mouse.setGrabbed((boolean)false);
    }

    public void a() {
        this.b = Mouse.getDX();
        this.a = Mouse.getDY();
    }

    public void b() {
        Mouse.setGrabbed((boolean)true);
        this.b = 0;
        this.a = 0;
    }
}

