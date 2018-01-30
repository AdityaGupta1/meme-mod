package org.sdoaj.meme.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * Ugandan Knuckles - SDOAJ
 * Created using Tabula 7.0.0
 */
public class ModelKnuckles extends ModelBase {
    public ModelRenderer armLeft1;
    public ModelRenderer armLeft2;
    public ModelRenderer gloveLeft;
    public ModelRenderer armRight1;
    public ModelRenderer armRight2;
    public ModelRenderer gloveRight;
    public ModelRenderer headTop;
    public ModelRenderer headMain;
    public ModelRenderer eyeRight;
    public ModelRenderer eyeLeft;
    public ModelRenderer eyeBridge;
    public ModelRenderer snoutMain;
    public ModelRenderer snoutBottom;
    public ModelRenderer snoutTip;
    public ModelRenderer tentacleRightMain;
    public ModelRenderer tentacleRightTop;
    public ModelRenderer tentacleRightBottom;
    public ModelRenderer tentacleLeftMain;
    public ModelRenderer tentacleLeftTop;
    public ModelRenderer tentacleLeftBottom;
    public ModelRenderer legRight;
    public ModelRenderer footRight;
    public ModelRenderer legLeft;
    public ModelRenderer footLeft;
    public ModelRenderer bodyMain;
    public ModelRenderer bodyBottom;

    public ModelKnuckles() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.armLeft1 = new ModelRenderer(this, 0, 0);
        this.armLeft1.setRotationPoint(1.0F, 7.0F, 7.0F);
        this.armLeft1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.gloveLeft = new ModelRenderer(this, 20, 0);
        this.gloveLeft.setRotationPoint(0.0F, 10.0F, 10.0F);
        this.gloveLeft.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.armRight1 = new ModelRenderer(this, 36, 0);
        this.armRight1.setRotationPoint(1.0F, 7.0F, -11.0F);
        this.armRight1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.tentacleLeftBottom = new ModelRenderer(this, 22, 8);
        this.tentacleLeftBottom.setRotationPoint(6.0F, 9.0F, 1.0F);
        this.tentacleLeftBottom.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.footLeft = new ModelRenderer(this, 43, 15);
        this.footLeft.setRotationPoint(0.0F, 22.0F, -6.0F);
        this.footLeft.addBox(0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
        this.headMain = new ModelRenderer(this, 8, 13);
        this.headMain.setRotationPoint(-2.0F, 2.0F, -4.0F);
        this.headMain.addBox(0.0F, 0.0F, 0.0F, 8, 5, 8, 0.0F);
        this.snoutBottom = new ModelRenderer(this, 16, 8);
        this.snoutBottom.setRotationPoint(6.0F, 7.0F, -2.0F);
        this.snoutBottom.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.snoutMain = new ModelRenderer(this, 48, 7);
        this.snoutMain.setRotationPoint(6.0F, 5.0F, -3.0F);
        this.snoutMain.addBox(0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F);
        this.tentacleRightBottom = new ModelRenderer(this, 56, 7);
        this.tentacleRightBottom.setRotationPoint(6.0F, 9.0F, -3.0F);
        this.tentacleRightBottom.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.gloveRight = new ModelRenderer(this, 0, 6);
        this.gloveRight.setRotationPoint(0.0F, 10.0F, -14.0F);
        this.gloveRight.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.tentacleRightMain = new ModelRenderer(this, 48, 6);
        this.tentacleRightMain.setRotationPoint(6.0F, 7.0F, -4.0F);
        this.tentacleRightMain.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.tentacleLeftTop = new ModelRenderer(this, 8, 0);
        this.tentacleLeftTop.setRotationPoint(6.0F, 4.0F, 3.0F);
        this.tentacleLeftTop.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.footRight = new ModelRenderer(this, 0, 14);
        this.footRight.setRotationPoint(0.0F, 22.0F, 3.0F);
        this.footRight.addBox(0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
        this.bodyBottom = new ModelRenderer(this, 0, 50);
        this.bodyBottom.setRotationPoint(-1.0F, 17.0F, -6.0F);
        this.bodyBottom.addBox(0.0F, 0.0F, 0.0F, 6, 1, 12, 0.0F);
        this.tentacleRightTop = new ModelRenderer(this, 0, 0);
        this.tentacleRightTop.setRotationPoint(6.0F, 4.0F, -4.0F);
        this.tentacleRightTop.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.eyeRight = new ModelRenderer(this, 32, 0);
        this.eyeRight.setRotationPoint(6.0F, 3.0F, -3.0F);
        this.eyeRight.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 12, 0);
        this.armLeft2.setRotationPoint(1.0F, 7.0F, 11.0F);
        this.armLeft2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.headTop = new ModelRenderer(this, 30, 6);
        this.headTop.setRotationPoint(-1.0F, 1.0F, -3.0F);
        this.headTop.addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.tentacleLeftMain = new ModelRenderer(this, 32, 13);
        this.tentacleLeftMain.setRotationPoint(6.0F, 7.0F, 2.0F);
        this.tentacleLeftMain.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.bodyMain = new ModelRenderer(this, 0, 26);
        this.bodyMain.setRotationPoint(-2.0F, 7.0F, -7.0F);
        this.bodyMain.addBox(0.0F, 0.0F, 0.0F, 8, 10, 14, 0.0F);
        this.eyeBridge = new ModelRenderer(this, 54, 4);
        this.eyeBridge.setRotationPoint(6.0F, 4.0F, -1.0F);
        this.eyeBridge.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.legRight = new ModelRenderer(this, 38, 13);
        this.legRight.setRotationPoint(1.0F, 18.0F, -5.0F);
        this.legRight.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.legLeft = new ModelRenderer(this, 42, 13);
        this.legLeft.setRotationPoint(1.0F, 18.0F, 4.0F);
        this.legLeft.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.eyeLeft = new ModelRenderer(this, 56, 0);
        this.eyeLeft.setRotationPoint(6.0F, 3.0F, 1.0F);
        this.eyeLeft.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.snoutTip = new ModelRenderer(this, 12, 6);
        this.snoutTip.setRotationPoint(7.0F, 5.0F, -1.0F);
        this.snoutTip.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.armRight2 = new ModelRenderer(this, 48, 0);
        this.armRight2.setRotationPoint(1.0F, 7.0F, -13.0F);
        this.armRight2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glRotatef(90, 0, 1, 0); // rotate 90 degrees

        this.armLeft1.render(f5);
        this.gloveLeft.render(f5);
        this.armRight1.render(f5);
        this.tentacleLeftBottom.render(f5);
        this.footLeft.render(f5);
        this.headMain.render(f5);
        this.snoutBottom.render(f5);
        this.snoutMain.render(f5);
        this.tentacleRightBottom.render(f5);
        this.gloveRight.render(f5);
        this.tentacleRightMain.render(f5);
        this.tentacleLeftTop.render(f5);
        this.footRight.render(f5);
        this.bodyBottom.render(f5);
        this.tentacleRightTop.render(f5);
        this.eyeRight.render(f5);
        this.armLeft2.render(f5);
        this.headTop.render(f5);
        this.tentacleLeftMain.render(f5);
        this.bodyMain.render(f5);
        this.eyeBridge.render(f5);
        this.legRight.render(f5);
        this.legLeft.render(f5);
        this.eyeLeft.render(f5);
        this.snoutTip.render(f5);
        this.armRight2.render(f5);

        GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
