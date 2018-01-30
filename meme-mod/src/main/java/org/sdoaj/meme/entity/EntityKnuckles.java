package org.sdoaj.meme.entity;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

import javax.annotation.Nullable;

public class EntityKnuckles extends EntityCreature implements IRangedAttackMob
{
    private boolean didSpit;

    public EntityKnuckles(World world)
    {
        super(world);
    }

    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackRanged(this, 1.25D, 40, 20.0F));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.2D));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.7D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityKnuckles.AIHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityKnuckles.AIDefendTarget(this));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
    }

    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_LLAMA_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.ENTITY_LLAMA_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_LLAMA_DEATH;
    }

    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_LLAMA_STEP, 0.15F, 1.0F);
    }

    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_LLAMA;
    }

    private void spit(EntityLivingBase target)
    {
        EntityKnucklesSpit spit = new EntityKnucklesSpit(this.world, this);
        double d0 = target.posX - this.posX;
        double d1 = target.getEntityBoundingBox().minY + (double)(target.height / 3.0F) - spit.posY;
        double d2 = target.posZ - this.posZ;
        float f = MathHelper.sqrt(d0 * d0 + d2 * d2) * 0.2F;
        spit.shoot(d0, d1 + (double)f, d2, 1.5F, 10.0F);
        this.world.playSound(null, this.posX, this.posY, this.posZ, SoundEvents.ENTITY_LLAMA_SPIT, this.getSoundCategory(), 1.0F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F);
        this.world.spawnEntity(spit);
        this.didSpit = true;
    }

    private void setDidSpit(boolean didSpit)
    {
        this.didSpit = didSpit;
    }

    public void fall(float distance, float damageMultiplier)
    {
        int i = MathHelper.ceil((distance * 0.5F - 3.0F) * damageMultiplier);

        if (i > 0)
        {
            if (distance >= 6.0F)
            {
                this.attackEntityFrom(DamageSource.FALL, (float)i);

                if (this.isBeingRidden())
                {
                    for (Entity entity : this.getRecursivePassengers())
                    {
                        entity.attackEntityFrom(DamageSource.FALL, (float)i);
                    }
                }
            }

            IBlockState iblockstate = this.world.getBlockState(new BlockPos(this.posX, this.posY - 0.2D - (double)this.prevRotationYaw, this.posZ));
            Block block = iblockstate.getBlock();

            if (iblockstate.getMaterial() != Material.AIR && !this.isSilent())
            {
                SoundType soundtype = block.getSoundType();
                this.world.playSound(null, this.posX, this.posY, this.posZ, soundtype.getStepSound(), this.getSoundCategory(), soundtype.getVolume() * 0.5F, soundtype.getPitch() * 0.75F);
            }
        }
    }

    /**
     * Attack the specified entity using a ranged attack.
     */
    public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor)
    {
        this.spit(target);
    }

    @Override
    public void setSwingingArms(boolean swingingArms) {}

    static class AIHurtByTarget extends EntityAIHurtByTarget {
        public AIHurtByTarget(EntityKnuckles knuckles)
        {
            super(knuckles, false);
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean shouldContinueExecuting() {
            if (this.taskOwner instanceof EntityKnuckles) {
                EntityKnuckles knuckles = (EntityKnuckles)this.taskOwner;

                if (knuckles.didSpit) {
                    knuckles.setDidSpit(false);
                    return false;
                }
            }

            return super.shouldContinueExecuting();
        }
    }

    static class AIDefendTarget extends EntityAINearestAttackableTarget<EntityPig> {
        public AIDefendTarget(EntityKnuckles knuckles) {
            super(knuckles, EntityPig.class, 16, false, true, null);
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute() {
            if (super.shouldExecute() && this.targetEntity != null) {
                return true;
            } else {
                this.taskOwner.setAttackTarget(null);
                return false;
            }
        }

        protected double getTargetDistance()
        {
            return super.getTargetDistance() * 0.25D;
        }
    }

}