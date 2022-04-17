package coda.cavedweller.common.entities.goals;

import coda.cavedweller.common.entities.CaveDwellerEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.Level;

import java.util.EnumSet;
import java.util.List;

public class RoarGoal extends Goal {
    private final CaveDwellerEntity mob;
    private final Level level;
    private int timer;
    private final int cooldown = 120;
    private int cooldownTimer;

    public RoarGoal(CaveDwellerEntity goalOwner) {
        this.mob = goalOwner;
        this.level = goalOwner.level;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK, Goal.Flag.JUMP));
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public void tick() {
        if (this.cooldownTimer < cooldown) {
            this.cooldownTimer++;
        } else {
            if (this.timer < 40) {
                this.timer++;
                mob.setRoaring(true);
                this.mob.getNavigation().stop();
                if (this.timer == 20) {
                    this.mob.playSound(SoundEvents.RAVAGER_ROAR, 1.0F, 1.0F);
                    List<LivingEntity> list = level.getEntitiesOfClass(LivingEntity.class, mob.getBoundingBox().inflate(5));
                    for (LivingEntity entity : list) {
                        entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100));
                    }
                }
            } else {
                this.timer = 0;
                this.cooldownTimer = 0;
                mob.setRoaring(false);
            }
        }
    }

    @Override
    public void stop() {
        mob.setRoaring(false);
    }
}
