/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.ai.goal.agent.creature;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.ai.goal.Goal;
import org.spongepowered.api.ai.goal.GoalBuilder;
import org.spongepowered.api.entity.living.Creature;

public interface WanderGoal extends Goal<Creature> {

    /**
     * Creates a new {@link Builder} to build a new
     * {@link WanderGoal}.
     *
     * @return A new builder
     */
    static Builder builder() {
        return Sponge.getRegistry().createBuilder(Builder.class);
    }

    /**
     * Gets the speed modifier at which the owning {@link Entity}
     * will move around to appear to "wander".
     *
     * @return The speed modifier
     */
    double getSpeed();

    /**
     * Sets the speed modifier at which the owning {@link Entity}
     * will move around to appear to "wander".
     *
     * @param speed The movement speed modifier
     * @return This goal, for chaining
     */
    WanderGoal setSpeed(double speed);

    /**
     * Gets the chance that the owning {@link Entity} will "wander".
     *
     * @return The chance that the owning entity will "wander"
     */
    int getExecutionChance();

    /**
     * Sets the chance that the owning {@link Entity} will perform
     * a "wander".
     *
     * @param executionChance The wandering chance
     * @return This goal, for chaining
     */
    WanderGoal setExecutionChance(int executionChance);

    interface Builder extends GoalBuilder<Creature, WanderGoal, Builder> {

        Builder speed(double speed);

        Builder executionChance(int executionChance);

    }
}
